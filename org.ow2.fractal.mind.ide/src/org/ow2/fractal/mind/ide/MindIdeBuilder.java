package org.ow2.fractal.mind.ide;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.CompilerError;
import org.objectweb.fractal.adl.StaticJavaGenerator.InvalidCommandLineException;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

/**
 * Mind builder. Do noting in lot 1. Keeping for next lot.
 * @author chomats
 *
 */
public class MindIdeBuilder extends IncrementalProjectBuilder {

/**
 * ID of mind ide builder.
 */
	public static final String BUILDER_ID = "org.ow2.fractal.mind.cadse.builder";
	

	@Override
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		IProject currentProject = getProject();
		if (currentProject == null || !currentProject.isAccessible()) return new IProject[0];

		MindProject mp = MindIdeCore.get(currentProject);
		if (mp == null) return new IProject[0];
		
		
		IResourceDelta delta = getDelta(currentProject);
		if (delta == null) {
			fullBuild(monitor, mp.getAllFiles());
		} else  {
			incrementalBuild(delta, monitor, mp);
		} 
		return new IProject[0];
	}	

	protected void fullBuild(final IProgressMonitor monitor, EList<MindFile> mindFiles)
			throws CoreException {
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor, MindProject mp) throws CoreException {
	}
	
	private static final String MINDC_METHOD = "nonExitMain";
	static URLClassLoader mindCClassLoader = null;
	
	
	public static URLClassLoader getMindCClassLoader() {
		if (mindCClassLoader == null) {
			String mindLocation = MindActivator.getPref().getMindCLocation();
			File libMindC = new File(new File( mindLocation), "lib");
			ArrayList<URL> urls = new ArrayList<URL>();
			File[] jars = libMindC.listFiles();
			if (jars != null) {
				for (File j : jars) {
					if (j != null&& j.getName().endsWith(".jar")) {
						try {
							urls.add(j.toURI().toURL());
						} catch (MalformedURLException e) {
							MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Cannot get the url of "+j));
						}
					}
				}
			}
			mindCClassLoader = new URLClassLoader((URL[]) urls.toArray(new URL[urls.size()]), MindIdeBuilder.class.getClassLoader());
		}
		return mindCClassLoader;
	}
	
	public static void computeResolvedMindPath(MindProject mp, Set<MindObject> visited, Set<MindObject> path) {
		if (visited.contains(mp)) return;
		visited.add(mp);
		for (MindPathEntry mpe : mp.getMindpathentries()) {
			if (mpe.getEntryKind() == MindPathKind.SOURCE) {
				MindRootSrc mrs = (MindRootSrc) mpe.getResolvedBy();
				if (mrs != null) {
					path.add(mrs);
				}
			} else if (mpe.getEntryKind() == MindPathKind.PROJECT) {
				MindProject mp2 = (MindProject) mpe.getResolvedBy();
				if (mp2 != null) {
					computeResolvedMindPath(mp2, visited, path);
				}
			} else if (mpe.getEntryKind() == MindPathKind.IMPORT_PACKAGE) {
				MindPackage p = (MindPackage) mpe.getResolvedBy();
				MindRootSrc rs;
				MindProject mp2;
				if (p != null && ((rs = p.getRootsrc()) != null) && ((mp2 = rs.getProject()) != null)) {
					computeResolvedMindPath(mp2, visited, path);
				}
			}
		}
	}
	
	public static void checkFile(IProject project, List<MindFile> filesToCheck) throws InvalidCommandLineException, ADLException {
		MindProject mp = MindIdeCore.get(project);
		if (mp == null) return;
		ArrayList<String> args = new ArrayList<String>();
		
		Set<MindObject> visited = new HashSet<MindObject>();
		Set<MindObject> path = new HashSet<MindObject>();
		computeResolvedMindPath(mp, visited, path);
		for (MindObject mo : path) {
			if (mo instanceof MindRootSrc) {
				IFolder f = MindIdeCore.getResource((MindRootSrc)mo);
				if (f.exists())
					args.add("-S="+f.getLocation().toOSString());
			}
		}
		args.add("-o="+project.getLocation().append("build").toOSString());
		args.add("--check-adl");
		
		for (MindFile mf : filesToCheck) {
			if (mf.eClass() == MindidePackage.Literals.MIND_ADL) {
				args.add(mf.getQualifiedName());
			}
		}
		
		System.out.println("Call mindc :");
		for (String a : args) {
			System.out.println("   "+a);
		}
		
		MindIdeBuilder.mindc((String[]) args.toArray(new String[args.size()]));		
	}
	/**
	 * class : org.ow2.mind.Launcher
method: public static void nonExitMain(final String... args)
      throws InvalidCommandLineException, CompilerInstantiationException,
      ADLException

	 * @param args
	 * @throws ADLException
	 */
	
	static public void mindc(String... args) throws InvalidCommandLineException,
    ADLException {
		String mindClassName =MindActivator.getPref().getMindCMainClass();
		
		if (mindClassName == null || "".equals(mindClassName))
			mindClassName = "org.ow2.mind.Launcher";
		URLClassLoader mindCClassLoader2 = getMindCClassLoader();
		
		try {
			Method method = mindCClassLoader2.loadClass(mindClassName).getMethod(MINDC_METHOD, args.getClass());
			method.invoke(null, (Object) args);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Bad mindc class, (not found method) "+mindClassName, e));
		} catch (ClassNotFoundException e) {
			MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Cannot found the mindc class "+mindClassName ,e));
		} catch (IllegalArgumentException e) {
			MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Bad mindc class, bad signature "+mindClassName,e));
		} catch (IllegalAccessException e) {
			MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Bad mindc class, illegal access on "+mindClassName,e));			
		} catch (InvocationTargetException e) {
			Throwable targetException = e.getTargetException();
			Class c = targetException.getClass();
			Class cbis = ADLException.class;
			if (targetException instanceof ADLException) {
				throw (ADLException) targetException;
			} 
			if (targetException instanceof InvalidCommandLineException) {
				throw (InvalidCommandLineException) targetException;
			}
			if (targetException instanceof CompilerError) {
				throw (CompilerError) targetException;
			}
			
			else
				MindActivator.log(new Status(Status.ERROR, MindActivator.ID, "Bad mindc class, unknown error "+mindClassName, targetException));
		}
	}
	
	/*
	 *
Usage: mindc [OPTIONS] (<definition>[:<execname>])+
  where <definition> is the name of the component to be compiled,
  and <execname> is the name of the output file to be created.

Available options are :
  -h, --help                      Print this help and exit
  -S=<path list>, --src-path      the search path of ADL,IDL and implementation files (list of path separated by ':'). This option may be specified several times.
  -o=<output path>, --out-path    the path where generated files will be put (default is '.')
  -t=<name>, --target-descriptor  Specify the target descriptor
  --compiler-command=<path>       the command of the C compiler (default is 'gcc')
  -c=<flags>, --c-flags           the c-flags compiler directives. This option may be specified several times.
  -I=<path list>, --inc-path      the list of path to be added in compiler include paths. This option may be specified several times.
  --linker-command=<path>         the command of the linker (default is 'gcc')
  -l=<flags>, --ld-flags          the ld-flags compiler directives. This option may be specified several times.
  -L=<path list>, --ld-path       the list of path to be added to linker library search path. This option may be specified several times.
  -T=<path>, --linker-script      linker script to use (given path is resolved in source path)
  -j=<number>, --jobs             The number of concurrent compilation jobs (default is '1')
  -e                              Print error stack traces
  --check-adl                     Only check input ADL(s), do not compile
  -d, --def2c                     Only generate source code of the given definitions
  -D, --def2o                     Generate and compile source code of the given definitions, do not link an executable application
  -F, --force                     Force the regeneration and the recompilation of every output files
  -K, --keep                      Keep temporary output files in default output directory
  -B, --no-bin                    Do not generate binary ADL/IDL ('.def', '.itfdef' and '.idtdef' files).

	 */
	
	public void compile(MindFile f) {
		
	}
	
	public static void changeMindCLocation() {
		mindCClassLoader = null;
	}

}
