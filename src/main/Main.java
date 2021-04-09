package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello");
        String numbers = "12а3";
        Integer sum = calculateSum(numbers);
        System.out.println(sum);
        Integer sumStream = calculateSumStream(numbers);
        System.out.println(sumStream);
    }

    // input = 123456
    public static Integer calculateSum(String input) {

        String[] asdf = input.split("");
//        System.out.println(asdf[2]);
        int sum = 0;
        for (String s : asdf) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(s + " не является целым числом");
            }
        }
        return sum;
    }

    public static Integer calculateSumStream(String input) {
        return Arrays.stream(input.split(""))
                .filter(s -> s.matches("\\d+"))
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
