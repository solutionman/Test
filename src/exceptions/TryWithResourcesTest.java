package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("/home/dima/JavaProjects/Test/src/exceptions/test.txt"))){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("no such file");
        }
    }
}
