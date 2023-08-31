package Task4;
//4) equals() methodu  və  == opertorunu  fərqi nədir
//        Misal olaraq bunu String uzerinde numune ederek yazın .

public class Main {
    public static void main(String[] args) {

        String str = "demir";
        String str1= "demir";
        String str2= new String("demir");

        System.out.println(str.equals(str1)); //true
        System.out.println(str.equals(str2));//true
      //Obyektlərin bərabərliyini yoxlamaq üçün equals() metodundan istifadə olunur.
        // Bu üsul iki obyektin məzmununu müqayisə edir
        // və onların bərabər olub-olmadığını göstərən boolean dəyəri qaytarır.
        // Sinifdə equals() metodu override olunmadiqda,
        // o, standart olaraq referrence bərabərliyinin yoxlanılmasına xidmət edir.
        // Başqa sözlə, müqayisə edilən iki obyektin eyni yaddaş yerinə aid olub olmadığını yoxlayır.
        // Bununla belə, equals() metodu çox vaxt bir çox siniflərdə xüsusi məntiq əsasında bərabərlik yoxlamalarını yerinə yetirmək üçün fərdiləşdirilir.
        //Yuxarıdakı misalda str1 və str2 dəyişənləri eyni sətir dəyərinə malikdir (“demir”).
        // equals() metodu bu iki string`in məzmununu müqayisə edir və nəticə olaraq doğrunu qaytarır.
        // Eynilə, str1 və str3 dəyişənlərinin müxtəlif yaddaş ünvanlarına malik olmasına baxmayaraq,
        // bərabər() metodu yenə də doğrunu qaytarır, çünki stringlerin məzmunu eynidir.

        System.out.println(str==str1);//true
        System.out.println(str==str2);//false

        //Yuxarıdakı misalda str1 və str2 dəyişənləri eyni string dəyərinə malik olduqları üçün
        // eyni yaddaş ünvanını paylaşırlar.
        // Buna görə də, == operatoru bu halda doğru qaytarır.
        // Bununla belə, str1 və str3 dəyişənlərinin fərqli yaddaş ünvanları var,
        // çünki str3 new açar sözü ilə yeni sətir obyekti yaradaraq ayrıca yaddaş sahəsi ayırmışdır.
        // Beləliklə, == operatoru bu halda false qaytarır.
        //Nəticədə, equals() metodu obyektlərin məzmun bərabərliyini,
        // == operatoru isə obyektlərin referrence bərabərliyini yoxlayır.
        // String sinfi kontekstli müqayisə üçün equals() metodunu xüsusi olaraq uyğunlaşdırmışdır.
        // Bununla belə, digər siniflərin equals() metodu override olunmadigi halda halda,
        // referrence bərabərliyi standart olaraq yoxlanılır.


    }
}
