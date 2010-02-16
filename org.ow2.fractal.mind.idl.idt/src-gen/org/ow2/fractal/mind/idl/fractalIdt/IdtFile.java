/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIdt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective;
import org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Idt File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.idl.fractalIdt.IdtFile#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage#getIdtFile()
 * @model
 * @generated
 */
public interface IdtFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage#getIdtFile_Includes()
   * @model containment="true"
   * @generated
   */
  EList<IncludeDirective> getIncludes();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage#getIdtFile_Type()
   * @model containment="true"
   * @generated
   */
  EList<TypeDefinition> getType();

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference list.
   * @see org.ow2.fractal.mind.idl.fractalIdt.FractalIdtPackage#getIdtFile_Constant()
   * @model containment="true"
   * @generated
   */
  EList<ConstantDefinition> getConstant();

} // IdtFile
