package Task16;

public class Main {
    public static void main(String[] args) {

        String str = "New world";

        int wholeLength= str.length();
        int countAfterDelete= str.replace("w","").length();

        int count = wholeLength - countAfterDelete;

        System.out.println("w ishtirak sayi : " + count);


    }
}
