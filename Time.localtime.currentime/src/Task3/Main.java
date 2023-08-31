package Task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputDate,inputFormatter);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedDate = date.format(outputFormatter);


        System.out.println("Formatted date: " + formattedDate);

    }
}
