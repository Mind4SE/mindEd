package org.ow2.mindEd.adl.editor.graphic.ui.custom.wizards;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class WizardPagePrimitiveMain extends WizardPage{

	Composite topLevel;
	Composite treeComposite;
	
	Text primitiveName;
	
	Button extendsButton;
	Button overrideButton;
	Button anonymousButton;
	
	TreeViewer treeViewer;
	private int style = SWT.BORDER | SWT.SINGLE;
	protected Text uriField;
	
	protected final int HEIGHT_DATA = 200;
	protected final int WIDTH_DATA = 200;
	
	WizardPrimitiveComponent wizParent;
	
	protected WizardPagePrimitiveMain(String pageName, WizardPrimitiveComponent parent) {
		super(pageName);
		setTitle("Personal Information");
		setDescription("Please enter your personal information");
		wizParent = parent;
	}

	@Override
	public void createControl(Composite parent) {
		topLevel = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 3;
			topLevel.setLayout(layout);
			topLevel.setFont(parent.getFont());
			setControl(topLevel);
		}
		
        new Label(topLevel,SWT.NONE).setText("Name");
        primitiveName = new Text(topLevel,SWT.BORDER);
        {
        	primitiveName.setFont(parent.getFont());
        	GridData constraint = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
        	constraint.horizontalSpan = 2;
        	primitiveName.setLayoutData(constraint);
        	primitiveName.setFont(parent.getFont());
        }
        
        new Label(topLevel,SWT.NONE).setText("Type");
        
        
        extendsButton = new Button(topLevel, SWT.RADIO);
        {
        	GridData Constraint = new GridData();
            Constraint.horizontalAlignment = SWT.END;
            extendsButton.setLayoutData(Constraint);

        }
        new Label(topLevel,SWT.NONE).setText("Extends");
        
        overrideButton = new Button(topLevel, SWT.RADIO);
        new Label(topLevel,SWT.NONE).setText("Override");
        anonymousButton = new Button(topLevel, SWT.RADIO);
        new Label(topLevel,SWT.NONE).setText("Anonymous");
        {
        	GridData constraint = new GridData();
            constraint.horizontalAlignment = SWT.END;
            constraint.horizontalSpan = 2;
            overrideButton.setLayoutData(constraint);
            anonymousButton.setLayoutData(constraint);
        }
        createRadioListener();
        
        createTreeComposite(topLevel);
		
	}

	private void createTreeComposite(Composite parent) {
		treeComposite = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout ();
			layout.numColumns = 1;
			treeComposite.setLayout(layout);
        	treeComposite.setVisible(true);
        	treeComposite.setFont(parent.getFont());

        	GridData constraint = new GridData(SWT.FILL, SWT.FILL, true, false);
        	constraint.horizontalSpan = 3;
//       	constraint.horizontalAlignment = SWT.END;
        	treeComposite.setLayoutData(constraint);
        	
		}
		
		treeViewer = new TreeViewer (new Tree (treeComposite, style));
        treeViewer.setContentProvider(new WorkbenchContentProvider());
        treeViewer.setLabelProvider(new WorkbenchLabelProvider());

        Tree treeWidget = treeViewer.getTree();
        treeWidget.setFont(treeComposite.getFont());
        {
		    GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		    data.heightHint = HEIGHT_DATA;
		    treeWidget.setLayoutData(data);
		}
        
        treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
        uriField = new Text(treeComposite, SWT.BORDER);
        uriField.setFont(treeComposite.getFont());
        {
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
        	uriField.setLayoutData(data);
        }
        
        createTreeListener();
        
        TreeFilterExtension treeFilter = new TreeFilterExtension(".adl"); 
        treeViewer.addFilter(treeFilter);
		
	}

	private void createTreeListener() {
		// TODO Auto-generated method stub
        treeViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			@SuppressWarnings("restriction")
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				TreeSelection treeSelection= (TreeSelection) event.getSelection();
				TreePath treePath = treeSelection.getPaths()[0];
				if(treePath.getLastSegment() instanceof Project)
				{
					Project selectedItem = (Project)treePath.getLastSegment();
					uriField.setText(selectedItem.getFullPath().toString());
				}
				else if(treePath.getLastSegment() instanceof Folder)
				{
					Folder selectedItem = (Folder)treePath.getLastSegment();
					uriField.setText(selectedItem.getFullPath().toString());
				}
				else if (treePath.getLastSegment() instanceof File)
				{
					File selectedItem = (File)treePath.getLastSegment();
					
					uriField.setText(selectedItem.getFullPath().toString());
				}
			}
		});
        
        treeViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {

	            ISelection selection = event.getSelection();
	            if (selection instanceof IStructuredSelection) {
	                Object item = ((IStructuredSelection) selection)
	                        .getFirstElement();
	                if (treeViewer.getExpandedState(item)) {
	                	treeViewer.collapseToLevel(item, 1);
					} else {
						treeViewer.expandToLevel(item, 1);
					}
	            }

            }
        });
	}

	private void createRadioListener() {
		
		extendsButton.addSelectionListener(new SelectionListener()		
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(extendsButton.getSelection())
				{
					treeComposite.setVisible(true);
					wizParent.disableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		overrideButton.addSelectionListener(new SelectionListener()		
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(overrideButton.getSelection())
				{
					treeComposite.setVisible(true);
					wizParent.enableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
		anonymousButton.addSelectionListener(new SelectionListener()		
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(anonymousButton.getSelection())
				{
					treeComposite.setVisible(false);
					wizParent.enableSecondPage();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		
	}

}