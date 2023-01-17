package yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOneInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        int prevOneCounter = 0;
        int oneCounter = 0;
        while (counter < 10) {
            int num = 0;
            try {
                num = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                // error in reading or casting
            }
            if (num == 1) {
                oneCounter++;
            } else {
                if (oneCounter > prevOneCounter) {
                    prevOneCounter = oneCounter;
                    oneCounter = 0;
                }
            }
            counter++;
        }
        System.out.println(prevOneCounter);
    }
}
