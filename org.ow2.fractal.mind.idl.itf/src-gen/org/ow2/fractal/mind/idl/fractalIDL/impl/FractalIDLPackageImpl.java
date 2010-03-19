/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator;
import org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator;
import org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.Declarator;
import org.ow2.fractal.mind.idl.fractalIDL.Declarators;
import org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator;
import org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.EnumMember;
import org.ow2.fractal.mind.idl.fractalIDL.EnumMemberList;
import org.ow2.fractal.mind.idl.fractalIDL.EnumReference;
import org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification;
import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLFactory;
import org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage;
import org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective;
import org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.ItfFile;
import org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.Parameter;
import org.ow2.fractal.mind.idl.fractalIDL.ParameterList;
import org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier;
import org.ow2.fractal.mind.idl.fractalIDL.PointerSpecification;
import org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification;
import org.ow2.fractal.mind.idl.fractalIDL.Qualified_PointerSpecification;
import org.ow2.fractal.mind.idl.fractalIDL.StructMember;
import org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification;
import org.ow2.fractal.mind.idl.fractalIDL.StructorUnionReference;
import org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition;
import org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier;
import org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification;
import org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier;
import org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIDLPackageImpl extends EPackageImpl implements FractalIDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itfFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedefSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedTypeSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structOrUnionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structOrUnionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structorUnionReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumMemberListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaratorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointerSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualified_PointerSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDirectDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeQualifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeSpecifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterQualifierEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FractalIDLPackageImpl()
  {
    super(eNS_URI, FractalIDLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FractalIDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FractalIDLPackage init()
  {
    if (isInited) return (FractalIDLPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI);

    // Obtain or create and register package
    FractalIDLPackageImpl theFractalIDLPackage = (FractalIDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FractalIDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FractalIDLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFractalIDLPackage.createPackageContents();

    // Initialize created meta-data
    theFractalIDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFractalIDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FractalIDLPackage.eNS_URI, theFractalIDLPackage);
    return theFractalIDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItfFile()
  {
    return itfFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Includes()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Constant()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Type()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Interface()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedefSpecification()
  {
    return typedefSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedefSpecification_QualifedType()
  {
    return (EReference)typedefSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedefSpecification_Dec()
  {
    return (EReference)typedefSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedTypeSpecification()
  {
    return qualifiedTypeSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedTypeSpecification_TypeQualifier()
  {
    return (EAttribute)qualifiedTypeSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedTypeSpecification_TypeSpec()
  {
    return (EReference)qualifiedTypeSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeSpecification()
  {
    return typeSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSpecification_TypeDefName()
  {
    return (EAttribute)typeSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSpecification_TypeSpecifier()
  {
    return (EAttribute)typeSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructOrUnionSpecification()
  {
    return structOrUnionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructOrUnionSpecification_Struct()
  {
    return (EAttribute)structOrUnionSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructOrUnionSpecification_Id()
  {
    return (EAttribute)structOrUnionSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructOrUnionDefinition()
  {
    return structOrUnionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructOrUnionDefinition_StructMember()
  {
    return (EReference)structOrUnionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructorUnionReference()
  {
    return structorUnionReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructMember()
  {
    return structMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructMember_QualType()
  {
    return (EReference)structMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructMember_Dec()
  {
    return (EReference)structMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumSpecification()
  {
    return enumSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumSpecification_Id()
  {
    return (EAttribute)enumSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDefinition()
  {
    return enumDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDefinition_EnumMemberList()
  {
    return (EReference)enumDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumReference()
  {
    return enumReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumMemberList()
  {
    return enumMemberListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumMember()
  {
    return enumMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMember_EnumMember()
  {
    return (EReference)enumMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumMember_Id()
  {
    return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarators()
  {
    return declaratorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarators_Dec()
  {
    return (EReference)declaratorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarators_DeclaratorList()
  {
    return (EReference)declaratorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarator()
  {
    return declaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarator_Pointer()
  {
    return (EReference)declaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarator_Dc()
  {
    return (EReference)declaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDeclarator()
  {
    return abstractDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDeclarator_Pointer()
  {
    return (EReference)abstractDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDeclarator_Dc()
  {
    return (EReference)abstractDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointerSpecification()
  {
    return pointerSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointerSpecification_QualifiedPointer()
  {
    return (EReference)pointerSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualified_PointerSpecification()
  {
    return qualified_PointerSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualified_PointerSpecification_TypeQualifier()
  {
    return (EAttribute)qualified_PointerSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectDeclarator()
  {
    return directDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirectDeclarator_Id()
  {
    return (EAttribute)directDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectDeclarator_Dec()
  {
    return (EReference)directDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirectDeclarator_Array()
  {
    return (EAttribute)directDeclaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDirectDeclarator()
  {
    return abstractDirectDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDirectDeclarator_Dec()
  {
    return (EReference)abstractDirectDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractDirectDeclarator_Array()
  {
    return (EAttribute)abstractDirectDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDefinition()
  {
    return constantDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantDefinition_Id()
  {
    return (EAttribute)constantDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDefinition()
  {
    return interfaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceDefinition_Fqn()
  {
    return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceDefinition_Fqn2()
  {
    return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDefinition_MethodDef()
  {
    return (EReference)interfaceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDefinition()
  {
    return methodDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_QualifiedTypeSpec()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodDefinition_Id()
  {
    return (EAttribute)methodDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_ParameterList()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Param()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Params()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_ParameterQualifier()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_QualifiedTypeSpec()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Dec()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_AbstractDec()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeDirective()
  {
    return includeDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeDirective_ImportedURI()
  {
    return (EAttribute)includeDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeDirective_IncludeID()
  {
    return (EAttribute)includeDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeQualifier()
  {
    return typeQualifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeSpecifier()
  {
    return typeSpecifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterQualifier()
  {
    return parameterQualifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLFactory getFractalIDLFactory()
  {
    return (FractalIDLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    itfFileEClass = createEClass(ITF_FILE);
    createEReference(itfFileEClass, ITF_FILE__INCLUDES);
    createEReference(itfFileEClass, ITF_FILE__CONSTANT);
    createEReference(itfFileEClass, ITF_FILE__TYPE);
    createEReference(itfFileEClass, ITF_FILE__INTERFACE);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);

    typedefSpecificationEClass = createEClass(TYPEDEF_SPECIFICATION);
    createEReference(typedefSpecificationEClass, TYPEDEF_SPECIFICATION__QUALIFED_TYPE);
    createEReference(typedefSpecificationEClass, TYPEDEF_SPECIFICATION__DEC);

    qualifiedTypeSpecificationEClass = createEClass(QUALIFIED_TYPE_SPECIFICATION);
    createEAttribute(qualifiedTypeSpecificationEClass, QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER);
    createEReference(qualifiedTypeSpecificationEClass, QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC);

    typeSpecificationEClass = createEClass(TYPE_SPECIFICATION);
    createEAttribute(typeSpecificationEClass, TYPE_SPECIFICATION__TYPE_DEF_NAME);
    createEAttribute(typeSpecificationEClass, TYPE_SPECIFICATION__TYPE_SPECIFIER);

    structOrUnionSpecificationEClass = createEClass(STRUCT_OR_UNION_SPECIFICATION);
    createEAttribute(structOrUnionSpecificationEClass, STRUCT_OR_UNION_SPECIFICATION__STRUCT);
    createEAttribute(structOrUnionSpecificationEClass, STRUCT_OR_UNION_SPECIFICATION__ID);

    structOrUnionDefinitionEClass = createEClass(STRUCT_OR_UNION_DEFINITION);
    createEReference(structOrUnionDefinitionEClass, STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER);

    structorUnionReferenceEClass = createEClass(STRUCTOR_UNION_REFERENCE);

    structMemberEClass = createEClass(STRUCT_MEMBER);
    createEReference(structMemberEClass, STRUCT_MEMBER__QUAL_TYPE);
    createEReference(structMemberEClass, STRUCT_MEMBER__DEC);

    enumSpecificationEClass = createEClass(ENUM_SPECIFICATION);
    createEAttribute(enumSpecificationEClass, ENUM_SPECIFICATION__ID);

    enumDefinitionEClass = createEClass(ENUM_DEFINITION);
    createEReference(enumDefinitionEClass, ENUM_DEFINITION__ENUM_MEMBER_LIST);

    enumReferenceEClass = createEClass(ENUM_REFERENCE);

    enumMemberListEClass = createEClass(ENUM_MEMBER_LIST);

    enumMemberEClass = createEClass(ENUM_MEMBER);
    createEReference(enumMemberEClass, ENUM_MEMBER__ENUM_MEMBER);
    createEAttribute(enumMemberEClass, ENUM_MEMBER__ID);

    declaratorsEClass = createEClass(DECLARATORS);
    createEReference(declaratorsEClass, DECLARATORS__DEC);
    createEReference(declaratorsEClass, DECLARATORS__DECLARATOR_LIST);

    declaratorEClass = createEClass(DECLARATOR);
    createEReference(declaratorEClass, DECLARATOR__POINTER);
    createEReference(declaratorEClass, DECLARATOR__DC);

    abstractDeclaratorEClass = createEClass(ABSTRACT_DECLARATOR);
    createEReference(abstractDeclaratorEClass, ABSTRACT_DECLARATOR__POINTER);
    createEReference(abstractDeclaratorEClass, ABSTRACT_DECLARATOR__DC);

    pointerSpecificationEClass = createEClass(POINTER_SPECIFICATION);
    createEReference(pointerSpecificationEClass, POINTER_SPECIFICATION__QUALIFIED_POINTER);

    qualified_PointerSpecificationEClass = createEClass(QUALIFIED_POINTER_SPECIFICATION);
    createEAttribute(qualified_PointerSpecificationEClass, QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER);

    directDeclaratorEClass = createEClass(DIRECT_DECLARATOR);
    createEAttribute(directDeclaratorEClass, DIRECT_DECLARATOR__ID);
    createEReference(directDeclaratorEClass, DIRECT_DECLARATOR__DEC);
    createEAttribute(directDeclaratorEClass, DIRECT_DECLARATOR__ARRAY);

    abstractDirectDeclaratorEClass = createEClass(ABSTRACT_DIRECT_DECLARATOR);
    createEReference(abstractDirectDeclaratorEClass, ABSTRACT_DIRECT_DECLARATOR__DEC);
    createEAttribute(abstractDirectDeclaratorEClass, ABSTRACT_DIRECT_DECLARATOR__ARRAY);

    constantDefinitionEClass = createEClass(CONSTANT_DEFINITION);
    createEAttribute(constantDefinitionEClass, CONSTANT_DEFINITION__ID);

    interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
    createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__FQN);
    createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__FQN2);
    createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__METHOD_DEF);

    methodDefinitionEClass = createEClass(METHOD_DEFINITION);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__QUALIFIED_TYPE_SPEC);
    createEAttribute(methodDefinitionEClass, METHOD_DEFINITION__ID);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__PARAMETER_LIST);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAM);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__PARAMETER_QUALIFIER);
    createEReference(parameterEClass, PARAMETER__QUALIFIED_TYPE_SPEC);
    createEReference(parameterEClass, PARAMETER__DEC);
    createEReference(parameterEClass, PARAMETER__ABSTRACT_DEC);

    includeDirectiveEClass = createEClass(INCLUDE_DIRECTIVE);
    createEAttribute(includeDirectiveEClass, INCLUDE_DIRECTIVE__IMPORTED_URI);
    createEAttribute(includeDirectiveEClass, INCLUDE_DIRECTIVE__INCLUDE_ID);

    // Create enums
    typeQualifierEEnum = createEEnum(TYPE_QUALIFIER);
    typeSpecifierEEnum = createEEnum(TYPE_SPECIFIER);
    parameterQualifierEEnum = createEEnum(PARAMETER_QUALIFIER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    typedefSpecificationEClass.getESuperTypes().add(this.getTypeDefinition());
    structOrUnionSpecificationEClass.getESuperTypes().add(this.getTypeDefinition());
    structOrUnionSpecificationEClass.getESuperTypes().add(this.getTypeSpecification());
    structOrUnionDefinitionEClass.getESuperTypes().add(this.getStructOrUnionSpecification());
    structorUnionReferenceEClass.getESuperTypes().add(this.getStructOrUnionSpecification());
    enumSpecificationEClass.getESuperTypes().add(this.getTypeDefinition());
    enumSpecificationEClass.getESuperTypes().add(this.getTypeSpecification());
    enumDefinitionEClass.getESuperTypes().add(this.getEnumSpecification());
    enumReferenceEClass.getESuperTypes().add(this.getEnumSpecification());
    enumMemberEClass.getESuperTypes().add(this.getEnumMemberList());

    // Initialize classes and features; add operations and parameters
    initEClass(itfFileEClass, ItfFile.class, "ItfFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItfFile_Includes(), this.getIncludeDirective(), null, "includes", null, 0, -1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItfFile_Constant(), this.getConstantDefinition(), null, "constant", null, 0, -1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItfFile_Type(), this.getTypeDefinition(), null, "type", null, 0, -1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItfFile_Interface(), this.getInterfaceDefinition(), null, "interface", null, 0, 1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typedefSpecificationEClass, TypedefSpecification.class, "TypedefSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedefSpecification_QualifedType(), this.getQualifiedTypeSpecification(), null, "qualifedType", null, 0, 1, TypedefSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypedefSpecification_Dec(), this.getDeclarators(), null, "dec", null, 0, 1, TypedefSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedTypeSpecificationEClass, QualifiedTypeSpecification.class, "QualifiedTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedTypeSpecification_TypeQualifier(), this.getTypeQualifier(), "typeQualifier", null, 0, -1, QualifiedTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualifiedTypeSpecification_TypeSpec(), this.getTypeSpecification(), null, "typeSpec", null, 0, 1, QualifiedTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeSpecificationEClass, TypeSpecification.class, "TypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeSpecification_TypeDefName(), ecorePackage.getEString(), "typeDefName", null, 0, 1, TypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeSpecification_TypeSpecifier(), this.getTypeSpecifier(), "typeSpecifier", null, 0, -1, TypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structOrUnionSpecificationEClass, StructOrUnionSpecification.class, "StructOrUnionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructOrUnionSpecification_Struct(), ecorePackage.getEString(), "struct", null, 0, 1, StructOrUnionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructOrUnionSpecification_Id(), ecorePackage.getEString(), "id", null, 0, 1, StructOrUnionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structOrUnionDefinitionEClass, StructOrUnionDefinition.class, "StructOrUnionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructOrUnionDefinition_StructMember(), this.getStructMember(), null, "structMember", null, 0, -1, StructOrUnionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structorUnionReferenceEClass, StructorUnionReference.class, "StructorUnionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structMemberEClass, StructMember.class, "StructMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructMember_QualType(), this.getQualifiedTypeSpecification(), null, "qualType", null, 0, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructMember_Dec(), this.getDeclarators(), null, "dec", null, 0, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumSpecificationEClass, EnumSpecification.class, "EnumSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumSpecification_Id(), ecorePackage.getEString(), "id", null, 0, 1, EnumSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumDefinitionEClass, EnumDefinition.class, "EnumDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumDefinition_EnumMemberList(), this.getEnumMemberList(), null, "enumMemberList", null, 0, 1, EnumDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumReferenceEClass, EnumReference.class, "EnumReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumMemberListEClass, EnumMemberList.class, "EnumMemberList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumMember_EnumMember(), this.getEnumMember(), null, "enumMember", null, 0, -1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumMember_Id(), ecorePackage.getEString(), "id", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaratorsEClass, Declarators.class, "Declarators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarators_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, Declarators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarators_DeclaratorList(), this.getDeclarator(), null, "declaratorList", null, 0, -1, Declarators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaratorEClass, Declarator.class, "Declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarator_Pointer(), this.getPointerSpecification(), null, "pointer", null, 0, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarator_Dc(), this.getDirectDeclarator(), null, "dc", null, 0, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeclaratorEClass, AbstractDeclarator.class, "AbstractDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractDeclarator_Pointer(), this.getPointerSpecification(), null, "pointer", null, 0, 1, AbstractDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractDeclarator_Dc(), this.getAbstractDirectDeclarator(), null, "dc", null, 0, 1, AbstractDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointerSpecificationEClass, PointerSpecification.class, "PointerSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointerSpecification_QualifiedPointer(), this.getQualified_PointerSpecification(), null, "qualifiedPointer", null, 0, -1, PointerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualified_PointerSpecificationEClass, Qualified_PointerSpecification.class, "Qualified_PointerSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualified_PointerSpecification_TypeQualifier(), this.getTypeQualifier(), "typeQualifier", null, 0, -1, Qualified_PointerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directDeclaratorEClass, DirectDeclarator.class, "DirectDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirectDeclarator_Id(), ecorePackage.getEString(), "id", null, 0, 1, DirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectDeclarator_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, DirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDirectDeclarator_Array(), ecorePackage.getEString(), "array", null, 0, -1, DirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDirectDeclaratorEClass, AbstractDirectDeclarator.class, "AbstractDirectDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractDirectDeclarator_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, AbstractDirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractDirectDeclarator_Array(), ecorePackage.getEString(), "array", null, 0, -1, AbstractDirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDefinitionEClass, ConstantDefinition.class, "ConstantDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceDefinition_Fqn(), ecorePackage.getEString(), "fqn", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceDefinition_Fqn2(), ecorePackage.getEString(), "fqn2", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceDefinition_MethodDef(), this.getMethodDefinition(), null, "methodDef", null, 0, -1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodDefinitionEClass, MethodDefinition.class, "MethodDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodDefinition_QualifiedTypeSpec(), this.getQualifiedTypeSpecification(), null, "qualifiedTypeSpec", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDefinition_ParameterList(), this.getParameterList(), null, "ParameterList", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Param(), this.getParameter(), null, "param", null, 0, 1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterList_Params(), this.getParameter(), null, "params", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_ParameterQualifier(), this.getParameterQualifier(), "ParameterQualifier", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_QualifiedTypeSpec(), this.getQualifiedTypeSpecification(), null, "qualifiedTypeSpec", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_AbstractDec(), this.getAbstractDeclarator(), null, "abstractDec", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeDirectiveEClass, IncludeDirective.class, "IncludeDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIncludeDirective_ImportedURI(), ecorePackage.getEString(), "importedURI", null, 0, 1, IncludeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIncludeDirective_IncludeID(), ecorePackage.getEString(), "includeID", null, 0, 1, IncludeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeQualifierEEnum, TypeQualifier.class, "TypeQualifier");
    addEEnumLiteral(typeQualifierEEnum, TypeQualifier.CONST);
    addEEnumLiteral(typeQualifierEEnum, TypeQualifier.VOLATILE);

    initEEnum(typeSpecifierEEnum, TypeSpecifier.class, "TypeSpecifier");
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.VOID);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.CHAR);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.SHORT);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.LONG);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.FLOAT);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.DOUBLE);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.SIGNED);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UNSIGNED);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.STRING);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT8_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT8_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT16_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT16_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT32_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT32_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT64_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT64_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INTPTR_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINTPTR_T);

    initEEnum(parameterQualifierEEnum, ParameterQualifier.class, "ParameterQualifier");
    addEEnumLiteral(parameterQualifierEEnum, ParameterQualifier.IN);
    addEEnumLiteral(parameterQualifierEEnum, ParameterQualifier.OUT);

    // Create resource
    createResource(eNS_URI);
  }

} //FractalIDLPackageImpl