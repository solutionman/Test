package readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileToString {
    public static void main(String[] args) {
        String filePath = "/home/dima/Documents/FileToRead/865007156.dat";

        System.out.println(readAllBytes(filePath));
    }

    private static String readAllBytes(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}

