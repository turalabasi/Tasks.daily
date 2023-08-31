package Task2;
// Multiple catch nədir? kod Nümunə göstərin.
public class Main {
    public static void main(String[] args) {
        int a=16;
        int b=0;
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Element at index 3: " + numbers[3]);
            System.out.println(a/b);
        }
        catch (ArithmeticException ex){
            System.out.println("0 a bolme yoxdur");
        }
      catch (ArrayIndexOutOfBoundsException ex){
          System.out.println("Array index out of bounds.");
      }
        catch (Exception e) {
            System.out.println("Error: An exception occurred.");
        }

        System.out.println("davam et");
}}
//Java-da "multiple catch" ifadəsi müxtəlif növ istisnaları ayrıca idarə etmək üçün istifadə edilən bir konstruksiyadır.
// Bu konstruksiya bir try blokunda birdən çox catch(tutma) blokundan istifadə etməklə müxtəlif növ exception`lari tuta və xüsusi hərəkətlər edə bilər.
//Yuxarıdakı kodda massiv icra edilərkən potensial olaraq üç fərqli exception baş verə bilər:
// ArrayIndexOutOfBoundsException, ArithmeticException və bütün digər exception`lari təmsil edən Exception. Bu üç exception`lari növü üçün xüsusi tutma blokları var.
//ArrayIndexOutOfBoundsException catch arrayin hüdudlarından kənarda indeksə daxil olarsa atılır.
// Bütün digər exception növlərini təmsil edən exception tutma bloku əvvəlki tutma bloklarında tutulmayan exception`lari idarə edir.
//Kod işləyirsə, müvafiq tutma bloku istisnanı tutur və müvafiq səhv mesajını çap edir.
//"multiple catch" strukturu müxtəlif növ exception`lari ayrıca idarə etməyə və xüsusi hərəkətləri yerinə yetirməyə imkan verir.
// Bu yolla biz daha spesifik səhv mesajları yarada və xətanı daha effektiv idarə edə bilərik.