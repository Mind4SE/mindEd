/*
* generated by Xtext
*/
package org.ow2.mindEd.idt.editor.textual.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FractalIdtAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.tokens");
	}
}
