package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        List<String> randomNumbers = new ArrayList<>();
        randomNumbers = generateCorrectNumber();
        for (String num : randomNumbers) {
            System.out.println(num);
        }
    }

    private static List<String> generateCorrectNumber() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 70;
        Random random = new Random();
        List<String> generatedString = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            String num = random.ints(leftLimit, rightLimit + 1)
                    .filter(n -> (n <= 57 || n >= 65) && (n <= 90 || n >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            generatedString.add(num);
        }
        return generatedString;
    }
}
