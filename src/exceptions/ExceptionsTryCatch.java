package exceptions;

public class ExceptionsTryCatch {
    public static void main(String[] args) {

        Throwable throwable;
        Error error;
        RuntimeException runtimeException;
        Exception exception;

        int one = 1;
        int zero = 0;
        try {
            int rezult = one/zero;
        } catch(ArithmeticException e) {
            System.out.println("get ArithmeticException: " + e.getMessage());
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("throw new Exception");
//        throw new Exception();
//        throw new Error();
//        throw new RuntimeException();
    }
}
