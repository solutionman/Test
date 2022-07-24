package collections;

import java.util.ArrayList;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
