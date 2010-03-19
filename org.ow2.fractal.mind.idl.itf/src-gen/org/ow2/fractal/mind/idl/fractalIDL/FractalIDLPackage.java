/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.fractal.mind.idl.fractalIDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ow2.fractal.mind.idl.fractalIDL.FractalIDLFactory
 * @model kind="package"
 * @generated
 */
public interface FractalIDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fractalIDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/fractal/mind/idl/FractalItf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fractalIDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalIDLPackage eINSTANCE = org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ItfFileImpl <em>Itf File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ItfFileImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getItfFile()
   * @generated
   */
  int ITF_FILE = 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__INCLUDES = 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__CONSTANT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__TYPE = 2;

  /**
   * The feature id for the '<em><b>Interface</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE__INTERFACE = 3;

  /**
   * The number of structural features of the '<em>Itf File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITF_FILE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.TypeDefinitionImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.TypedefSpecificationImpl <em>Typedef Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.TypedefSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypedefSpecification()
   * @generated
   */
  int TYPEDEF_SPECIFICATION = 2;

  /**
   * The feature id for the '<em><b>Qualifed Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SPECIFICATION__QUALIFED_TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SPECIFICATION__DEC = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typedef Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SPECIFICATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.QualifiedTypeSpecificationImpl <em>Qualified Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.QualifiedTypeSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getQualifiedTypeSpecification()
   * @generated
   */
  int QUALIFIED_TYPE_SPECIFICATION = 3;

  /**
   * The feature id for the '<em><b>Type Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER = 0;

  /**
   * The feature id for the '<em><b>Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC = 1;

  /**
   * The number of structural features of the '<em>Qualified Type Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_TYPE_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.TypeSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecification()
   * @generated
   */
  int TYPE_SPECIFICATION = 4;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFICATION__TYPE_DEF_NAME = 0;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFICATION__TYPE_SPECIFIER = 1;

  /**
   * The number of structural features of the '<em>Type Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionSpecificationImpl <em>Struct Or Union Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionSpecification()
   * @generated
   */
  int STRUCT_OR_UNION_SPECIFICATION = 5;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__STRUCT = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION__ID = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Struct Or Union Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionDefinitionImpl <em>Struct Or Union Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionDefinitionImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionDefinition()
   * @generated
   */
  int STRUCT_OR_UNION_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__TYPE_DEF_NAME = STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__TYPE_SPECIFIER = STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__STRUCT = STRUCT_OR_UNION_SPECIFICATION__STRUCT;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__ID = STRUCT_OR_UNION_SPECIFICATION__ID;

  /**
   * The feature id for the '<em><b>Struct Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER = STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Or Union Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_OR_UNION_DEFINITION_FEATURE_COUNT = STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructorUnionReferenceImpl <em>Structor Union Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructorUnionReferenceImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructorUnionReference()
   * @generated
   */
  int STRUCTOR_UNION_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__TYPE_DEF_NAME = STRUCT_OR_UNION_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__TYPE_SPECIFIER = STRUCT_OR_UNION_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Struct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__STRUCT = STRUCT_OR_UNION_SPECIFICATION__STRUCT;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE__ID = STRUCT_OR_UNION_SPECIFICATION__ID;

  /**
   * The number of structural features of the '<em>Structor Union Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTOR_UNION_REFERENCE_FEATURE_COUNT = STRUCT_OR_UNION_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructMemberImpl <em>Struct Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructMemberImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructMember()
   * @generated
   */
  int STRUCT_MEMBER = 8;

  /**
   * The feature id for the '<em><b>Qual Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__QUAL_TYPE = 0;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER__DEC = 1;

  /**
   * The number of structural features of the '<em>Struct Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumSpecificationImpl <em>Enum Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumSpecification()
   * @generated
   */
  int ENUM_SPECIFICATION = 9;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION__TYPE_DEF_NAME = TYPE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION__TYPE_SPECIFIER = TYPE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION__ID = TYPE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Enum Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SPECIFICATION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumDefinitionImpl <em>Enum Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumDefinitionImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumDefinition()
   * @generated
   */
  int ENUM_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__TYPE_DEF_NAME = ENUM_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__TYPE_SPECIFIER = ENUM_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__ID = ENUM_SPECIFICATION__ID;

  /**
   * The feature id for the '<em><b>Enum Member List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION__ENUM_MEMBER_LIST = ENUM_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DEFINITION_FEATURE_COUNT = ENUM_SPECIFICATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumReferenceImpl <em>Enum Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumReferenceImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumReference()
   * @generated
   */
  int ENUM_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Type Def Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE__TYPE_DEF_NAME = ENUM_SPECIFICATION__TYPE_DEF_NAME;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE__TYPE_SPECIFIER = ENUM_SPECIFICATION__TYPE_SPECIFIER;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE__ID = ENUM_SPECIFICATION__ID;

  /**
   * The number of structural features of the '<em>Enum Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_REFERENCE_FEATURE_COUNT = ENUM_SPECIFICATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberListImpl <em>Enum Member List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberListImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumMemberList()
   * @generated
   */
  int ENUM_MEMBER_LIST = 12;

  /**
   * The number of structural features of the '<em>Enum Member List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberImpl <em>Enum Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumMember()
   * @generated
   */
  int ENUM_MEMBER = 13;

  /**
   * The feature id for the '<em><b>Enum Member</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__ENUM_MEMBER = ENUM_MEMBER_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__ID = ENUM_MEMBER_LIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_FEATURE_COUNT = ENUM_MEMBER_LIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorsImpl <em>Declarators</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorsImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getDeclarators()
   * @generated
   */
  int DECLARATORS = 14;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATORS__DEC = 0;

  /**
   * The feature id for the '<em><b>Declarator List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATORS__DECLARATOR_LIST = 1;

  /**
   * The number of structural features of the '<em>Declarators</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATORS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorImpl <em>Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getDeclarator()
   * @generated
   */
  int DECLARATOR = 15;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__POINTER = 0;

  /**
   * The feature id for the '<em><b>Dc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR__DC = 1;

  /**
   * The number of structural features of the '<em>Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDeclaratorImpl <em>Abstract Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDeclaratorImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getAbstractDeclarator()
   * @generated
   */
  int ABSTRACT_DECLARATOR = 16;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATOR__POINTER = 0;

  /**
   * The feature id for the '<em><b>Dc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATOR__DC = 1;

  /**
   * The number of structural features of the '<em>Abstract Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.PointerSpecificationImpl <em>Pointer Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.PointerSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getPointerSpecification()
   * @generated
   */
  int POINTER_SPECIFICATION = 17;

  /**
   * The feature id for the '<em><b>Qualified Pointer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_SPECIFICATION__QUALIFIED_POINTER = 0;

  /**
   * The number of structural features of the '<em>Pointer Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.Qualified_PointerSpecificationImpl <em>Qualified Pointer Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.Qualified_PointerSpecificationImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getQualified_PointerSpecification()
   * @generated
   */
  int QUALIFIED_POINTER_SPECIFICATION = 18;

  /**
   * The feature id for the '<em><b>Type Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER = 0;

  /**
   * The number of structural features of the '<em>Qualified Pointer Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_POINTER_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.DirectDeclaratorImpl <em>Direct Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.DirectDeclaratorImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getDirectDeclarator()
   * @generated
   */
  int DIRECT_DECLARATOR = 19;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_DECLARATOR__ID = 0;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_DECLARATOR__DEC = 1;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_DECLARATOR__ARRAY = 2;

  /**
   * The number of structural features of the '<em>Direct Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_DECLARATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDirectDeclaratorImpl <em>Abstract Direct Declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDirectDeclaratorImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getAbstractDirectDeclarator()
   * @generated
   */
  int ABSTRACT_DIRECT_DECLARATOR = 20;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DIRECT_DECLARATOR__DEC = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DIRECT_DECLARATOR__ARRAY = 1;

  /**
   * The number of structural features of the '<em>Abstract Direct Declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DIRECT_DECLARATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ConstantDefinitionImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getConstantDefinition()
   * @generated
   */
  int CONSTANT_DEFINITION = 21;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION__ID = 0;

  /**
   * The number of structural features of the '<em>Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.InterfaceDefinitionImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getInterfaceDefinition()
   * @generated
   */
  int INTERFACE_DEFINITION = 22;

  /**
   * The feature id for the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__FQN = 0;

  /**
   * The feature id for the '<em><b>Fqn2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__FQN2 = 1;

  /**
   * The feature id for the '<em><b>Method Def</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION__METHOD_DEF = 2;

  /**
   * The number of structural features of the '<em>Interface Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.MethodDefinitionImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getMethodDefinition()
   * @generated
   */
  int METHOD_DEFINITION = 23;

  /**
   * The feature id for the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__QUALIFIED_TYPE_SPEC = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__ID = 1;

  /**
   * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION__PARAMETER_LIST = 2;

  /**
   * The number of structural features of the '<em>Method Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterListImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 24;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAM = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 25;

  /**
   * The feature id for the '<em><b>Parameter Qualifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER_QUALIFIER = 0;

  /**
   * The feature id for the '<em><b>Qualified Type Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__QUALIFIED_TYPE_SPEC = 1;

  /**
   * The feature id for the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEC = 2;

  /**
   * The feature id for the '<em><b>Abstract Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ABSTRACT_DEC = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.IncludeDirectiveImpl
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getIncludeDirective()
   * @generated
   */
  int INCLUDE_DIRECTIVE = 26;

  /**
   * The feature id for the '<em><b>Imported URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE__IMPORTED_URI = 0;

  /**
   * The feature id for the '<em><b>Include ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE__INCLUDE_ID = 1;

  /**
   * The number of structural features of the '<em>Include Directive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_DIRECTIVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier <em>Type Qualifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeQualifier()
   * @generated
   */
  int TYPE_QUALIFIER = 27;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier <em>Type Specifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecifier()
   * @generated
   */
  int TYPE_SPECIFIER = 28;

  /**
   * The meta object id for the '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier
   * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getParameterQualifier()
   * @generated
   */
  int PARAMETER_QUALIFIER = 29;


  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.ItfFile <em>Itf File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Itf File</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ItfFile
   * @generated
   */
  EClass getItfFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getIncludes()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getConstant()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Constant();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getType()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ItfFile#getInterface()
   * @see #getItfFile()
   * @generated
   */
  EReference getItfFile_Interface();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification <em>Typedef Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification
   * @generated
   */
  EClass getTypedefSpecification();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification#getQualifedType <em>Qualifed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualifed Type</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification#getQualifedType()
   * @see #getTypedefSpecification()
   * @generated
   */
  EReference getTypedefSpecification_QualifedType();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypedefSpecification#getDec()
   * @see #getTypedefSpecification()
   * @generated
   */
  EReference getTypedefSpecification_Dec();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification <em>Qualified Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Type Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification
   * @generated
   */
  EClass getQualifiedTypeSpecification();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification#getTypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Qualifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification#getTypeQualifier()
   * @see #getQualifiedTypeSpecification()
   * @generated
   */
  EAttribute getQualifiedTypeSpecification_TypeQualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification#getTypeSpec <em>Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Spec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.QualifiedTypeSpecification#getTypeSpec()
   * @see #getQualifiedTypeSpecification()
   * @generated
   */
  EReference getQualifiedTypeSpecification_TypeSpec();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification
   * @generated
   */
  EClass getTypeSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification#getTypeDefName <em>Type Def Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Def Name</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification#getTypeDefName()
   * @see #getTypeSpecification()
   * @generated
   */
  EAttribute getTypeSpecification_TypeDefName();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Specifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecification#getTypeSpecifier()
   * @see #getTypeSpecification()
   * @generated
   */
  EAttribute getTypeSpecification_TypeSpecifier();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification <em>Struct Or Union Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Or Union Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification
   * @generated
   */
  EClass getStructOrUnionSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification#getStruct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Struct</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification#getStruct()
   * @see #getStructOrUnionSpecification()
   * @generated
   */
  EAttribute getStructOrUnionSpecification_Struct();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionSpecification#getId()
   * @see #getStructOrUnionSpecification()
   * @generated
   */
  EAttribute getStructOrUnionSpecification_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition <em>Struct Or Union Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Or Union Definition</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition
   * @generated
   */
  EClass getStructOrUnionDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition#getStructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Member</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructOrUnionDefinition#getStructMember()
   * @see #getStructOrUnionDefinition()
   * @generated
   */
  EReference getStructOrUnionDefinition_StructMember();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructorUnionReference <em>Structor Union Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structor Union Reference</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructorUnionReference
   * @generated
   */
  EClass getStructorUnionReference();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.StructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Member</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructMember
   * @generated
   */
  EClass getStructMember();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.StructMember#getQualType <em>Qual Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qual Type</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructMember#getQualType()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_QualType();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.StructMember#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.StructMember#getDec()
   * @see #getStructMember()
   * @generated
   */
  EReference getStructMember_Dec();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification <em>Enum Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification
   * @generated
   */
  EClass getEnumSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumSpecification#getId()
   * @see #getEnumSpecification()
   * @generated
   */
  EAttribute getEnumSpecification_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition <em>Enum Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Definition</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition
   * @generated
   */
  EClass getEnumDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition#getEnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enum Member List</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumDefinition#getEnumMemberList()
   * @see #getEnumDefinition()
   * @generated
   */
  EReference getEnumDefinition_EnumMemberList();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumReference <em>Enum Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Reference</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumReference
   * @generated
   */
  EClass getEnumReference();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member List</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumMemberList
   * @generated
   */
  EClass getEnumMemberList();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumMember
   * @generated
   */
  EClass getEnumMember();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getEnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Member</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getEnumMember()
   * @see #getEnumMember()
   * @generated
   */
  EReference getEnumMember_EnumMember();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.EnumMember#getId()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarators <em>Declarators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarators</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarators
   * @generated
   */
  EClass getDeclarators();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarators#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarators#getDec()
   * @see #getDeclarators()
   * @generated
   */
  EReference getDeclarators_Dec();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarators#getDeclaratorList <em>Declarator List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarator List</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarators#getDeclaratorList()
   * @see #getDeclarators()
   * @generated
   */
  EReference getDeclarators_DeclaratorList();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarator</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarator
   * @generated
   */
  EClass getDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarator#getPointer()
   * @see #getDeclarator()
   * @generated
   */
  EReference getDeclarator_Pointer();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.Declarator#getDc <em>Dc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dc</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Declarator#getDc()
   * @see #getDeclarator()
   * @generated
   */
  EReference getDeclarator_Dc();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator <em>Abstract Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Declarator</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator
   * @generated
   */
  EClass getAbstractDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator#getPointer()
   * @see #getAbstractDeclarator()
   * @generated
   */
  EReference getAbstractDeclarator_Pointer();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator#getDc <em>Dc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dc</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.AbstractDeclarator#getDc()
   * @see #getAbstractDeclarator()
   * @generated
   */
  EReference getAbstractDeclarator_Dc();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.PointerSpecification <em>Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointer Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.PointerSpecification
   * @generated
   */
  EClass getPointerSpecification();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.PointerSpecification#getQualifiedPointer <em>Qualified Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Qualified Pointer</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.PointerSpecification#getQualifiedPointer()
   * @see #getPointerSpecification()
   * @generated
   */
  EReference getPointerSpecification_QualifiedPointer();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.Qualified_PointerSpecification <em>Qualified Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Pointer Specification</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Qualified_PointerSpecification
   * @generated
   */
  EClass getQualified_PointerSpecification();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.fractal.mind.idl.fractalIDL.Qualified_PointerSpecification#getTypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Qualifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Qualified_PointerSpecification#getTypeQualifier()
   * @see #getQualified_PointerSpecification()
   * @generated
   */
  EAttribute getQualified_PointerSpecification_TypeQualifier();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator <em>Direct Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Declarator</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator
   * @generated
   */
  EClass getDirectDeclarator();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator#getId()
   * @see #getDirectDeclarator()
   * @generated
   */
  EAttribute getDirectDeclarator_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator#getDec()
   * @see #getDirectDeclarator()
   * @generated
   */
  EReference getDirectDeclarator_Dec();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Array</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.DirectDeclarator#getArray()
   * @see #getDirectDeclarator()
   * @generated
   */
  EAttribute getDirectDeclarator_Array();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator <em>Abstract Direct Declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Direct Declarator</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator
   * @generated
   */
  EClass getAbstractDirectDeclarator();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getDec()
   * @see #getAbstractDirectDeclarator()
   * @generated
   */
  EReference getAbstractDirectDeclarator_Dec();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Array</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.AbstractDirectDeclarator#getArray()
   * @see #getAbstractDirectDeclarator()
   * @generated
   */
  EAttribute getAbstractDirectDeclarator_Array();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition
   * @generated
   */
  EClass getConstantDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ConstantDefinition#getId()
   * @see #getConstantDefinition()
   * @generated
   */
  EAttribute getConstantDefinition_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Definition</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition
   * @generated
   */
  EClass getInterfaceDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition#getFqn <em>Fqn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fqn</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition#getFqn()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Fqn();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition#getFqn2 <em>Fqn2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fqn2</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition#getFqn2()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EAttribute getInterfaceDefinition_Fqn2();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition#getMethodDef <em>Method Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method Def</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.InterfaceDefinition#getMethodDef()
   * @see #getInterfaceDefinition()
   * @generated
   */
  EReference getInterfaceDefinition_MethodDef();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Definition</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition
   * @generated
   */
  EClass getMethodDefinition();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition#getQualifiedTypeSpec <em>Qualified Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Type Spec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition#getQualifiedTypeSpec()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_QualifiedTypeSpec();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition#getId()
   * @see #getMethodDefinition()
   * @generated
   */
  EAttribute getMethodDefinition_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition#getParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.MethodDefinition#getParameterList()
   * @see #getMethodDefinition()
   * @generated
   */
  EReference getMethodDefinition_ParameterList();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterList#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterList#getParam()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Param();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterList#getParams()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Params();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute list '{@link org.ow2.fractal.mind.idl.fractalIDL.Parameter#getParameterQualifier <em>Parameter Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameter Qualifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Parameter#getParameterQualifier()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ParameterQualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.Parameter#getQualifiedTypeSpec <em>Qualified Type Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified Type Spec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Parameter#getQualifiedTypeSpec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_QualifiedTypeSpec();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.Parameter#getDec <em>Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Parameter#getDec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Dec();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.fractal.mind.idl.fractalIDL.Parameter#getAbstractDec <em>Abstract Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract Dec</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.Parameter#getAbstractDec()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_AbstractDec();

  /**
   * Returns the meta object for class '{@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective <em>Include Directive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Directive</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective
   * @generated
   */
  EClass getIncludeDirective();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective#getImportedURI <em>Imported URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported URI</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective#getImportedURI()
   * @see #getIncludeDirective()
   * @generated
   */
  EAttribute getIncludeDirective_ImportedURI();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective#getIncludeID <em>Include ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include ID</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.IncludeDirective#getIncludeID()
   * @see #getIncludeDirective()
   * @generated
   */
  EAttribute getIncludeDirective_IncludeID();

  /**
   * Returns the meta object for enum '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier <em>Type Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Qualifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier
   * @generated
   */
  EEnum getTypeQualifier();

  /**
   * Returns the meta object for enum '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type Specifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier
   * @generated
   */
  EEnum getTypeSpecifier();

  /**
   * Returns the meta object for enum '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Qualifier</em>'.
   * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier
   * @generated
   */
  EEnum getParameterQualifier();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FractalIDLFactory getFractalIDLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ItfFileImpl <em>Itf File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ItfFileImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getItfFile()
     * @generated
     */
    EClass ITF_FILE = eINSTANCE.getItfFile();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__INCLUDES = eINSTANCE.getItfFile_Includes();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__CONSTANT = eINSTANCE.getItfFile_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__TYPE = eINSTANCE.getItfFile_Type();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITF_FILE__INTERFACE = eINSTANCE.getItfFile_Interface();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.TypeDefinitionImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.TypedefSpecificationImpl <em>Typedef Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.TypedefSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypedefSpecification()
     * @generated
     */
    EClass TYPEDEF_SPECIFICATION = eINSTANCE.getTypedefSpecification();

    /**
     * The meta object literal for the '<em><b>Qualifed Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_SPECIFICATION__QUALIFED_TYPE = eINSTANCE.getTypedefSpecification_QualifedType();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPEDEF_SPECIFICATION__DEC = eINSTANCE.getTypedefSpecification_Dec();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.QualifiedTypeSpecificationImpl <em>Qualified Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.QualifiedTypeSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getQualifiedTypeSpecification()
     * @generated
     */
    EClass QUALIFIED_TYPE_SPECIFICATION = eINSTANCE.getQualifiedTypeSpecification();

    /**
     * The meta object literal for the '<em><b>Type Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER = eINSTANCE.getQualifiedTypeSpecification_TypeQualifier();

    /**
     * The meta object literal for the '<em><b>Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC = eINSTANCE.getQualifiedTypeSpecification_TypeSpec();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.TypeSpecificationImpl <em>Type Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.TypeSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecification()
     * @generated
     */
    EClass TYPE_SPECIFICATION = eINSTANCE.getTypeSpecification();

    /**
     * The meta object literal for the '<em><b>Type Def Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFICATION__TYPE_DEF_NAME = eINSTANCE.getTypeSpecification_TypeDefName();

    /**
     * The meta object literal for the '<em><b>Type Specifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFICATION__TYPE_SPECIFIER = eINSTANCE.getTypeSpecification_TypeSpecifier();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionSpecificationImpl <em>Struct Or Union Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionSpecification()
     * @generated
     */
    EClass STRUCT_OR_UNION_SPECIFICATION = eINSTANCE.getStructOrUnionSpecification();

    /**
     * The meta object literal for the '<em><b>Struct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_OR_UNION_SPECIFICATION__STRUCT = eINSTANCE.getStructOrUnionSpecification_Struct();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCT_OR_UNION_SPECIFICATION__ID = eINSTANCE.getStructOrUnionSpecification_Id();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionDefinitionImpl <em>Struct Or Union Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructOrUnionDefinitionImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructOrUnionDefinition()
     * @generated
     */
    EClass STRUCT_OR_UNION_DEFINITION = eINSTANCE.getStructOrUnionDefinition();

    /**
     * The meta object literal for the '<em><b>Struct Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER = eINSTANCE.getStructOrUnionDefinition_StructMember();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructorUnionReferenceImpl <em>Structor Union Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructorUnionReferenceImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructorUnionReference()
     * @generated
     */
    EClass STRUCTOR_UNION_REFERENCE = eINSTANCE.getStructorUnionReference();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.StructMemberImpl <em>Struct Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.StructMemberImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getStructMember()
     * @generated
     */
    EClass STRUCT_MEMBER = eINSTANCE.getStructMember();

    /**
     * The meta object literal for the '<em><b>Qual Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER__QUAL_TYPE = eINSTANCE.getStructMember_QualType();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_MEMBER__DEC = eINSTANCE.getStructMember_Dec();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumSpecificationImpl <em>Enum Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumSpecification()
     * @generated
     */
    EClass ENUM_SPECIFICATION = eINSTANCE.getEnumSpecification();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_SPECIFICATION__ID = eINSTANCE.getEnumSpecification_Id();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumDefinitionImpl <em>Enum Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumDefinitionImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumDefinition()
     * @generated
     */
    EClass ENUM_DEFINITION = eINSTANCE.getEnumDefinition();

    /**
     * The meta object literal for the '<em><b>Enum Member List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DEFINITION__ENUM_MEMBER_LIST = eINSTANCE.getEnumDefinition_EnumMemberList();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumReferenceImpl <em>Enum Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumReferenceImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumReference()
     * @generated
     */
    EClass ENUM_REFERENCE = eINSTANCE.getEnumReference();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberListImpl <em>Enum Member List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberListImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumMemberList()
     * @generated
     */
    EClass ENUM_MEMBER_LIST = eINSTANCE.getEnumMemberList();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberImpl <em>Enum Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.EnumMemberImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getEnumMember()
     * @generated
     */
    EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

    /**
     * The meta object literal for the '<em><b>Enum Member</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_MEMBER__ENUM_MEMBER = eINSTANCE.getEnumMember_EnumMember();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__ID = eINSTANCE.getEnumMember_Id();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorsImpl <em>Declarators</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorsImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getDeclarators()
     * @generated
     */
    EClass DECLARATORS = eINSTANCE.getDeclarators();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATORS__DEC = eINSTANCE.getDeclarators_Dec();

    /**
     * The meta object literal for the '<em><b>Declarator List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATORS__DECLARATOR_LIST = eINSTANCE.getDeclarators_DeclaratorList();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorImpl <em>Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.DeclaratorImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getDeclarator()
     * @generated
     */
    EClass DECLARATOR = eINSTANCE.getDeclarator();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATOR__POINTER = eINSTANCE.getDeclarator_Pointer();

    /**
     * The meta object literal for the '<em><b>Dc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATOR__DC = eINSTANCE.getDeclarator_Dc();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDeclaratorImpl <em>Abstract Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDeclaratorImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getAbstractDeclarator()
     * @generated
     */
    EClass ABSTRACT_DECLARATOR = eINSTANCE.getAbstractDeclarator();

    /**
     * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DECLARATOR__POINTER = eINSTANCE.getAbstractDeclarator_Pointer();

    /**
     * The meta object literal for the '<em><b>Dc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DECLARATOR__DC = eINSTANCE.getAbstractDeclarator_Dc();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.PointerSpecificationImpl <em>Pointer Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.PointerSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getPointerSpecification()
     * @generated
     */
    EClass POINTER_SPECIFICATION = eINSTANCE.getPointerSpecification();

    /**
     * The meta object literal for the '<em><b>Qualified Pointer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTER_SPECIFICATION__QUALIFIED_POINTER = eINSTANCE.getPointerSpecification_QualifiedPointer();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.Qualified_PointerSpecificationImpl <em>Qualified Pointer Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.Qualified_PointerSpecificationImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getQualified_PointerSpecification()
     * @generated
     */
    EClass QUALIFIED_POINTER_SPECIFICATION = eINSTANCE.getQualified_PointerSpecification();

    /**
     * The meta object literal for the '<em><b>Type Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER = eINSTANCE.getQualified_PointerSpecification_TypeQualifier();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.DirectDeclaratorImpl <em>Direct Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.DirectDeclaratorImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getDirectDeclarator()
     * @generated
     */
    EClass DIRECT_DECLARATOR = eINSTANCE.getDirectDeclarator();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_DECLARATOR__ID = eINSTANCE.getDirectDeclarator_Id();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_DECLARATOR__DEC = eINSTANCE.getDirectDeclarator_Dec();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECT_DECLARATOR__ARRAY = eINSTANCE.getDirectDeclarator_Array();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDirectDeclaratorImpl <em>Abstract Direct Declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.AbstractDirectDeclaratorImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getAbstractDirectDeclarator()
     * @generated
     */
    EClass ABSTRACT_DIRECT_DECLARATOR = eINSTANCE.getAbstractDirectDeclarator();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ABSTRACT_DIRECT_DECLARATOR__DEC = eINSTANCE.getAbstractDirectDeclarator_Dec();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DIRECT_DECLARATOR__ARRAY = eINSTANCE.getAbstractDirectDeclarator_Array();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ConstantDefinitionImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getConstantDefinition()
     * @generated
     */
    EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION__ID = eINSTANCE.getConstantDefinition_Id();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.InterfaceDefinitionImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getInterfaceDefinition()
     * @generated
     */
    EClass INTERFACE_DEFINITION = eINSTANCE.getInterfaceDefinition();

    /**
     * The meta object literal for the '<em><b>Fqn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DEFINITION__FQN = eINSTANCE.getInterfaceDefinition_Fqn();

    /**
     * The meta object literal for the '<em><b>Fqn2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DEFINITION__FQN2 = eINSTANCE.getInterfaceDefinition_Fqn2();

    /**
     * The meta object literal for the '<em><b>Method Def</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DEFINITION__METHOD_DEF = eINSTANCE.getInterfaceDefinition_MethodDef();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.MethodDefinitionImpl <em>Method Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.MethodDefinitionImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getMethodDefinition()
     * @generated
     */
    EClass METHOD_DEFINITION = eINSTANCE.getMethodDefinition();

    /**
     * The meta object literal for the '<em><b>Qualified Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__QUALIFIED_TYPE_SPEC = eINSTANCE.getMethodDefinition_QualifiedTypeSpec();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DEFINITION__ID = eINSTANCE.getMethodDefinition_Id();

    /**
     * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DEFINITION__PARAMETER_LIST = eINSTANCE.getMethodDefinition_ParameterList();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterListImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getParameterList()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameterList();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAM = eINSTANCE.getParameterList_Param();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMS = eINSTANCE.getParameterList_Params();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.ParameterImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Parameter Qualifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__PARAMETER_QUALIFIER = eINSTANCE.getParameter_ParameterQualifier();

    /**
     * The meta object literal for the '<em><b>Qualified Type Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__QUALIFIED_TYPE_SPEC = eINSTANCE.getParameter_QualifiedTypeSpec();

    /**
     * The meta object literal for the '<em><b>Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEC = eINSTANCE.getParameter_Dec();

    /**
     * The meta object literal for the '<em><b>Abstract Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ABSTRACT_DEC = eINSTANCE.getParameter_AbstractDec();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.impl.IncludeDirectiveImpl <em>Include Directive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.IncludeDirectiveImpl
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getIncludeDirective()
     * @generated
     */
    EClass INCLUDE_DIRECTIVE = eINSTANCE.getIncludeDirective();

    /**
     * The meta object literal for the '<em><b>Imported URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DIRECTIVE__IMPORTED_URI = eINSTANCE.getIncludeDirective_ImportedURI();

    /**
     * The meta object literal for the '<em><b>Include ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_DIRECTIVE__INCLUDE_ID = eINSTANCE.getIncludeDirective_IncludeID();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier <em>Type Qualifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.TypeQualifier
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeQualifier()
     * @generated
     */
    EEnum TYPE_QUALIFIER = eINSTANCE.getTypeQualifier();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier <em>Type Specifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.TypeSpecifier
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getTypeSpecifier()
     * @generated
     */
    EEnum TYPE_SPECIFIER = eINSTANCE.getTypeSpecifier();

    /**
     * The meta object literal for the '{@link org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier <em>Parameter Qualifier</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.fractal.mind.idl.fractalIDL.ParameterQualifier
     * @see org.ow2.fractal.mind.idl.fractalIDL.impl.FractalIDLPackageImpl#getParameterQualifier()
     * @generated
     */
    EEnum PARAMETER_QUALIFIER = eINSTANCE.getParameterQualifier();

  }

} //FractalIDLPackage