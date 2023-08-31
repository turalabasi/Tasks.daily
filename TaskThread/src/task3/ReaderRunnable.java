package task3;

public class ReaderRunnable implements Runnable{
    private VolatileExample example;

    public ReaderRunnable(VolatileExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        while (!example.isFlag()) {
            // Busy-wait until flag becomes true
        }
        System.out.println("Flag is now true");
    }







        }
