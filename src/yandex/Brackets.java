package yandex;

import java.io.IOException;
import java.util.Scanner;

public class Brackets {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        String left = "(";
        String right = ")";
        for (int i = 0; i < amount; i++) {
            System.out.println(left + right);
        }
    }
}
