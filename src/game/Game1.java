package game;

import java.util.Locale;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("print some random word: ");
        String input = scanner.next();
        while (input.length() < 5 || input.length() > 10) {
            System.out.println("Word should be less than 10 and more than  5");
            input = scanner.next();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        for (int i = 0; i < input.length(); i++) {
            System.out.print(".");
        }
        System.out.println();
        System.out.println("Print the word again");

        for (int i = 0; i <= 5; i++) {
            String answer = scanner.next();
            if (input.toLowerCase(Locale.ROOT).equals(answer.toLowerCase(Locale.ROOT))) {
                System.out.println("You right!");
                break;
            } else {
                if (i == 5) {
                    System.out.println("You loose");
                    break;
                }
                System.out.println("Guess again: ");
            }

        }

    }
}
