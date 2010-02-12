package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;

import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ComponentReferenceHelper;
import adl.impl.TypeReferenceDefinitionImpl;

/**
 * <b>Class</b> <i>TypeReferenceDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class TypeReferenceDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link adl.custom.impl.TypeReferenceDefinitionCustomImpl#getNameFQN <em>getNameFQN</em>}</li>
 * <li>{@link adl.custom.impl.TypeReferenceDefinitionCustomImpl#setReferenceName <em>setReferenceName</em>}</li>
 * <li>{@link adl.custom.impl.TypeReferenceDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends TypeReferenceDefinitionImpl
 */
public class TypeReferenceDefinitionCustomImpl extends TypeReferenceDefinitionImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#getNameFQN()
	 */
	@Override
	public String getNameFQN() {
		if (nameFQN == null || !nameFQN.contains(".")) {
			nameFQN = getHelper().getNameFQN();
		}
		return super.getNameFQN();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#setReferenceName(java.lang.String)
	 */
	@Override
	public void setReferenceName(String newReferenceName) {
		String oldName = referenceName;
		referenceName = newReferenceName;
		if (newReferenceName != null && !newReferenceName.equals(oldName)) {
			nameFQN = getHelper().getNameFQN();
		}
		super.setReferenceName(newReferenceName);
	}

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return ComponentReferenceHelper
	 * 
	 * @author proustr
	 */
	public ComponentReferenceHelper getHelper() {
		ComponentReferenceHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, ComponentReferenceHelper.class);
		if (helper != null) {
			result = (ComponentReferenceHelper) helper;
		}
		return result;
	}

}
