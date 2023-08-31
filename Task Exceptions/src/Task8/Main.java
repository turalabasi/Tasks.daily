package Task8;

import java.io.PrintStream;

//Hansı exceptionları tanıyırsız, 3ünü nümunə göstərin. Və proqram olaraq yazın.
public class Main {
    public static void main(String[] args) {

       try {
           String invalidNumber = "world";
           int parsedNumber = Integer.parseInt(invalidNumber);

           System.out.println(parsedNumber);
           int[] numbers = { 3, 2, 7 };
           System.out.println("Element at index 3: " + numbers[3]);
       }
       catch (NumberFormatException ex){
           System.out.println(" Invalid number format"); //NumberFormatException Java-da unchecked exception`dur.
           // və səhv formatlı stringi rəqəmsal dəyərə çevirməyə cəhd edildikdə baş verir. Buna görə də, bu exception stringi rəqəmli tipə (məsələn, int, float) çevirmək mümkün olmadıqda atılır.
       }
       catch (ArrayIndexOutOfBoundsException ex) {
           System.out.println("Error: Array index out of bounds."); //Bu istisna massiv elementinə daxil olmaq üçün etibarsız indeksdən istifadə edildikdə baş verir.

           }
       catch (Exception ex){
           System.out.println("Error: An exception occurred."); // bu Exception növü istifaadə etdən zaman,biz seçilmiş xususi bir exception növünü deyil,
           // üzləşə biləcəyimiz hər hansı exceptionu filterləmiş oluruq.
       }

        System.out.println("davam et");



    }
}
