package classloaders;

public class PrintClassLoaders {
    public static void main(String[] args) {

        // Bootstrap class loader
        // null - Bootstrap class loader
        System.out.println(String.class.getClassLoader());

        // System class loader
        // sun.misc.Launcher$AppClassLoader@4e0e2f2a (when run from terminal)
        // jdk.internal.loader.ClassLoaders$AppClassLoader@3d4eac69
        System.out.println(PrintClassLoaders.class.getClassLoader());

        // Extensions class loader
        // ?????

    }
}
