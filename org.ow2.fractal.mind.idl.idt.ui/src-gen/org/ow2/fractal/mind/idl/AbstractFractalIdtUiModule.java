
/*
 * generated by Xtext
 */
package org.ow2.fractal.mind.idl;

import org.ow2.fractal.mind.idl.FractalIdtRuntimeModule;

/**
 * Manual modifications go to {org.ow2.fractal.mind.idl.FractalIdtUiModule}
 */
public abstract class AbstractFractalIdtUiModule extends FractalIdtRuntimeModule {
	
	
	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.ILocationInFileProvider> bindILocationInFileProvider() {
		return org.eclipse.xtext.ui.core.DefaultLocationInFileProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.hyperlink.IHyperlinkDetector> bindIHyperlinkDetector() {
		return org.eclipse.xtext.ui.common.editor.hyperlinking.DefaultHyperlinkDetector.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.reconciler.IReconciler> bindIReconciler() {
		return org.eclipse.xtext.ui.core.editor.reconciler.XtextReconciler.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.toggleComments.ISingleLineCommentHelper> bindISingleLineCommentHelper() {
		return org.eclipse.xtext.ui.common.editor.toggleComments.DefaultSingleLineCommentHelper.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return org.eclipse.xtext.ui.common.editor.outline.transformer.TransformingTreeProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.ui.views.contentoutline.IContentOutlinePage> bindIContentOutlinePage() {
		return org.eclipse.xtext.ui.common.editor.outline.XtextContentOutlinePage.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.actions.IActionBarContributor> bindIActionBarContributor() {
		return org.eclipse.xtext.ui.common.editor.outline.actions.IActionBarContributor.DefaultActionBarContributor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.syntaxcoloring.IHighlightingHelper> bindIHighlightingHelper() {
		return org.eclipse.xtext.ui.common.editor.syntaxcoloring.HighlightingHelper.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.emf.common.notify.AdapterFactory> bindAdapterFactory() {
		return org.eclipse.xtext.ui.core.InjectableAdapterFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider> bindAdapterFactoryLabelProvider() {
		return org.eclipse.xtext.ui.core.InjectableAdapterFactoryLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry bindComposedAdapterFactory$Descriptor$RegistryToInstance() {
		return org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.IContentAssistantFactory> bindIContentAssistantFactory() {
		return org.eclipse.xtext.ui.common.editor.contentassist.DefaultContentAssistantFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.contentassist.IContentAssistProcessor> bindIContentAssistProcessor() {
		return org.eclipse.xtext.ui.core.editor.contentassist.XtextContentAssistProcessor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalPostProcessor> bindICompletionProposalPostProcessor() {
		return org.eclipse.xtext.ui.common.editor.contentassist.DefaultCompletionProposalPostProcessor.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.IFollowElementCalculator> bindIFollowElementCalculator() {
		return org.eclipse.xtext.ui.common.editor.contentassist.DefaultFollowElementCalculator.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.ITemplateProposalProvider> bindITemplateProposalProvider() {
		return org.eclipse.xtext.ui.common.editor.templates.DefaultTemplateProposalProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.templates.persistence.TemplateStore> bindTemplateStore() {
		return org.eclipse.xtext.ui.common.editor.templates.XtextTemplateStore.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.jface.text.templates.ContextTypeRegistry> bindContextTypeRegistry() {
		return org.eclipse.xtext.ui.common.editor.templates.XtextTemplateContextTypeRegistry.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.formatting.IContentFormatterFactory> bindIContentFormatterFactory() {
		return org.eclipse.xtext.ui.core.editor.formatting.ContentFormatterFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public void configureXtextEditorErrorTickUpdater(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.core.editor.IXtextEditorCallback.class).annotatedWith(com.google.inject.name.Names.named("IXtextEditorCallBack")).to(org.eclipse.xtext.ui.core.editor.XtextEditorErrorTickUpdater.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public Class<? extends org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider> bindIExternalContentSupport$IExternalContentProvider() {
		return org.eclipse.xtext.ui.core.editor.IDirtyStateManager.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public com.google.inject.Provider<org.eclipse.xtext.ui.core.editor.IDirtyStateManager> provideIDirtyStateManager() {
		return new org.eclipse.xtext.ui.core.editor.DirtyStateManagerProvider();
	}

	// contributed by org.eclipse.xtext.ui.generator.ImplicitUiFragment
	public com.google.inject.Provider<org.eclipse.xtext.ui.core.notification.IStateChangeEventBroker> provideIStateChangeEventBroker() {
		return new org.eclipse.xtext.ui.core.notification.StateChangeEventBrokerProvider();
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.jface.text.rules.ITokenScanner> bindITokenScanner() {
		return org.eclipse.xtext.ui.common.editor.syntaxcoloring.antlr.AntlrTokenScanner.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.contentassist.IProposalConflictHelper> bindIProposalConflictHelper() {
		return org.eclipse.xtext.ui.common.editor.contentassist.antlr.AntlrProposalConflictHelper.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.IDamagerRepairer> bindIDamagerRepairer() {
		return org.eclipse.xtext.ui.core.editor.XtextDamagerRepairer.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public void configureHighlightingLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.core.LexerUIBindings.HIGHLIGHTING)).to(org.ow2.fractal.mind.idl.parser.antlr.internal.InternalFractalIdtLexer.class);
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrGeneratorFragment
	public void configureHighlightingTokenDefProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.ITokenDefProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.core.LexerUIBindings.HIGHLIGHTING)).to(org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider.class);
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public Class<? extends org.eclipse.jface.viewers.ILabelProvider> bindILabelProvider() {
		return org.ow2.fractal.mind.idl.labeling.FractalIdtLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.labeling.LabelProviderFragment
	public Class<? extends org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider> bindDelegatingStyledCellLabelProvider$IStyledLabelProvider() {
		return org.ow2.fractal.mind.idl.labeling.FractalIdtLabelProvider.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.TransformerFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.transformer.ISemanticModelTransformer> bindISemanticModelTransformer() {
		return org.ow2.fractal.mind.idl.outline.FractalIdtTransformer.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.outline.OutlineNodeAdapterFactoryFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.outline.actions.IContentOutlineNodeAdapterFactory> bindIContentOutlineNodeAdapterFactory() {
		return org.ow2.fractal.mind.idl.outline.FractalIdtOutlineNodeAdapterFactory.class;
	}

	// contributed by org.eclipse.xtext.ui.generator.contentAssist.JavaBasedContentAssistFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.IContentProposalProvider> bindIContentProposalProvider() {
		return org.ow2.fractal.mind.idl.contentassist.FractalIdtProposalProvider.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext.Factory> bindContentAssistContext$Factory() {
		return org.eclipse.xtext.ui.common.editor.contentassist.antlr.ParserBasedContentAssistContextFactory.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrUiGeneratorFragment
	public Class<? extends org.eclipse.xtext.ui.common.editor.contentassist.antlr.IContentAssistParser> bindIContentAssistParser() {
		return org.ow2.fractal.mind.idl.contentassist.antlr.FractalIdtParser.class;
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrUiGeneratorFragment
	public void configureContentAssistLexerProvider(com.google.inject.Binder binder) {
		binder.bind(org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtLexer.class).toProvider(org.eclipse.xtext.parser.antlr.LexerProvider.create(org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtLexer.class));
	}

	// contributed by de.itemis.xtext.antlr.XtextAntlrUiGeneratorFragment
	public void configureContentAssistLexer(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.ui.core.LexerUIBindings.CONTENT_ASSIST)).to(org.ow2.fractal.mind.idl.contentassist.antlr.internal.InternalFractalIdtLexer.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptionsBuilderScope(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider.NAMED_BUILDER_SCOPE)).to(org.eclipse.xtext.builder.builderState.ShadowingResourceDescriptions.class);
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.resource.IResourceDescriptions.class).toProvider(org.eclipse.xtext.builder.GlobalResourceDescriptionsAccess.getDirtyResourceDescriptions()).asEagerSingleton();
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.core.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.eclipse.xtext.builder.nature.NatureAddingEditorCallback.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.resource.containers.IAllContainersState.Provider> bindIAllContainersState$Provider() {
		return org.eclipse.xtext.ui.core.containers.JavaProjectsStateProvider.class;
	}


}
