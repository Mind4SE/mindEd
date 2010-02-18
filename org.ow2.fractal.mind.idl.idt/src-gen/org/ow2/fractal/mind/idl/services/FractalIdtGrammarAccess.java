/*
* generated by Xtext
*/

package org.ow2.fractal.mind.idl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess;

@Singleton
public class FractalIdtGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class IdtFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IdtFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIncludesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIncludesIncludeDirectiveParserRuleCall_0_0 = (RuleCall)cIncludesAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cConstantAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cConstantConstantDefinitionParserRuleCall_1_0_0 = (RuleCall)cConstantAssignment_1_0.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cTypeTypeDefinitionParserRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		
		//IdtFile:
		//  includes+=IncludeDirective* (constant+=ConstantDefinition|type+=TypeDefinition)*;
		public ParserRule getRule() { return rule; }

		//includes+=IncludeDirective* (constant+=ConstantDefinition|type+=TypeDefinition)*
		public Group getGroup() { return cGroup; }

		//includes+=IncludeDirective*
		public Assignment getIncludesAssignment_0() { return cIncludesAssignment_0; }

		//IncludeDirective
		public RuleCall getIncludesIncludeDirectiveParserRuleCall_0_0() { return cIncludesIncludeDirectiveParserRuleCall_0_0; }

		//(constant+=ConstantDefinition|type+=TypeDefinition)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//constant+=ConstantDefinition
		public Assignment getConstantAssignment_1_0() { return cConstantAssignment_1_0; }

		//ConstantDefinition
		public RuleCall getConstantConstantDefinitionParserRuleCall_1_0_0() { return cConstantConstantDefinitionParserRuleCall_1_0_0; }

		//type+=TypeDefinition
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }

		//TypeDefinition
		public RuleCall getTypeTypeDefinitionParserRuleCall_1_1_0() { return cTypeTypeDefinitionParserRuleCall_1_1_0; }
	}
	
	
	private IdtFileElements pIdtFile;
	
	private final GrammarProvider grammarProvider;

	private FractalItfGrammarAccess gaFractalItf;

	@Inject
	public FractalIdtGrammarAccess(GrammarProvider grammarProvider,
		FractalItfGrammarAccess gaFractalItf) {
		this.grammarProvider = grammarProvider;
		this.gaFractalItf = gaFractalItf;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public FractalItfGrammarAccess getFractalItfGrammarAccess() {
		return gaFractalItf;
	}

	
	//IdtFile:
	//  includes+=IncludeDirective* (constant+=ConstantDefinition|type+=TypeDefinition)*;
	public IdtFileElements getIdtFileAccess() {
		return (pIdtFile != null) ? pIdtFile : (pIdtFile = new IdtFileElements());
	}
	
	public ParserRule getIdtFileRule() {
		return getIdtFileAccess().getRule();
	}

	//ItfFile:
	//  includes+=IncludeDirective* (constant+=ConstantDefinition|type+=TypeDefinition)*
	//  interface=InterfaceDefinition ";"?;   // itf definition
	//
	//
	//
	//    
	//        // Type definition part
	public FractalItfGrammarAccess.ItfFileElements getItfFileAccess() {
		return gaFractalItf.getItfFileAccess();
	}
	
	public ParserRule getItfFileRule() {
		return getItfFileAccess().getRule();
	}

	//TypeDefinition:
	//  (TypedefSpecification|StructOrUnionSpecification|EnumSpecification) ";";   // Type definition part
	public FractalItfGrammarAccess.TypeDefinitionElements getTypeDefinitionAccess() {
		return gaFractalItf.getTypeDefinitionAccess();
	}
	
	public ParserRule getTypeDefinitionRule() {
		return getTypeDefinitionAccess().getRule();
	}

	//TypedefSpecification:
	//  "typedef" qualifedType=QualifiedTypeSpecification dec=Declarators;
	public FractalItfGrammarAccess.TypedefSpecificationElements getTypedefSpecificationAccess() {
		return gaFractalItf.getTypedefSpecificationAccess();
	}
	
	public ParserRule getTypedefSpecificationRule() {
		return getTypedefSpecificationAccess().getRule();
	}

	//QualifiedTypeSpecification:
	//  typeQualifier+=TypeQualifier* typeSpec=TypeSpecification;
	public FractalItfGrammarAccess.QualifiedTypeSpecificationElements getQualifiedTypeSpecificationAccess() {
		return gaFractalItf.getQualifiedTypeSpecificationAccess();
	}
	
	public ParserRule getQualifiedTypeSpecificationRule() {
		return getQualifiedTypeSpecificationAccess().getRule();
	}

	//enum TypeQualifier:
	//  const | volatile;
	public FractalItfGrammarAccess.TypeQualifierElements getTypeQualifierAccess() {
		return gaFractalItf.getTypeQualifierAccess();
	}
	
	public EnumRule getTypeQualifierRule() {
		return getTypeQualifierAccess().getRule();
	}

	//TypeSpecification:
	//  typeDefName=TypedefName|StructOrUnionSpecification|EnumSpecification|
	//  typeSpecifier+=TypeSpecifier+;
	public FractalItfGrammarAccess.TypeSpecificationElements getTypeSpecificationAccess() {
		return gaFractalItf.getTypeSpecificationAccess();
	}
	
	public ParserRule getTypeSpecificationRule() {
		return getTypeSpecificationAccess().getRule();
	}

	//TypedefName returns ecore::EString:
	//  FullyQualifiedName;
	public FractalItfGrammarAccess.TypedefNameElements getTypedefNameAccess() {
		return gaFractalItf.getTypedefNameAccess();
	}
	
	public ParserRule getTypedefNameRule() {
		return getTypedefNameAccess().getRule();
	}

	//enum TypeSpecifier:
	//  void | char | short | int | long | float | double | signed | unsigned | string | int8_t | uint8_t |
	//  int16_t | uint16_t | int32_t | uint32_t | int64_t | uint64_t | intptr_t | uintptr_t;
	public FractalItfGrammarAccess.TypeSpecifierElements getTypeSpecifierAccess() {
		return gaFractalItf.getTypeSpecifierAccess();
	}
	
	public EnumRule getTypeSpecifierRule() {
		return getTypeSpecifierAccess().getRule();
	}

	//StructOrUnionSpecification:
	//  StructOrUnionDefinition|StructorUnionReference;
	public FractalItfGrammarAccess.StructOrUnionSpecificationElements getStructOrUnionSpecificationAccess() {
		return gaFractalItf.getStructOrUnionSpecificationAccess();
	}
	
	public ParserRule getStructOrUnionSpecificationRule() {
		return getStructOrUnionSpecificationAccess().getRule();
	}

	//StructOrUnionDefinition:
	//  struct=StructOrUnion id=ID? "{" structMember+=StructMember* "}";
	public FractalItfGrammarAccess.StructOrUnionDefinitionElements getStructOrUnionDefinitionAccess() {
		return gaFractalItf.getStructOrUnionDefinitionAccess();
	}
	
	public ParserRule getStructOrUnionDefinitionRule() {
		return getStructOrUnionDefinitionAccess().getRule();
	}

	//StructorUnionReference:
	//  struct=StructOrUnion id=ID;
	public FractalItfGrammarAccess.StructorUnionReferenceElements getStructorUnionReferenceAccess() {
		return gaFractalItf.getStructorUnionReferenceAccess();
	}
	
	public ParserRule getStructorUnionReferenceRule() {
		return getStructorUnionReferenceAccess().getRule();
	}

	//StructOrUnion returns ecore::EString:
	//  "struct"|"union";
	public FractalItfGrammarAccess.StructOrUnionElements getStructOrUnionAccess() {
		return gaFractalItf.getStructOrUnionAccess();
	}
	
	public ParserRule getStructOrUnionRule() {
		return getStructOrUnionAccess().getRule();
	}

	//StructMember:
	//  qualType=QualifiedTypeSpecification dec=Declarators (":" INT)? ";";
	public FractalItfGrammarAccess.StructMemberElements getStructMemberAccess() {
		return gaFractalItf.getStructMemberAccess();
	}
	
	public ParserRule getStructMemberRule() {
		return getStructMemberAccess().getRule();
	}

	//EnumSpecification:
	//  EnumDefinition|EnumReference;
	public FractalItfGrammarAccess.EnumSpecificationElements getEnumSpecificationAccess() {
		return gaFractalItf.getEnumSpecificationAccess();
	}
	
	public ParserRule getEnumSpecificationRule() {
		return getEnumSpecificationAccess().getRule();
	}

	//EnumDefinition:
	//  "enum" id=ID? "{" enumMemberList=EnumMemberList "}";
	public FractalItfGrammarAccess.EnumDefinitionElements getEnumDefinitionAccess() {
		return gaFractalItf.getEnumDefinitionAccess();
	}
	
	public ParserRule getEnumDefinitionRule() {
		return getEnumDefinitionAccess().getRule();
	}

	//EnumReference:
	//  "enum" id=ID;
	public FractalItfGrammarAccess.EnumReferenceElements getEnumReferenceAccess() {
		return gaFractalItf.getEnumReferenceAccess();
	}
	
	public ParserRule getEnumReferenceRule() {
		return getEnumReferenceAccess().getRule();
	}

	//EnumMemberList:
	//  EnumMember ("," enumMember+=EnumMember)*;
	public FractalItfGrammarAccess.EnumMemberListElements getEnumMemberListAccess() {
		return gaFractalItf.getEnumMemberListAccess();
	}
	
	public ParserRule getEnumMemberListRule() {
		return getEnumMemberListAccess().getRule();
	}

	//EnumMember:
	//  id=ID ("=" INT)?;
	public FractalItfGrammarAccess.EnumMemberElements getEnumMemberAccess() {
		return gaFractalItf.getEnumMemberAccess();
	}
	
	public ParserRule getEnumMemberRule() {
		return getEnumMemberAccess().getRule();
	}

	//Declarators:
	//  dec=Declarator ("," declaratorList+=Declarator)*;
	public FractalItfGrammarAccess.DeclaratorsElements getDeclaratorsAccess() {
		return gaFractalItf.getDeclaratorsAccess();
	}
	
	public ParserRule getDeclaratorsRule() {
		return getDeclaratorsAccess().getRule();
	}

	//Declarator:
	//  ("*" typeQualifier+=TypeQualifier*)* dc=DirectDeclarator; 
	//
	//
	//        //PointerSpecification:
	////  qualifiedPointer+=(qualified_PointerSpecification)*;
	////
	////qualified_PointerSpecification:
	////  '*' (typeQualifier+=TypeQualifier)*;
	public FractalItfGrammarAccess.DeclaratorElements getDeclaratorAccess() {
		return gaFractalItf.getDeclaratorAccess();
	}
	
	public ParserRule getDeclaratorRule() {
		return getDeclaratorAccess().getRule();
	}

	//DirectDeclarator:
	//  (id=ID|"(" Declarator ")") ArraySpecification*;   //PointerSpecification:
	////  qualifiedPointer+=(qualified_PointerSpecification)*;
	////
	////qualified_PointerSpecification:
	////  '*' (typeQualifier+=TypeQualifier)*;
	public FractalItfGrammarAccess.DirectDeclaratorElements getDirectDeclaratorAccess() {
		return gaFractalItf.getDirectDeclaratorAccess();
	}
	
	public ParserRule getDirectDeclaratorRule() {
		return getDirectDeclaratorAccess().getRule();
	}

	//ArraySpecification returns ecore::EString:
	//  "[" (INT|ID) "]";
	public FractalItfGrammarAccess.ArraySpecificationElements getArraySpecificationAccess() {
		return gaFractalItf.getArraySpecificationAccess();
	}
	
	public ParserRule getArraySpecificationRule() {
		return getArraySpecificationAccess().getRule();
	}

	//FullyQualifiedName returns ecore::EString:
	//  ID ("." ID)*; 
	//
	//
	//        // Interface definition part
	public FractalItfGrammarAccess.FullyQualifiedNameElements getFullyQualifiedNameAccess() {
		return gaFractalItf.getFullyQualifiedNameAccess();
	}
	
	public ParserRule getFullyQualifiedNameRule() {
		return getFullyQualifiedNameAccess().getRule();
	}

	//ConstantDefinition:
	//  "#define" id=ID INT;   // Interface definition part
	public FractalItfGrammarAccess.ConstantDefinitionElements getConstantDefinitionAccess() {
		return gaFractalItf.getConstantDefinitionAccess();
	}
	
	public ParserRule getConstantDefinitionRule() {
		return getConstantDefinitionAccess().getRule();
	}

	//InterfaceDefinition:
	//  "interface" "unmanaged"? fqn=FullyQualifiedName (":" fqn2=FullyQualifiedName)? "{"
	//  methodDef+=MethodDefinition* "}";
	public FractalItfGrammarAccess.InterfaceDefinitionElements getInterfaceDefinitionAccess() {
		return gaFractalItf.getInterfaceDefinitionAccess();
	}
	
	public ParserRule getInterfaceDefinitionRule() {
		return getInterfaceDefinitionAccess().getRule();
	}

	//MethodDefinition:
	//  qualifiedTypeSpec=QualifiedTypeSpecification id=ID ("(" "void"? ")"|"(" ParameterList
	//  =ParameterList ")") ";";
	public FractalItfGrammarAccess.MethodDefinitionElements getMethodDefinitionAccess() {
		return gaFractalItf.getMethodDefinitionAccess();
	}
	
	public ParserRule getMethodDefinitionRule() {
		return getMethodDefinitionAccess().getRule();
	}

	//ParameterList:
	//  param=Parameter ("," params+=Parameter)* ("," "...")?;
	public FractalItfGrammarAccess.ParameterListElements getParameterListAccess() {
		return gaFractalItf.getParameterListAccess();
	}
	
	public ParserRule getParameterListRule() {
		return getParameterListAccess().getRule();
	}

	//Parameter:
	//  ParameterQualifier+=ParameterQualifier* qualifiedTypeSpec=
	//  QualifiedTypeSpecification dec=Declarator;
	public FractalItfGrammarAccess.ParameterElements getParameterAccess() {
		return gaFractalItf.getParameterAccess();
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//enum ParameterQualifier:
	//  in | out; 
	//
	//  
	//        // include directive
	public FractalItfGrammarAccess.ParameterQualifierElements getParameterQualifierAccess() {
		return gaFractalItf.getParameterQualifierAccess();
	}
	
	public EnumRule getParameterQualifierRule() {
		return getParameterQualifierAccess().getRule();
	}

	//IncludeDirective:
	//  "#include" (importedURI=STRING|includeID=IncludeLib);   // include directive
	public FractalItfGrammarAccess.IncludeDirectiveElements getIncludeDirectiveAccess() {
		return gaFractalItf.getIncludeDirectiveAccess();
	}
	
	public ParserRule getIncludeDirectiveRule() {
		return getIncludeDirectiveAccess().getRule();
	}

	//terminal IncludeLib:
	//  "<" ID "." ID ">";
	public TerminalRule getIncludeLibRule() {
		return gaFractalItf.getIncludeLibRule();
	} 

	//terminal ID:
	//  "^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaFractalItf.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//  "0".."9"+;
	public TerminalRule getINTRule() {
		return gaFractalItf.getINTRule();
	} 

	//terminal STRING:
	//  "\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" |
	//  "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaFractalItf.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//  "/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaFractalItf.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//  "//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaFractalItf.getSL_COMMENTRule();
	} 

	//terminal WS:
	//  (" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaFractalItf.getWSRule();
	} 

	//terminal ANY_OTHER:
	//  .;
	public TerminalRule getANY_OTHERRule() {
		return gaFractalItf.getANY_OTHERRule();
	} 
}
