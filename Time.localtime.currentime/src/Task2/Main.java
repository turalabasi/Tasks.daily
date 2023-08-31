package Task2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //LocalTime və LocalDate Java-nın java.time paketindəki siniflərdir.
        // LocalTime yalnız saatları, dəqiqələri, saniyələri və kəsrli saniyələri, LocalDate isə yalnız ili, ayı və günü təmsil edir.
        // Hər ikisi saat qurşağından asılı olmayaraq yerli tarix və saat məlumatı verir.
        LocalTime now = LocalTime.now();


        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nano = now.getNano();

     //   Bu nümunədə biz LocalTime.now() metodundan istifadə edərək cari yerli vaxtı alırıq.
        //   Sonra LocalTime obyektinin müxtəlif üsullarından istifadə edərək saat, dəqiqə, saniyə və nanosaniyələrə daxil ola bilərik.
        //   Nəhayət, bu dəyərləri çap edirik.
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nano);

//        //LocalDate numunesi:
//        LocalDate now = LocalDate.now();
//
//
//        int year = now.getYear();
//        int month = now.getMonthValue();
//        int day = now.getDayOfMonth();
//
//
//        System.out.println("Year: " + year);
//        System.out.println("Month: " + month);
//        System.out.println("Day: " + day);


//Bu nümunədə biz LocalDate.now() metodundan istifadə edərək cari yerli tarixi alırıq.
// Sonra LocalDate obyektinin müxtəlif üsullarından istifadə edərək il, ay və gün dəyərlərinə daxil ola bilərik. Nəhayət, bu dəyərləri çap edirik.

    }
}
