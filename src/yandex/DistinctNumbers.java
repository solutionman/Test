package yandex;

import java.io.BufferedReader;
import java.io.FileReader;

public class DistinctNumbers {
    public static void main(String[] args) throws Exception {
//        String path = "/home/dima/JavaProjects/Test/src/yandex/input.txt";
//        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedReader reader = new BufferedReader(new FileReader("./src/yandex/input.txt"));
        String number = reader.readLine();
        String prevNumber = "";
        while (number != null) {
            number = reader.readLine();
            if (!prevNumber.equals(number)) {
                System.out.println(number);
                prevNumber = number;
            }
        }

    }
}
