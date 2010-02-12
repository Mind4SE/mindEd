package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.policies.InterfaceDefinitionCustomItemSemanticEditPolicy;
import org.ow2.fractal.mind.diagram.custom.figures.InterfaceDefinitionShape;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import org.ow2.fractal.mind.diagram.custom.providers.BorderItemDragTracker;

import adl.InterfaceDefinition;
import adl.Role;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;


/**
* Description :
* This class extends InterfaceDefinitionEditPart to implement custom interfaces' 
* graphical behavior. Implemented functionnalities are :
* - Change figure color and position depending on Role value (server or client)
* 
* @author RPU
* @date 13/07/2009
* @Version 
*
*/


public class InterfaceDefinitionCustomEditPart extends
		InterfaceDefinitionEditPart {

	@Override
	public DragTracker getDragTracker(Request request) {
		return new BorderItemDragTracker(this);
	}

	public InterfaceDefinitionCustomEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		// Extended drag and drop features
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				getPrimaryDragEditPolicy());
		// Extended creation features
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InterfaceDefinitionCustomItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());		
	}
	
	private InterfaceDefinitionShape interfaceDefinitionShape; 
	
	/**
	* Description :
	* F4E adapted function. Allows to initialize Figure depending 
	* on Role value by setting up the property role of 
	* InterfaceDefinitionShape class.
	*
	* Inputs :
	* Outputs :
	* - figure:NodeFigure � interface figure object.
	*
	* @author RPU
	* @date 13/07/2009
	* @Version 
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		interfaceDefinitionShape = (InterfaceDefinitionShape)createNodeShape();
		if(((View)getModel()).getElement() != null && ((View)getModel()).getElement() instanceof InterfaceDefinition){
			InterfaceDefinition interface_ = (InterfaceDefinition)((View)getModel()).getElement();
			if(interface_.getRole() == Role.PROVIDES){
				interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.PROVIDES);
			}
			else
			{
				interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.REQUIRES);
			}
		}
		figure.add(interfaceDefinitionShape);
		contentPane = setupContentPane(interfaceDefinitionShape);
		return figure;
	}

	/**
	* Description :
	* F4E adapted function. Allows to catch event notification when
	* role is modified on GMF eCore instance and so modify interface figure 
	* according to Role value. 
	*
	* Inputs :
	* - notification:Notification - EMF notification information object
	* Outputs :
	*
	* @author RPU
	* @date 13/07/2009
	* @Version 
	*/
	
	protected void handleNotificationEvent(Notification notification) {
		if(notification.getEventType() == Notification.SET 
				&& notification.getNotifier() instanceof InterfaceDefinition
				&& notification.getFeature() instanceof EAttribute 
				&& ((EAttribute)notification.getFeature()).getName().equals("role")){
			if(notification.getNewValue() instanceof Role && 
				((Role)notification.getNewValue()).equals(Role.PROVIDES) &&
				notification.getOldValue() instanceof Role && 
				((Role)notification.getOldValue()).equals(Role.REQUIRES)){
				if(interfaceDefinitionShape != null){
					interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.PROVIDES);
					interfaceDefinitionShape.revalidate();
					interfaceDefinitionShape.repaint();
				}
			}else if(notification.getNewValue() instanceof Role && 
					((Role)notification.getNewValue()).equals(Role.REQUIRES) &&
					notification.getOldValue() instanceof Role && 
					((Role)notification.getOldValue()).equals(Role.PROVIDES)){
				if(interfaceDefinitionShape != null){
					interfaceDefinitionShape.setRole(InterfaceDefinitionShape.Role.REQUIRES);
					interfaceDefinitionShape.revalidate();
					interfaceDefinitionShape.repaint();
				}
			}
		}
		super.handleNotificationEvent(notification);
	}
	
	@Override
	public void activate() {
		super.activate();
		if (ComponentHelper.isMerged(this)) 
				ComponentHelper.handleMergedElement(this);
	}
	
}
