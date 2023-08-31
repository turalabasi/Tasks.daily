package task3;

public class WriterRunnable implements Runnable{
    private VolatileExample example;

    public WriterRunnable(VolatileExample example) {
        this.example = example;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        example.toggleFlag();
        System.out.println("Flag set to true");
    }









        }
