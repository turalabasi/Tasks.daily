package Task14;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scanner =new Scanner(System.in);
            System.out.println("daxil et:");
            int num=scanner.nextInt();
            int sum=0;
            for (int i = 1; i < 11; i++) {
                sum=num*i ;
                System.out.println("8 * "+ i + " = " + sum);
            }


        }
}
