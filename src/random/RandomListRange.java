package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListRange {
    public static void main(String[] args){
        List<String> randomNumbers = new ArrayList<>();
        randomNumbers = generateNumberByLength(1, 16, 10);
        for (String num : randomNumbers) {
            System.out.println(num);
        }
        System.out.println("!!!!! next numbers !!!!!");
        randomNumbers = generateNumberByLength(17, 25, 10);
        for (String num : randomNumbers) {
            System.out.println(num);
        }

    }

    private static List<String> generateNumberByLength(int from, int to, int amount) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        List<String> generatedString = new ArrayList<>();
        for (int i = 1; i < amount; i++) {
            int length = (int) ((Math.random() * (to - from)) + from);
            String num = random.ints(leftLimit, rightLimit + 1)
                    .filter(n -> (n <= 57 || n >= 65) && (n <= 90 || n >= 97))
                    .limit(length)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            generatedString.add(num);
        }
        return generatedString;
    }
}
