package Task7;
//7.	Integer parseInt və valueOf arasında nə kimi fərqlər var? Nümunə ilə göstərin.
public class Main {
        public static void main(String[] args) {
           //sout`da nəticə olaraq hər iki halda 28 alınır.
            // amma texniki olaraq bu 2 nəticə arasında fərq var.
            String str="28";
            int num =Integer.parseInt("28");
            //parseInt() metodu Integer class`in statik metodudur
            // və String`i giriş kimi qəbul edir və int dəyərini qaytarır.
            // O, sətri təhlil edir və onu primitiv int tipinə çevirir.
            System.out.println(num);
            Integer integer=Integer.valueOf(28);
            // digər tərəfdən, valueOf() metodu da Integer sinfinin statik metodudur,
            // lakin o, primitiv int dəyərinin əvəzinə Integer obyektini qaytarır.
            // O, daxilen sətri təhlil etmək üçün parseInt() metodunu çağırır
            // və nəticədə int dəyərini Integer obyektinə Wrapping edir.
            //əsas fərq return type`dir.parseInt() primitiv int qaytarır,
            // valueOf() isə İnteger obyektini qaytarır.
            System.out.println(integer);

            }

        }



