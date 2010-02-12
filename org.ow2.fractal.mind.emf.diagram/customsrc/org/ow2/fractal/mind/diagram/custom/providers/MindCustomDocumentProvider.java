package org.ow2.fractal.mind.diagram.custom.providers;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.views.markers.ProblemsView;
import org.eclipse.ui.part.FileEditorInput;
import org.ow2.fractal.mind.diagram.custom.action.CustomValidateAction;
import org.ow2.fractal.mind.diagram.custom.edit.commands.MindDiagramUpdateAllCommand;

import adl.custom.impl.AdlDefinitionCustomImpl;
import adl.diagram.part.Messages;
import adl.diagram.part.MindDiagramEditorPlugin;
import adl.diagram.part.MindDiagramEditorUtil;
import adl.diagram.part.MindDiagramUpdateCommand;
import adl.diagram.part.MindDocumentProvider;

/**
 * Custom provider to get extended save features : <p>
 * - automatic validation on save<p>
 * - don't save if validation failed<p>
 * - don't save merged elements (delete then restore them)
 * @author maroto
 *
 */
@SuppressWarnings("restriction")
public class MindCustomDocumentProvider extends MindDocumentProvider {
	
	@SuppressWarnings("unchecked")
	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		
		try {			
			// Automatic validation with result
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			CustomValidateAction action = new CustomValidateAction(page, (IEditorInput) element);
			monitor.setTaskName("Validation");
			action.run(monitor);
			if (!action.result) {
				// If validation failed, do not save
				ProblemsView problem = (ProblemsView) page.findView("org.eclipse.ui.views.ProblemView");
				page.activate(problem);
				monitor.setCanceled(true);
				return;
			}
		}
		catch(Exception e) {
			MindDiagramEditorPlugin.getInstance().logError("Problems occured during validation", e);
			return;
		}
		
		
		// Prepare the transaction that will prepare the main definition
		// All merged items are deleted because they must not be serialized
		TransactionalEditingDomain domain = getDiagramDocument(element).getEditingDomain();
		TransactionImpl transaction = new TransactionImpl(domain, false);
		EObject root = ((DiagramImpl)document.getContent()).getElement();
		
