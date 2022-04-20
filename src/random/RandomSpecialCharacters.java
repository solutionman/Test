package random;

import java.util.Random;

public class RandomSpecialCharacters {
    public static void main(String[] args) {

        final String alphabet = "(.,()+:?-/)";
        final int N = alphabet.length();
        Random rd = new Random();
        System.out.println(alphabet.charAt(rd.nextInt(N)));
        int iLength = 16;
        StringBuilder sb = new StringBuilder(iLength);
        for (int i = 0; i < iLength; i++) {
            sb.append(alphabet.charAt(rd.nextInt(N)));
        }
        System.out.println(sb);
    }
}
