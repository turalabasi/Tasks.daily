package task5;
public class Main {
        public static Object lock1 = new Object();
        public static Object lock2 = new Object();
        public static void main(String[] args) {
            Thread thread1 = new Thread(new FirstThread());
            Thread thread2 = new Thread(new SecondThread());

            thread1.start();
            thread2.start();
//            Monitor:
//            multi -threading proqramlaşdırmada monitor sinxronizasiya üçün istifadə olunan anlayışdır.
//                      Monitor sinxronizasiyanı təmin etmək üçün kodun kritik hissələrinə girişi məhdudlaşdıran
//            bir quruluşdur. Java-da monitorlar yaratmaq üçün sinxronlaşdırılmış açar sözdən istifadə olunur.
//            Lock:
//            Kilid monitorda kritik bölmələrə girişi idarə etmək və sinxronlaşdırmaq üçün istifadə edilən mexanizmdir.
//                    Java-da Lock interfeysi və onu həyata keçirən siniflər daha çevik sinxronizasiya
//            və kilidləmə mexanizmlərini təmin edir.
//
//                    Deadlock:
//
//            Deadlock çoxlu thread`ler bloklandıqda baş verir, hər biri başqa bir thread tərəfindən saxlanılan
//            resurs gözləyir və nəticədə thread`lerinheç birinin davam edə bilməyəcəyi vəziyyət yaranır.
//                    Bu, thread`lerin mahiyyət etibarilə ilişib qaldığı və proqramın irəliləyə bilmədiyi bir vəziyyətdir.



        }
    }

