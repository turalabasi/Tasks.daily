//Task1 .Try-catch exception nədir və nə üçün lazımdır? Kod Nümumə göstərin.
public class Main {
    public static void main(String[] args) {
        try {
            int a= (Integer)null;
            System.out.println(a);
        }
        catch (NullPointerException e) {
            System.out.println("Null ola bilmez");
        }
        System.out.println("davam");

       // Java-da exception`larin idarə edilməsi üçün try-catch blokundan istifadə olunur.
        // Bu, kodunuzun icrası zamanı baş verə biləcək exceptionlar`i idarə etməyə və idarə etməyə imkan verir.
        // Try bloku istisna yarada biləcək koda ev sahibliyi edir, catch bloku isə exception`u tutur və idarə edir.
    }
}

