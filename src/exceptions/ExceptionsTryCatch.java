package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionsTryCatch {
    public static void main(String[] args) {

        Throwable throwable;
        Error error;
        RuntimeException runtimeException;
        Exception exception;

        String noPath = "noPathHere";
        try{
            // checked Exception
            String willBeExcepton = new String(Files.readAllBytes(Paths.get(noPath)));
            System.out.println("never get here because of NoSuchFileException");
        } catch (IOException e){
            System.out.println(e);
        }


        int one = 1;
        int zero = 0;
        try {
            // unchecked Exception
            int rezult = one/zero;
        } catch(ArithmeticException e) {
            System.out.println("get ArithmeticException: " + e.getMessage());
        } catch(Exception e){
            e.printStackTrace();
        } catch (Throwable t){
            // not going to happen
        }
        System.out.println("throw new Exception");
//        throw new Exception();
//        throw new Error();
//        throw new RuntimeException();

        int[] array = {1,2,3};
        try {
            array[0] = 0;
            // unchecked Exception
            array[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
