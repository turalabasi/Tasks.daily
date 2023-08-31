package Task9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
//
//    Duration və Period, Java-nın java.time paketində vaxtın uzunluğunu təmsil edən siniflərdir. Bununla belə, onlar istifadə etdikləri vahidlərə və vaxt intervallarını idarə etmə üsullarına görə fərqlənirlər.
//
//    Budur Duration ve Period: arasındakı fərqlərin bölgüsü:
//
//    Müddət:
//
//    Saatlar, dəqiqələr, saniyələr və nanosaniyələr baxımından zaman uzunluğunu təmsil edir.
//    Keçən vaxt baxımından iki an arasındakı vaxtı ölçür.
//    Zamanın iki xüsusi nöqtəsi arasındakı müddəti hesablamaq üçün uyğundur.
//    Adətən daha dəqiq şəkildə vaxta əsaslanan hesablamalar üçün istifadə olunur.
//    Dövr:
//
//    İllər, aylar və günlər baxımından bir müddətin uzunluğunu təmsil edir.
//    Təqvimə əsaslanan vahidlər baxımından iki tarix arasındakı vaxtı ölçür.
//    Tarixlərlə işləmək və onlara düzəlişlər etmək üçün uyğundur.
//    Adətən tarixə əsaslanan hesablamalar və tarixləri manipulyasiya etmək üçün istifadə olunur.
//
//
//        LocalDate startDate = LocalDate.of(2022, 1, 1);
//        LocalDate endDate = LocalDate.of(2023, 12, 31);
//
//        Period period = Period.between(startDate, endDate);
//        int years = period.getYears();
//        int months = period.getMonths();
//        int days = period.getDays();
//
//        System.out.println("Period: " + years + " years, " + months + " months, and " + days + " days");


        LocalTime startTime = LocalTime.of(11, 05, 56);
        LocalTime endTime = LocalTime.of(12, 30, 0);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println(duration);
    }

}



