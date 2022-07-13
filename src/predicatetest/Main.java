package predicatetest;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args){
        // Предикаты — это функции, принимающие один аргумент, и возвращающие значение типа boolean.
        Predicate<Integer> sum = num -> num + 2 == 4;

        System.out.println(sum.test(1));
        System.out.println(sum.test(2));


    }
}
