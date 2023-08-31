package Task4;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //.of() metodu xüsusi tarix və vaxt obyektlərinin nümunələrini,inctance`larini yaratmaq üçün java.time paketindən Java-nın tarix və vaxt siniflərində istifadə olunur.
        // Bu, müəyyən dəyərlərə malik obyektlər qurmağa imkan verən statik bir üsuldur.
        LocalDate date = LocalDate.of(2023, 7, 14);
        System.out.println("LocalDate: " + date);

        //Bu kodda biz LocalDate və LocalTime obyektlərinin xüsusi nümunələrini yaratmaq üçün .of() metodundan istifadə edirik.
        //LocalDate üçün biz 14 iyul 2023-cü il tarixini təmsil edən LocalDate obyekti yaratmaq üçün LocalDate.of(2023, 7, 14) istifadə edirik.
        //LocalTime üçün 15:30:00 vaxtı təmsil edən LocalTime obyekti yaratmaq üçün LocalTime.of(15, 30, 0) istifadə edirik.
        LocalTime time = LocalTime.of(16, 57, 0);
        System.out.println("LocalTime: " + time);


        //.of() metodu hər bir komponent üçün getter&setter metodlardan istifadə etmədən tarix və vaxt obyektlərinin xüsusi nümunələrini yaratmaq üçün
        // əlverişli yoldur. O, tarix və vaxt obyektləri yaratarkən istədiyimiz dəyərləri müəyyən etmək üçün aydın və oxunaqlı bir yol təqdim edir.
    }
}
