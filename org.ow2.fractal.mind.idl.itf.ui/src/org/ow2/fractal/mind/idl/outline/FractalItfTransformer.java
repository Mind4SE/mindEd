package org.ow2.fractal.mind.idl.outline;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.common.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.common.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;
import org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.EnumReference;
import org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective;
import org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.ItfFile;
import org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.Parameter;
import org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification;

/**
 * customization of the outline structure
 * 
 * @author Damien Fournier
 */


//-----------------------//
// Customize Nodes label //
//-----------------------//


public class FractalItfTransformer extends
		AbstractDeclarativeSemanticModelTransformer {

	/**
	 * Customize outline label for Itf File object
	 * 
	 * @param obj
	 *            - model object
	 * @param parentNode
	 *            - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(ItfFile obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("Interface Definition");
		return node;
	}

	/**
	 * Customize outline label for Interface Definition object
	 * 
	 * @param obj
	 *            - model object
	 * @param parentNode
	 *            - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(InterfaceDefinition obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		// Add 'interface' to the label
		node.setLabel("interface " + obj.getFqn());
		return node;
	}

	/**
	 * Customize outline label for Constant Definition object
	 * 
	 * @param obj
	 *            - model object
	 * @param parentNode
	 *            - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(ConstantDefinition obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);

		String label = obj.getId();
		// Add 'define' to the label
		node.setLabel("define " + label);
		return node;
	}

	/**
	 * Customize outline label for Type definition
	 * 
	 * @param obj
	 *            - model object
	 * @param parentNode
	 *            - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(TypedefSpecification obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);

		String label = "typedef";

		if (obj.getQualifedType().getTypeSpec().getTypeDefName() != null)
			label = label + " "
					+ obj.getQualifedType().getTypeSpec().getTypeDefName();

		node.setLabel(label);
		return node;
	}

	/**
	 * Customize outline label for struct or union
	 * 
	 * @param obj
	 *            - model object
	 * @param parentNode
	 *            - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(StructOrUnionDefinition obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel(obj.getStruct() + " " + obj.getId());
		return node;
	}

	/**
	 * Customize outline label for enumeration
	 * 
	 * @param obj
	 *            - model object
	 * @param parentNode
	 *            - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(EnumDefinition obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("enum " + obj.getId());
		return node;
	}
	
	/**
	 * Customize outline label for enumeration
	 * 
	 * @param obj - model object
	 * @param parentNode - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(EnumReference obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		node.setLabel("enum " + obj.getId());
		return node;
	}
	
	/**
	 * Customize outline label for methods
	 * 
	 * @param obj - model object
	 * @param parentNode - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(MethodDefinition obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);

		String label = obj.getId() + "(";

		if (obj.getParameterList().getParam() != null)

			try {
				label = label
						+ obj.getParameterList().getParam()
								.getQualifiedTypeSpec().getTypeSpec()
								.getTypeSpecifier().get(0);
			}
			// If paramater type is not a primitive type then an exception is
			// raised
			catch (Exception e) {
				label = label
						+ obj.getParameterList().getParam()
								.getQualifiedTypeSpec().getTypeSpec()
								.getTypeDefName();
			}

		for (Parameter parameter : obj.getParameterList().getParams()) {

			try {
				label = label
						+ ","
						+ parameter.getQualifiedTypeSpec().getTypeSpec()
								.getTypeSpecifier().get(0);
			}
			// If paramater type is not a primitive type then an exception is
			// raised
			catch (Exception e) {

				label = label
						+ ","
						+ parameter.getQualifiedTypeSpec().getTypeSpec()
								.getTypeDefName();
			}
		}

		label = label + ")";

		node.setLabel(label);
		return node;
	}
	
	/**
	 * Customize outline label for includes
	 * 
	 * @param obj - model object
	 * @param parentNode - parent node
	 * @return Custom node for the Outline view
	 */

	public ContentOutlineNode createNode(IncludeDirective obj,
			ContentOutlineNode parentNode) {
		ContentOutlineNode node = super.newOutlineNode(obj, parentNode);
		String label = (obj.getImportedURI() != null) ? obj.getImportedURI()
				: obj.getIncludeID().substring(1,
						obj.getIncludeID().length() - 1);
		node.setLabel(label);
		return node;
	}
	
	
	//--------------------------//
	// Customize Children nodes //
	//--------------------------//
	

	public List<EObject> getChildren(ConstantDefinition obj) {
		return NO_CHILDREN;
	}

	public List<EObject> getChildren(MethodDefinition obj) {
		return NO_CHILDREN;
	}

	public List<EObject> getChildren(TypedefSpecification obj) {
		return NO_CHILDREN;
	}

	public List<EObject> getChildren(StructOrUnionDefinition obj) {
		return NO_CHILDREN;
	}

	public List<EObject> getChildren(EnumDefinition obj) {
		return NO_CHILDREN;
	}

	public List<EObject> getChildren(EnumReference obj) {
		return NO_CHILDREN;
	}

	public List<EObject> getChildren(ItfFile obj) {
		return obj.eContents();
	}
}