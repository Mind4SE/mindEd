
/*
 * generated by Xtext
 */
 
package org.ow2.mindEd.adl.textual.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class FractalExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.ow2.mindEd.adl.textual.ui.internal.FractalActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.ow2.mindEd.adl.textual.ui.internal.FractalActivator.getInstance().getInjector("org.ow2.mindEd.adl.textual.Fractal");
	}
	
}