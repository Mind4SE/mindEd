package org.ow2.fractal.mind.idl.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 * 
 * 
 * @author Damien Fournier
 */

public class FractalItfFormatter extends AbstractDeclarativeFormatter {
	
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		
		System.out.println("configure formatting itf");
		
		FractalItfGrammarAccess f = (org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess) getGrammarAccess();
		
		c.setIndentationSpace("    ");
		formatDefine(f,c);
		formatEnum(f,c);
		formatTypeDef(f,c);
		formatInterfaces(f,c);
		formatStructUnion(f,c);
		
	}
	
	
	/**
	 * 
	 * Format a bloc limited by parenthesis or curly bracket.
	 * 
	 * @param left
	 *            left delimiter
	 * 
	 * @param right
	 *            right delimiter
	 * 
	 */
	protected void formatBloc(Keyword left, Keyword right,FormattingConfig c ) {
		// line after first bracket
		c.setLinewrap().after(left);
		// inside indentation
		c.setIndentation(left, right);
		// line after bloc
		c.setLinewrap().before(right);
	}
	
	/**
	 * Format Interface Bloc
	 */
	
	protected void formatInterfaces(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap(2).before(f.getInterfaceDefinitionAccess().getInterfaceKeyword_0());
		formatBloc(f.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_4(), f.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6(),c);
	}
	
	/**
	 * Format Define Definition
	 */
	
	protected void formatDefine(FractalItfGrammarAccess f, FormattingConfig c) {
		c.setLinewrap().before(f.getConstantDefinitionAccess().getDefineKeyword_0());
	}
	
	/**
	 * Format Enum Definition
	 */
	
	protected void formatEnum(FractalItfGrammarAccess f,FormattingConfig c){
		c.setLinewrap().before(f.getEnumDefinitionAccess().getEnumKeyword_0());
		c.setLinewrap().before(f.getEnumReferenceAccess().getEnumKeyword_0());
	}
	
	/**
	 * Format TypeDef
	 */
	
	protected void formatTypeDef(FractalItfGrammarAccess f,FormattingConfig c){
		c.setLinewrap().before(f.getTypedefSpecificationAccess().getTypedefKeyword_0());
	}
	
	/**
	 * Format Struct or Union Definition
	 */
	
	protected void formatStructUnion(FractalItfGrammarAccess f,FormattingConfig c) {
		c.setLinewrap().before(f.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0());
	}

	
	
}
