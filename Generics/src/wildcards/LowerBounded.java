package wildcards;

import java.util.Arrays;
import java.util.List;

public class LowerBounded {
    public static void main(String[] args)
    {
//        Lower Bounded wildcards
        //O, wildcard  (‘?’), ardınca super açar söz, ardınca isə lower boun-serhedi ilə ifadə edilir: <? super A>.


                List<Integer> list1 = Arrays.asList(4, 5, 6, 7);


                printOnlyIntegerClassorSuperClass(list1);

                List<Number> list2 = Arrays.asList(4, 5, 6, 7);

                printOnlyIntegerClassorSuperClass(list2);
            }

            public static void printOnlyIntegerClassorSuperClass(
                    List<? super Integer> list)
            {
                System.out.println(list);
            }

//Burada arqumentlər Integer`i və ya onun superclass`i ola bilər.
// printOnlyIntegerClassorSuperClass metodu yalnız Integer və ya onun supersinif obyektlərini qəbul edəcək.
// Bununla belə, Double növlərinin list`i keçsək, kompilyasiya xətası alacağıq.
// Çünki yalnız Integer field və ya onun superklassı keçə bilər. Double Integerin super sinfi deyil.

}
