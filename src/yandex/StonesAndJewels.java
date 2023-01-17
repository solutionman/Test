package yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesAndJewels {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String J = r.readLine();
        String S = r.readLine();

        int result = 0;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (J.indexOf(ch) >= 0) {
                ++result;
            }
        }
        System.out.println(result);
    }
}
