/**
 * <copyright>
 * </copyright>
 *

 */
package fractalIDL.impl;

import fractalIDL.FractalIDLPackage;
import fractalIDL.StructMember;
import fractalIDL.StructOrUnionDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Or Union Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fractalIDL.impl.StructOrUnionDefinitionImpl#getStructMember <em>Struct Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructOrUnionDefinitionImpl extends StructOrUnionSpecificationImpl implements StructOrUnionDefinition
{
  /**
   * The cached value of the '{@link #getStructMember() <em>Struct Member</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructMember()
   * @generated
   * @ordered
   */
  protected EList<StructMember> structMember;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructOrUnionDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FractalIDLPackage.Literals.STRUCT_OR_UNION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StructMember> getStructMember()
  {
    if (structMember == null)
    {
      structMember = new EObjectContainmentEList<StructMember>(StructMember.class, this, FractalIDLPackage.STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER);
    }
    return structMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER:
        return ((InternalEList<?>)getStructMember()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER:
        return getStructMember();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER:
        getStructMember().clear();
        getStructMember().addAll((Collection<? extends StructMember>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER:
        getStructMember().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER:
        return structMember != null && !structMember.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructOrUnionDefinitionImpl
