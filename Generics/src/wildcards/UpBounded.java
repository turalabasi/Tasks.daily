package wildcards;

import java.util.Arrays;
import java.util.List;

public class UpBounded {
    public static void main(String[] args)
    {
//        Sual işarəsi (?) ümumi proqramlaşdırmada wildcard işarə kimi tanınır.
//        Naməlum bir növü təmsil edir. Wildcard simvol parametr, field və ya  dəyişənin növü kimi
//        müxtəlif vəziyyətlərdə istifadə oluna bilər; bəzən return type kimi.

        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));

        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        // printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list2));

//        Up Bounded Wildcards:
//Dəyişən üzrə məhdudiyyətləri yüngülləşdirmək istədiyiniz zaman bu wildcard simvollardan istifadə edilə bilər.
// Məsələn, List < Integer >, List < double > və List < Number > üzərində işləyən metodu yazmaq istədiyinizi deyək,
// bunu yuxarı həddi olan wildcard simvoldan istifadə edərək edə bilərik.
//
//Up Bounded olan wildcard işarəni elan etmək üçün wildcard simvoldan (‘?’),
// ardınca extends açar sözündən və yuxarı sərhədindən istifadə edirik.
    }

    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }

}
