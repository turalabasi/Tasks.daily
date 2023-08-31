package task6;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
//        Java-da bir thread`in icrasını bitirməsini gözləmək üçün join() metodundan istifadə olunur.
//                Bir thread`de join() metodunu çağırdığınız zaman,
//                cari thread öz icrasına davam etməzdən əvvəl hədəf thread`in tamamlanmasını gözləyəcək.
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        thread1.start();
        thread2.start();

        thread1.join(); // Wait for thread1 to finish
        thread2.join(); // Wait for thread2 to finish

        System.out.println("Both threads have finished.");





//        wait and notify:
//        Java-da, çox vaxt sinxronizasiya kontekstində thread`ler arasi əlaqə üçün wait() və notify()
//        metodlarından istifadə olunur.
//                wait() metodu cari thread`in eyni obyektdə notify() metodunu çağırana qədər gözləməsinə səbəb olur.
//    }
}
}
