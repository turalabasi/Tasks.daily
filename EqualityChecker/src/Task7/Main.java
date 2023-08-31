package Task7;
//7) Custom olaraq boolean deyer qaytaran ve iki Strinng tip parameter oture bileceyimiz metod yaradın
// ve hemin deyerlerin beraberliyini yoxlayaraq bize true ve ya false qaytarsın
public class Main {
    public static void main(String[] args) {
        String str1 = "Salam";
        String str2 = "Java";
        boolean isEqual = EqualityChecker.checkEquality(str1, str2);
        System.out.println("Are the strings equal? " + isEqual);
    }
}
