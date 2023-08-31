package task7;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementTask implements Runnable{
    private AtomicInteger counter;

    public IncrementTask(AtomicInteger counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.incrementAndGet(); // Atomic increment operation
        }}
}
