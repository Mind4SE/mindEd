/***
 * eFrac
 * Copyright (C) 2007 INRIA, France Telecom, USTL
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Contact: yann.davin@gmail.com
 *
 * Author: Yann Davin
 */

package adl.custom.helpers;

import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentKind;
import adl.InterfaceDefinition;
import adl.custom.impl.AdlDefinitionCustomImpl;

/**
 * The Class HelperAdapter.
 * 
 * @param <T>  * 
 * @author Yann Davin
 */
public abstract class HelperAdapter<T extends EObject> extends AdapterImpl 
implements IHelper<T>{
	/** The t. */
	protected T t;
	protected ArchitectureDefinition ParentComponent;

	protected HashMap<Integer, List<EObject>> usedResources = new HashMap<Integer, List<EObject>>();
	
	/** In the Fractal ADL we can add xml comments. 'comments' is the list of xml comments attached
	 * to the target model element. 
	 */
	protected List<String> comments;
	
	/**
	 * Instantiates a new helper adapter.
	 * 
	 * @param t the t
	 */
	public HelperAdapter(T t){
		this.t = t;
	}
	
	/* (non-Javadoc)
	 * @see org.ow2.fractal.adl.extended.fractalextended.adapter.helper.Helper#getObject()
	 */
	public T getObject(){
		return this.t;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.AdapterImpl#isAdapterForType(java.lang.Object)
	 */
	public boolean isAdapterForType(Object type) {
		return type == IHelper.class;
	}

	/**
	 * Return the list of xml comments attached to the target model element.
	 */
	public List<String> getComments() {
		return comments;
	}

	/**
	 * Attach xml comments to the target model element.
	 */
	public void setComments(List<String> comments) {
		this.comments = comments;
	}	

	public ArchitectureDefinition getParentComponent()
	{
		EObject object = getObject();
		while(object!=null && !(object instanceof ArchitectureDefinition))
		{
			object = object.eContainer();
		}
		if(object!=null)return (ArchitectureDefinition) object;
		return null;
	}

	public ArchitectureDefinitionHelper getParentComponentHelper()
	{
		ArchitectureDefinition parent = getParentComponent();
		if(parent!=null)return (ArchitectureDefinitionHelper) parent.getHelper();
		return null;
	}
	
	
	/**
	 * <b>Method</b> <i>getMainDefinition</i>
	 * <p>
	 * This method recovers main definition of given object
	 * 
	 * @return main definition
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinition getMainDefinition() {
		EObject root = EcoreUtil.getRootContainer(getObject());
		if(root instanceof AdlDefinition)
		{
			return ((AdlDefinition)root).getArchitecturedefinition();
		}
		return null;
	}
	
	/**
	 * <b>Method</b> <i>getSimpleName</i>
	 * <p>
	 * This method returns the simple name of the current definition.
	 * 
	 * @return Simple name of definition associated to this helper.
	 * 
	 * @author proustr
	 */
	public String getSimpleName(ArchitectureDefinition definition) {
		String definitionName = definition.getName();
		if(definitionName.contains("."))
		{
			String[] charString = definitionName.split("\\.");
			return(charString[charString.length-1]);
		}
		return definitionName;	
	}
	
	public ComponentKind getComponentKind(){
		return ComponentKind.NULL;
	};
	
	public InterfaceDefinition getInterfaceByName(String interfaceName,
			String interfaceParentName) {
		return null;
	}

	public ArchitectureDefinition getComponentByName(String componentName) {
		return null;
	}

	public String getNameFQN() {
		return null;
	}
	
	public AdlDefinitionCustomImpl getAdlDefinition() {
		EObject tmpObject = EcoreUtil.getRootContainer(getObject());
		if(tmpObject==null || tmpObject.eClass().getClassifierID()!=AdlPackage.ADL_DEFINITION)return null;
		else return (AdlDefinitionCustomImpl) tmpObject;
	}
}
