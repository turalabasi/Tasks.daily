package Task10;

import java.time.*;

//10.Instant , Clock , Zone ferqler nelerdir numuler gosterin (her birisine aid kod numunesi yazaraq )
public class Main {
    public static void main(String[] args) {
        //Instant :
        //UTC (Əlaqələndirilmiş Universal Saat) zaman qrafikində müəyyən bir zaman nöqtəsini təmsil edir.
        //Nanosaniyəlik dəqiqliklə zamanın dəqiq anını çəkmək üçün uyğundur.
        //Adətən vaxt ştampları, müqayisələr və hesablamalarla bağlı əməliyyatlar üçün istifadə olunur.
        Instant instant = Instant.now();

        System.out.println("Current Instant: " + instant);


        //Clock:
        //
        //Müəyyən bir vaxt qurşağına və ya sistem saatına əsaslanaraq cari tarix və vaxtı təmin edir.
        //Cari vaxtı, tarixi və ya hər ikisini əldə etmək üçün istifadə edilə bilər.
        //Saat qurşağını təyin etmək və ya standart sistem saatından istifadə etmək üçün çeviklik təklif edir.
        //Müəyyən bir saat qurşağında və ya sistem saatında cari vaxtı əldə etmək üçün uyğundur.

        Clock clock = Clock.systemDefaultZone();
        LocalTime currentTime = LocalTime.now(clock);

        System.out.println("Current Time: " + currentTime);


        //Zone:
        //O, saat qurşağı adları, ofsetlər və vaxt zonasına çevrilmələr haqqında məlumat verir.
        //Dünyanın müəyyən bir bölgəsində tarix və vaxt dəyərlərini təmsil etməyə və manipulyasiya etməyə imkan verir.
        //Fərqli bölgələrdə tarix və vaxtları idarə etmək və vaxt zonaları arasında çevirmək üçün uyğundur.


        ZoneId zoneId = ZoneId.of("Pacific/Pago_Pago");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        System.out.println("Current Date and Time in New York: " + zonedDateTime);
    }
}






