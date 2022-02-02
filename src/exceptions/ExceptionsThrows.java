package exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionsThrows {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/dima/JavaProjects/Test/src/exceptions/ExceptionsThrows.java");
        String data = Files.readAllLines(path).get(3);
        System.out.println(data);

        String filePath = "/home/dima/JavaProjects/Test/src/exceptions/ExceptionsThrows.java";
        String code = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(code);

    }
}
