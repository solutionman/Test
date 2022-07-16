package localclasses;

public class OuterClass {

    static {
        class LocalClass {
            LocalClass(){
                System.out.println("Local class initialized in static initialization");
            }
            void printMessage(String message){
                System.out.println(message);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printMessage("local class created and his method printMessage(String message) working");
        System.exit(0);
    }

    public static void main(String[] args){
        // we never get here
        System.out.println("main class");
    }
}
