package collections;

import java.util.Deque;
import java.util.LinkedList;

// Deque - Double Ended Queue  двухсторонняя очередь
public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            deque.add(i);
        }

        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
        deque.addFirst(0);
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }
}