		ResourceSetInfo info = getResourceSetInfo(element);
		if (info != null) {
			if (!overwrite && !info.isSynchronized()) {
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								MindDiagramEditorPlugin.ID,
								IResourceStatus.OUT_OF_SYNC_LOCAL,
								Messages.MindDocumentProvider_UnsynchronizedFileSaveError,
								null));
			}
			info.stopResourceListening();
			fireElementStateChanging(element);
			try {
				monitor.beginTask(
						Messages.MindDocumentProvider_SaveDiagramTask, info
								.getResourceSet().getResources().size() + 1); //"Saving diagram"
				
				// Delete merged elements from the model before saving
				// TEMPORARY LOT1
				// DO NOTHING
				
				for (Iterator/*<org.eclipse.emf.ecore.resource.Resource>*/it = info
						.getLoadedResourcesIterator(); it.hasNext();) {
					Resource nextResource = (Resource) it.next();
					// TEMPORARY LOT1
					// NO SAVE OF EMF RESOURCE
					if (!(nextResource instanceof GMFResource)) continue;
					// END TEMPORARY LOT1
					monitor.setTaskName(NLS.bind(
							Messages.MindDocumentProvider_SaveNextResourceTask,
							nextResource.getURI()));
					if (nextResource.isLoaded()
							&& !info.getEditingDomain()
									.isReadOnly(nextResource)) {
						try {
							nextResource.save(MindDiagramEditorUtil
									.getSaveOptions());
						} catch (IOException e) {
							fireElementStateChangeFailed(element);
							throw new CoreException(new Status(IStatus.ERROR,
									MindDiagramEditorPlugin.ID,
									EditorStatusCodes.RESOURCE_FAILURE, e
											.getLocalizedMessage(), null));
						}
					}
					monitor.worked(1);
				}
				
				// Restore merged elements
				// TEMPORARY LOT1
				// DO NOTHING
				
				// Update diagram
				// TEMPORARY LOT1
				// DO NOTHING
					
				monitor.done();
				info.setModificationStamp(computeModificationStamp(info));
			} catch (RuntimeException x) {
				fireElementStateChangeFailed(element);
				throw x;
			} finally {
				info.startResourceListening();
			}
		} else {
			URI newResoruceURI;
			List affectedFiles = null;
			if (element instanceof FileEditorInput) {
				IFile newFile = ((FileEditorInput) element).getFile();
				affectedFiles = Collections.singletonList(newFile);
				newResoruceURI = URI.createPlatformResourceURI(newFile
						.getFullPath().toString(), true);
			} else if (element instanceof URIEditorInput) {
				newResoruceURI = ((URIEditorInput) element).getURI();
			} else {
				fireElementStateChangeFailed(element);
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								MindDiagramEditorPlugin.ID,
								0,
								NLS
										.bind(
												Messages.MindDocumentProvider_IncorrectInputError,
												new Object[] {
														element,
														"org.eclipse.ui.part.FileEditorInput", "org.eclipse.emf.common.ui.URIEditorInput" }), //$NON-NLS-1$ //$NON-NLS-2$ 
								null));
			}
			if (false == document instanceof IDiagramDocument) {
				fireElementStateChangeFailed(element);
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								MindDiagramEditorPlugin.ID,
								0,
								"Incorrect document used: " + document + " instead of org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument", null)); //$NON-NLS-1$ //$NON-NLS-2$
			}
			IDiagramDocument diagramDocument = (IDiagramDocument) document;
			final Resource newResource = diagramDocument.getEditingDomain()
					.getResourceSet().createResource(newResoruceURI);
			final Diagram diagramCopy = (Diagram) EcoreUtil
					.copy(diagramDocument.getDiagram());
			try {
				new AbstractTransactionalCommand(diagramDocument
						.getEditingDomain(), NLS.bind(
						Messages.MindDocumentProvider_SaveAsOperation,
						diagramCopy.getName()), affectedFiles) {
					protected CommandResult doExecuteWithResult(
							IProgressMonitor monitor, IAdaptable info)
							throws ExecutionException {
						newResource.getContents().add(diagramCopy);
						return CommandResult.newOKCommandResult();
					}
				}.execute(monitor, null);
				newResource.save(MindDiagramEditorUtil.getSaveOptions());
			} catch (ExecutionException e) {
				fireElementStateChangeFailed(element);
				throw new CoreException(new Status(IStatus.ERROR,
						MindDiagramEditorPlugin.ID, 0, e.getLocalizedMessage(),
						null));
			} catch (IOException e) {
				fireElementStateChangeFailed(element);
				throw new CoreException(new Status(IStatus.ERROR,
						MindDiagramEditorPlugin.ID, 0, e.getLocalizedMessage(),
						null));
			}
			newResource.unload();
		}
	}
	
	@SuppressWarnings("unchecked")
	private long computeModificationStamp(ResourceSetInfo info) {
		int result = 0;
		for (Iterator/*<org.eclipse.emf.ecore.resource.Resource>*/it = info
				.getLoadedResourcesIterator(); it.hasNext();) {
			Resource nextResource = (Resource) it.next();
			IFile file = WorkspaceSynchronizer.getFile(nextResource);
			if (file != null) {
				if (file.getLocation() != null) {
					result += file.getLocation().toFile().lastModified();
				} else {
					result += file.getModificationStamp();
				}
			}
		}
		return result;
	}
	
	protected void restoreMainDefinitionAfterSave(AdlDefinitionCustomImpl root) {
		// TEMPORARY LOT1
		// DO NOTHING
	}

	protected void prepareMainDefinitionBeforeSave(AdlDefinitionCustomImpl root) {
		// TEMPORARY LOT1
		// DO NOTHING
	}
	
}
