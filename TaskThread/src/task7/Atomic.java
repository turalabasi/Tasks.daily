package task7;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(0);

        Thread thread1 = new Thread(new IncrementTask(counter));
        Thread thread2 = new Thread(new IncrementTask(counter));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Counter value: " + counter.get());


//         Java-da "atom" termini bölünməz və  təhlükəsiz bir əməliyyata aiddir,
//        yəni vahid, fasiləsiz vahid kimi yerinə yetirilir.
//        Çox yivlilik kontekstində atom əməliyyatları məlumatların korlanmasına və ya sinxronizasiya problemlərinə
//        səbəb olmadan çoxlu thread`lerin paylaşılan məlumatlarla qarşılıqlı əlaqədə olmasını təmin edir.
//                Atom əməliyyatları açıq kilidlərdən və ya sinxronizasiya mexanizmlərindən istifadə etmədən
//        dəyişənlərin təhlükəsiz və səmərəli manipulyasiyasına imkan verən sinifləri ehtiva edən
//        java.util.concurrent.atomic paketi tərəfindən təmin edilir.


    }



}
