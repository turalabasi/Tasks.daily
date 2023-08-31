import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//1.	LocaleDateTime nədir? Numune kodu yazın
//	5. Bir tarixi ay gün il olarağ ayrı ayrılığda çap edin.
      //  Nümumə: month - 01, Year - 2023, day - 10
//2 tapsirigin da cavabi burdadi

public class Main {
    public static void main(String[] args) {
        //LocaleDateTime Java-nın java.time paketinə daxil olan sinifdir.
        // Bu sinif yerli tarix və vaxt məlumatlarını təmsil etmək üçün istifadə olunur.
        // Buraya yerli vaxt zonasındakı tarix və vaxt dəyərləri daxildir, lakin saat qurşağı parametrləri və ya saat qurşağı deyil.
        // Create a LocalDateTime object with specific date and time
        LocalDateTime dateTime = LocalDateTime.of(2023, 7, 14, 15, 30, 0);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);


        System.out.println("Formatted Date and Time: " + formattedDateTime);
//Bu nümunədə il, ay, gün, saat, dəqiqə və ikinci dəyərləri təqdim etməklə of() metodundan istifadə edərək LocalDateTime obyekti yaradırıq.
// Daha sonra DateTimeFormatter istifadə edərək LocalDateTime formatını təyin edilmiş nümunəyə uyğun olaraq String (ay/gun/tarix) təsvirə çevirmək üçün formatlayırıq.
//Biz həmçinin müxtəlif alıcı metodlarından (getYear(), getMonthValue(), getDayOfMonth(), getHour(), getMinute(), getSecond()) istifadə edərək
// LocalDateTime obyektinin fərdi komponentlərinə daxil olur və onları ayrıca çap edirik.

        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();


        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
    }

    }
