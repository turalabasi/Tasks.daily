package Task2;

public class Main {
    public static void main(String[] args) {

        String t = "             1,e 6,e 0,e 9,e           ";
        t.replace(",e "," ").trim();

        String str = "1 6 0 9";
        String [] numbers =str.split(" ");



        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number= Integer.parseInt(numbers[i]);
            sum= number*number;
            System.out.println(sum);


        }


    }
}
