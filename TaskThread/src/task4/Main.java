package task4;

public class Main {
    public static void main(String[] args) {


//    Java-da synchronized açar sözdən kritik bir bölmə və ya bir anda yalnız bir mövzu ilə əldə edilə bilən
//        kod bloku yaratmaq üçün istifadə olunur. O, yalnız bir thread`in sinxronlaşdırılmış bloku və ya metodu
//        icra edə bilməsini təmin etmək üçün bir yol təqdim edir, eyni vaxtda giriş və potensial məlumatların
//        pozulmasının və ya yarış şəraitinin qarşısını alır.
        SynchronizedExample example = new SynchronizedExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                example.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + example.getCount());


    }
}
