package classloaders;

public class PrintClassLoaders {
    public static void main(String[] args){

        // null - Bootstrap class loader
        System.out.println(String.class.getClassLoader());

        // sun.misc.Launcher$AppClassLoader@4e0e2f2a - System class loader (when run from terminal)
        // jdk.internal.loader.ClassLoaders$AppClassLoader@3d4eac69 - System class loader
        System.out.println(PrintClassLoaders.class.getClassLoader());

    }
}
