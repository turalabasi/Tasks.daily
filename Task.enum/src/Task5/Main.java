package Task5;
//10.	Var nədir və nə üçündür? Nümunələrlə izah edin.
public class Main {
    public static void main(String[] args){
        //Java-da var keyword`u dəyişənləri yaratmaq üçün istifadə olunur. Bu keyword, bir dəyişənin mövcud olub olmadığını yoxlamaq üçün istifadə olunur.
        // "var"``ın əsas qaydaları bunlardır:
        //"var" keyword`unu istifadə etmək üçün dəyişəni bir dərəcədə təyin etmək lazımdır. Yəni, dəyişəni bir dəyər əldə etməklə təyin edəcəyimizdən əmin olmalıyıq.
        //"var" keyword`u uyğun tipin təyin edildiyi dəyişənlər üçün təyin edilir.
        //Bir dəyişəni “var” keyword`u ilə təyin etdiyinizdən sonra, dəyişənin yenidən təyin edilməsi lazım deyil və Java avtomatik olaraq uyğun tipi tanıya bilir.

        var name = "Ayaz";
        var age = 28;

        System.out.println("my name is " + name + " \n " + "I am " + age + " years old.");
        //Yuxarıdakı kod hissəsində, "age" dəyişəni bir integer tipi ilə təyin edilir
        // və onun dəyəri 25 olur. "name" dəyişəni isə bir string tipi ilə təyin edilir və onun dəyəri "John" olur.


      //1.	var -  yalnız local dəyişən olaraq istifadə oluna bilər.
        //2.	var – çağırıldığı yerdə initial olunmalıdır.
        //3.	Var – methodlara parameter olaraq yazıla bilməz


        //Example 2: Using var with arithmetic operations:
        var x = 5;
        var y = 3;
        var sum = x + y;
        System.out.println(sum);
        //Burada “x”, “y” və “sum” dəyişənlərinin arifmetik əməliyyat əsasında int tipli oldugunu çıxarışını edirik.
        //Compiler toplama əməliyyatının nəticəsinin integer olduğunu tanıyır.

        //Example 3: Using var in a for loop:

        var numbers = new int[]{5, 2, 8, 4, 5};
        for (var num : numbers) {
            System.out.print(num + " ");
        }

        // Bu misalda, "var" keyword`ü iteration zamanı "numbers" massivindəki elementlərin növünü müəyyən etmək üçün istifadə olunur.



    }
}