package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RefreshConnectionsRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindComponentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic.MindListEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.AdlDefinitionEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindVisualIDRegistry;

/**
 * Allow creation of elements contained in host's parent
 * {@linkplain org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers.ItemSemanticEditPolicyHelper}
 * @author maroto
 *
 */
public class ParentCreationEditPolicy extends
		CreationEditPolicy {	
	
	protected Command getCreateElementAndViewCommand(CreateViewAndElementRequest request) {
		// get the element descriptor
		CreateElementRequestAdapter requestAdapter =
			request.getViewAndElementDescriptor().getCreateElementRequestAdapter();
		
		// get the semantic request
		CreateElementRequest createElementRequest =
			(CreateElementRequest) requestAdapter.getAdapter(
				CreateElementRequest.class);

		EditPart virtualHost = getHost();
		
		if (createElementRequest.getContainer() == null) {
			// complete the semantic request by filling in the host's semantic
			// element as the context
			
			// If the element can't be created in this view, fetch the parent view
			virtualHost = getVirtualHostFor(
							request.getViewAndElementDescriptor().getSemanticHint());
			
			View view = (View)virtualHost.getModel();
			EObject hostElement = ViewUtil.resolveSemanticElement(view);
			
			if (hostElement == null && view.getElement() == null) {
				hostElement = view;
			}			

			// Returns null if host is unresolvable so that trying to create a
			// new element in an unresolved shape will not be allowed.
			if (hostElement == null) {
				return null;
			}
			createElementRequest.setContainer(hostElement);
		}

		// get the create element command based on the elementdescriptor's
		// request
		Command createElementCommand =
			virtualHost.getCommand(
				new EditCommandRequestWrapper(
					(CreateElementRequest)requestAdapter.getAdapter(
						CreateElementRequest.class), request.getExtendedData()));

		if (createElementCommand == null) { 
			return UnexecutableCommand.INSTANCE;
		}		
		if(!createElementCommand.canExecute()){
			return createElementCommand;
		}
		// create the semantic create wrapper command
		SemanticCreateCommand semanticCommand =
			new SemanticCreateCommand(requestAdapter, createElementCommand);
		Command viewCommand = getCreateCommand(request);

		Command refreshConnectionCommand =
			virtualHost.getCommand(
				new RefreshConnectionsRequest(((List)request.getNewObject())));


		// form the compound command and return
        CompositeCommand cc = new CompositeCommand(semanticCommand.getLabel());
		cc.compose(semanticCommand);
		cc.compose(new CommandProxy(viewCommand));
		if ( refreshConnectionCommand != null ) {
			cc.compose(new CommandProxy(refreshConnectionCommand));
		}

		return new ICommandProxy(cc);
	}
	
	
	@Override
	protected Command getCreateCommand(CreateViewRequest request) {

        TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
            .getEditingDomain();
        CompositeTransactionalCommand cc = new CompositeTransactionalCommand(
            editingDomain, DiagramUIMessages.AddCommand_Label);
        
        Iterator descriptors = request.getViewDescriptors().iterator();

		while (descriptors.hasNext()) {
			CreateViewRequest.ViewDescriptor descriptor =
				(CreateViewRequest.ViewDescriptor)descriptors.next();

			EditPart virtualHost = getVirtualHostFor(descriptor.getSemanticHint());
			editingDomain = ((IGraphicalEditPart) virtualHost).getEditingDomain();
						
			CreateCommand createCommand =
				new CreateCommand(editingDomain,
					descriptor, 
					(View)(virtualHost.getModel()));

			cc.compose(createCommand);
		}
		return new ICommandProxy(cc.reduce());

	}
	
	
	
	
	
	/**
	 * Method to get the host even when creating by pointing on a sub edit part (such as the body).
	 * If the given item can't be created with the base host, take the parent and try again.
	 * Goes on until a host that works is found, or a component is reached.
	 * @param semanticHint the string semantic hint telling which item is to be created
	 * @return the host needed for the item
	 */
	public EditPart getVirtualHostFor(String semanticHint) {
		EditPart virtualHost = getHost();
		
		if (semanticHint != null) {
//			while (
			if(
					!(MindVisualIDRegistry.canCreateNode(
							(View)virtualHost.getModel(), 
							MindVisualIDRegistry.getVisualID(semanticHint))
					)
//					&& 
//					!(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(virtualHost)
//							instanceof MindComponentEditPart)
//					&&
//					!(virtualHost instanceof AdlDefinitionEditPart)
//					&&
//					!(MindGenericEditPartFactory.INSTANCE.getMindEditPartFor(virtualHost)
//							instanceof MindListEditPart)
					) 
			{
				virtualHost = virtualHost.getParent();
			}
		}
		
		return virtualHost;
	}
	
}