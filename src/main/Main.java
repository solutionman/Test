package main;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello");

        String numbers = "123";
        Integer sum = calculateSum(numbers);
        System.out.println(sum);
    }

    // input = 123456
    public static Integer calculateSum(String input){

        String [] asdf = input.split("");
//        System.out.println(asdf[2]);
        Integer sum = 0;
        for(String s : asdf){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
