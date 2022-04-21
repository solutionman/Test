package random;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 16;
        Random random = new Random();


        int z = 'z';

//        System.out.println(z);

        char num58 = (char) 58;
        System.out.println(num58);
        char num63 = (char) 63;
        System.out.println(num63);
        char num64 = (char) 64;
        System.out.println(num64);
        char num42 = (char) 42;
        System.out.println(num42);
        char num90 = (char) 90;
        System.out.println(num90);
        char num97 = (char) 97;
        System.out.println(num97);
        char num45 = (char) 45;
        System.out.println(num45);
        char num47 = (char) 47;
        System.out.println(num47);

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);

//        int from = 0;
//        int to = 16;
//        for (int i = 0; i < 100; i++) {
//            int length = random.nextInt(to - from + 1) + from;
//            System.out.println(length);
//        }

    }
}
