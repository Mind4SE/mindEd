package org.ow2.fractal.mind.idl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class FractalItfStandaloneSetup implements ISetup {

	public static void doSetup() {
		new FractalItfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.ow2.fractal.mind.idl.FractalItfRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://www.ow2.org/fractal/mind/idl/FractalItf")) {
		EPackage.Registry.INSTANCE.put("http://www.ow2.org/fractal/mind/idl/FractalItf", org.ow2.fractal.mind.idl.fractalIDL.FractalIDLPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		org.eclipse.xtext.resource.IResourceServiceProvider serviceProvider = injector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("itf", resourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("itf", serviceProvider);
		



	}
}
