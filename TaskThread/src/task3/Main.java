package task3;

public class Main {
    public static void main(String[] args) {
//        Java-da volatile açar sözdən bir dəyişənin dəyərinin eyni vaxtda bir neçə thread le ilə dəyişdirilə biləcəyini
//        göstərmək üçün istifadə olunur. O, thread volatile dəyişənin dəyərini oxuduqda,
//        ən son dəyəri thread`in yerli keşindən deyil, əsas yaddaşdan oxumasını təmin edir.

        VolatileExample example = new VolatileExample();

        Thread writerThread = new Thread(new WriterRunnable(example));
        Thread readerThread = new Thread(new ReaderRunnable(example));

        writerThread.start();
        readerThread.start();
    }
}
