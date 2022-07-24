package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        // Элементы очереди
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.add(6);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
