package exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionsThrows {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/dima/JavaProjects/Test/src/exceptions/ExceptionsThrows.java");
        // read and print line #4
        String line = Files.readAllLines(path).get(3);
        System.out.println(line);

        // read and print all file
        String filePath = "/home/dima/JavaProjects/Test/src/exceptions/ExceptionsThrows.java";
        String code = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(code);

        String noPath = "noPathHere";
        String willBeExcepton = new String(Files.readAllBytes(Paths.get(noPath)));
        System.out.println("never get here because of NoSuchFileException");

    }
}
