package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        String path = "/home/dima/JavaProjects/Test/src/readfile/test.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/dima/JavaProjects/Test/src/readfile/test.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
//            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
