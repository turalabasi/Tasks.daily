// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

//        Proqram start() metodunu çağırdıqda yeni thread yaradılır və sonra run() metodu icra olunur.
//                Lakin biz birbaşa run() metodunu çağırsaq, heç bir yeni thread yaradılmayacaq
//        və run() metodu cari çağıran thread `in özündə normal metod çağırışı kimi yerinə yetiriləcək
//        və heç birmulti thrrading baş tutmayacaq.

        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();


//        Yeni Thread icrasi yaratmağın iki yolu var. Bunlardan biri sinifi Thread sinfinin alt sinfi elan etməkdir.
//                Bu alt sinif Thread sinfinin işləmə metodunu override etməlidir.
//        Bundan sonra alt sinifin bir instance`i ayrıla və işə salına bilər.
//                Thread yaratmağın digər yolu Runnable interfeysini həyata keçirən sinfi elan etməkdir.
//        Həmin sinif daha sonra run metodunu həyata keçirir.
//        Bundan sonra sinfin bir instance`i ayrıla, Thread yaratarkən arqument kimi ötürülə və işə salına bilər.

            }
        }

