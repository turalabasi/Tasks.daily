package Task8;

import java.util.HexFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2'lik sayı sisteminde bir sayı girin: ");
        String binaryStr = scanner.next();

        int decimalNumber = Integer.parseInt(binaryStr, 2);;
        System.out.println("10'luk sayı sistemindeki değer: " + decimalNumber);


        }





}


