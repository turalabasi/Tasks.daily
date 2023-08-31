package Task6;

public class Main {
    public static void main(String[] args) {
    int num1 = 12345;
    int num2 = 6789;

    int lastDigitSum = getLastDigitSum(num1, num2);
        System.out.println("Sonuncu rəqəmlərin cəmi: " + lastDigitSum);
}

    public static int getLastDigitSum(int num1, int num2) {
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        return lastDigit1 + lastDigit2;
}}
