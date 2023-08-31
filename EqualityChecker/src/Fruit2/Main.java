package Fruit2;
//3) Classda equalsı override etməklə etməməyin fərqi nədir ?
public class Main {
    public static void main(String[] args) {


       // Fruit sinifində equals() metodu override edilmediyi halda
        // Object sinifindən miras qalmış default equals() metodundan istifadə edilir.
        // Default equals() metodu obyektlərin referrence`lerinin eyni olub-olmadığını müqayisə edərək,
        // referrence bərabərliyinin yoxlanılmasını həyata keçirir.
        // Bu halda, alma və alma1 ayrı yaddaş yerləri olan iki fərqli obyektdir,
        // buna görə də çıxış "Objects are not equal" olacaq.

        Fruit apple = new Fruit("apple");
        Fruit apple1 = new Fruit("apple");


        if (apple.equals(apple1)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }

      //  Yuxarıdakı misalda Fruit sinfində equals() metodu override edilib.
        //  Üstündən təyin edilmiş equals() metodu ad sahəsinə əsaslanaraq fərdi bərabərlik yoxlamasını həyata keçirir.
        //  O, əvvəlcə müqayisə edilən obyektlərin eyni referrence olub-olmadığını yoxlayır
        //  (this == obj istifadə edərək),
        //  sonra obyektin Fruit ilə eyni sinifdə olub olmadığını yoxlayır
        //  (getClass() != obj.getClass() istifadə edərək).
        //  Nəhayət, iki obyektin ad dəyərlərini müqayisə edir.
        //  Main metodda apple və apple1 obyektlərinin bərabər olub olmadığını yoxlamaq üçün
        //  overridden equals() metodundan istifadə edilir.
        //  Hər iki obyektin ad dəyərləri eyni olduğundan (“alma”), nəticə “Objects are equal” olacaq.


}
}
