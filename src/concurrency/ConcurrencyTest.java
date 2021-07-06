package concurrency;

import java.util.concurrent.atomic.*;

public class ConcurrencyTest {
    public static void main(String[] args) {
        AtomicInteger firstValue = new AtomicInteger(0);
        AtomicInteger secondValue = new AtomicInteger(0);
        int first = 1;

        FirstObject firstObject = new FirstObject();
        firstObject.setValue(0);

    }
}