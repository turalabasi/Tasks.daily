package box;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Java-da generiklər sizə tip təhlükəsizliyini təmin etməklə yanaşı
//        müxtəlif növlərdə işləyən siniflər, interfeyslər və metodlar yaratmağa imkan verir.
//                Sinif səviyyəsində generikləri necə təyin edə biləcəyiniz nümunəsi:
        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);
        System.out.println(" integerBox: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.put("Hello, Generics");
        System.out.println(" stringBox: " + stringBox.get());
        //Bu misalda Box sinfi T tip parametri ilə müəyyən edilmişdir.
        // Bu tip parametr boxun saxlaya biləcəyi məzmunun növünü təmsil edir.
        // Put metodu T tipli arqument alır, get metodu isə T tipli dəyəri qaytarır.
        //
        //Box sinifinin nümunələrini yaratdığınız zaman box`un bucaqlı mötərizədə (<>) saxlayacağı faktiki növü
        // təyin edirsiniz. Əsas metodda tam dəyəri saxlamaq üçün Box<Integer> nümunəsi,
        // sətri saxlamaq üçün isə Box<String> nümunəsi yaradılır.
        //
        //Generics, sinifləri kompilyasiya zamanı həll edilə bilən növlərlə parametrləşdirməklə,
        // type`in düzgünlüyünü təmin etməklə və casting ehtiyacını azaltmaqla təkrar istifadə edilə bilən
        // və tip üçün təhlükəsiz kod yaratmağa imkan verir.(type safety)


    }
}
