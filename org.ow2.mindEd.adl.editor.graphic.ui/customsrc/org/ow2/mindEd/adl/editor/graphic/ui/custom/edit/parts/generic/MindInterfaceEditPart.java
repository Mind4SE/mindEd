package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.generic;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.providers.BorderItemDragTracker;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.OpenDefinitionEditPolicy;

public class MindInterfaceEditPart extends MindEditPart {
	
	public MindInterfaceEditPart(GraphicalEditPart editPart, int vID) {
		super(editPart,vID, TYPE_INTERFACE);
	}
	
	public MindInterfaceEditPart(GraphicalEditPart editPart, int vID, int mindType) {
		super(editPart, vID, mindType);
	}

	
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		realEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, 
				new OpenDefinitionEditPolicy());
	}

	@Override
	public DragTracker getDragTracker(Request request) {
		return new BorderItemDragTracker(realEditPart);
	}
	
	@Override
	public boolean addFixedChild(EditPart childEditPart) {
		// To open the referenced definition on double clic
		childEditPart.installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDefinitionEditPolicy());
		return false;
	}
	
}