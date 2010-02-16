/*
 * generated by Xtext
 */
package org.ow2.fractal.mind.idl;

import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 * 
 * @author Rémi Mélisson
 * 
 */
public class FractalIdtUiModule extends org.ow2.fractal.mind.idl.AbstractFractalIdtUiModule {

	/**
	 * Using ITF lexical highlighting
	 * 
	 */
	public Class<? extends IHighlightingConfiguration> bindILexicalHighlightingConfiguration() {
		return LexicalHighlightingConfiguration.class;
		}
	
	/**
	 * Using ITF token
	 * 
	 */
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
		return AntlrTokenToAttributeIdMapper.class;
		}
}
