package task3;

public class VolatileExample {

    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isFlag() {
        return flag;
    }
}