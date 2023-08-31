package Task6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        int dayOfYear = now.getDayOfYear();
        System.out.println("Bu gün ilin " + dayOfYear + "-ci" + " günüdür");
    }
}
