package Task13;

public class Main {
    public static void main(String[] args) {

        int totalMinutes = 3456789;

        int minutesPerDay = 24 * 60;
        int minutesPerYear = 365 * minutesPerDay;

        int years = totalMinutes / minutesPerYear;
        int remainingMinutes = totalMinutes % minutesPerYear;
        int days = remainingMinutes / minutesPerDay;


        System.out.println(totalMinutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}


