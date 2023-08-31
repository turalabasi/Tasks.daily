package task5;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        synchronized (Main.lock2) {
            System.out.println("Thread 2: Holding lock 2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {
            }
            System.out.println("Thread 2: Waiting for lock 1...");
            synchronized (Main.lock1) {
                System.out.println("Thread 2: Acquired lock 1.");
            }
        }
    }
}
