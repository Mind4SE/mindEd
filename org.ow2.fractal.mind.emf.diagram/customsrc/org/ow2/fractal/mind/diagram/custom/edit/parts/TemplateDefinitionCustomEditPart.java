package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindEditPart;
import org.ow2.fractal.mind.diagram.custom.edit.parts.generic.MindGenericEditPartFactory;
import org.ow2.fractal.mind.diagram.custom.helpers.ComponentHelper;
import adl.diagram.edit.parts.TemplateDefinitionEditPart;

public class TemplateDefinitionCustomEditPart extends
		TemplateDefinitionEditPart {
	
	public TemplateDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected IFigure setupContentPane(IFigure nodeShape) {
		IFigure shape = genericEditPart.setupContentPane(nodeShape);
		if (shape != null) return shape;
		return super.setupContentPane(nodeShape);
	}
	
	@Override
	public void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		genericEditPart.createDefaultEditPolicies();
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		DragTracker tracker = genericEditPart.getDragTracker(request);
		if (tracker == null)
			tracker = super.getDragTracker(request);
		return tracker;
	}
	
	
	@Override
	public void activate() {
		super.activate();
		genericEditPart.activate();
	}
	
	public void refresh() {
		super.refresh();
		genericEditPart.refresh();
	}
	
	
	public NodeFigure createNodePlate() {
		NodeFigure fig = genericEditPart.createNodePlate();
		if (fig == null)
			fig = super.createNodePlate();
		return fig;
	}
	
}
