package exceptions;

public class CustomExceptionTest {
    public static void main(String[] args) throws NoSuchNameException {
        throw new NoSuchNameException("problem");
//        throw new NoSuchNameException();
    }

    public static class NoSuchNameException extends Exception {
        public NoSuchNameException() {
            super();
        }

        public NoSuchNameException(String name) {
            super(name + " reason");
        }
    }
}


