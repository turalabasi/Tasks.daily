package Task12;

public class Main {
    public static void main(String[] args) {



    int number = 5; // Faktorialı hesablanacaq ədəd

    long factorial = calculateFactorial(number);
        System.out.println(number + " ədədinin faktorialı: " + factorial);
}

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
