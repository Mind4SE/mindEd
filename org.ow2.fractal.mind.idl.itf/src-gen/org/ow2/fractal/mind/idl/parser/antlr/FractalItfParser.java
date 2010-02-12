/*
* generated by Xtext
*/
package org.ow2.fractal.mind.idl.parser.antlr;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import org.ow2.fractal.mind.idl.services.FractalItfGrammarAccess;

public class FractalItfParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FractalItfGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, ANTLRInputStream in) {
		TokenSource tokenSource = createLexer(in);
		XtextTokenStream tokenStream = createTokenStream(tokenSource);
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		org.ow2.fractal.mind.idl.parser.antlr.internal.InternalFractalItfParser parser = createParser(tokenStream);
		parser.setTokenTypeMap(getTokenDefProvider().getTokenDefMap());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	protected org.ow2.fractal.mind.idl.parser.antlr.internal.InternalFractalItfParser createParser(XtextTokenStream stream) {
		return new org.ow2.fractal.mind.idl.parser.antlr.internal.InternalFractalItfParser(stream, getElementFactory(), getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ItfFile";
	}
	
	public FractalItfGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FractalItfGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
