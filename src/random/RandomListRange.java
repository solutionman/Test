package random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListRange {
    public static void main(String[] args) {
        List<String> randomNumbers = new ArrayList<>();
        randomNumbers = generateNumberByLength(1, 16, 10);
        for (String num : randomNumbers) {
//            System.out.println(num);
        }
        System.out.println("!!!!! next numbers !!!!!");
        randomNumbers = generateIncorrectNumbers(1, 16, 100);
        for (String num : randomNumbers) {
//            System.out.println(num);
            System.out.println("\"" + num + "\",");
        }

        System.out.println("!!!!! next numbers !!!!!");
        randomNumbers = generateNumbers(1, 16, 100);
        for (String num : randomNumbers) {
//            System.out.println("\"" + num + "\",");
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

    private static List<String> generateIncorrectNumbers(int from, int to, int amount) {
        List<String> correctNumbers = generateNumberByLength(from, to, amount);
        List<String> incorrectNumbers = new ArrayList<>();
        final String alphabet = "{*}][!%$@";
        final int N = alphabet.length();
        Random rd = new Random();
        System.out.println(alphabet.charAt(rd.nextInt(N)));
        for (String number : correctNumbers) {
            char[] toChange = number.toCharArray();
            int place = rd.nextInt(toChange.length);
            toChange[place] = alphabet.charAt(rd.nextInt(N));
            incorrectNumbers.add(String.valueOf(toChange));
        }
        return incorrectNumbers;
    }

    private static List<String> generateNumbers(int from, int to, int amount) {
        int leftLimit = '('; // symbol (
        int rightLimit = 'z'; // letter 'z'
        List<String> generatedString = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i < amount; i++) {
            int length = random.nextInt(to - from + 1) + from;
            // фильтруем значения из таблицы ASCII
            String num = random.ints(leftLimit, rightLimit + 1)
                    .filter(n -> (n <= ':' || n >= '?') && n != '@' && n != '*' && (n <= 'Z' || n >= 'a') && n != '-' && n != '/')
                    .limit(length)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
            generatedString.add(num);
        }
        return generatedString;
    }
}
