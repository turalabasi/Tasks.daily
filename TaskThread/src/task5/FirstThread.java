package task5;

public class FirstThread implements Runnable{
    @Override
    public void run() {
        synchronized (Main.lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (Main.lock2) {
                System.out.println("Thread 1: Acquired lock 2.");
            }
        }
    }
}
