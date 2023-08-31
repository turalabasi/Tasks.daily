// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Fruit alma = new Fruit ("alma");
       // System.out.println(alma);  ---- without toString

        //ilk variantdda toString method`u ovveride etmədən yoxlasaq,görərik ki,
        // sout zamanı referrence chap olunacaq.
        //Ona görə ki,toString() metodu Fruit sinfində override edilmədiyi üçün
        // Object sinfindən miras qalmış defaultt toString() metodu istifadə olunur.

        Fruit alma = new Fruit ("alma");
        System.out.println(alma);
        //Yuxarıdakı misalda toString() metodu Fruit sinfində override edilib.
        // Yenidən təyin edilmiş metod Fruit obyektinin name instance dəyişəninin dəyərini qaytarır.
        // Nəticə olaraq, System.out.println(apple) icra edildikdə,
        // çıxış Fruit obyektinin string təsviri olan "alma" olacaq.





    }
    }
