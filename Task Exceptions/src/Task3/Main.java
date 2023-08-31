package Task3;
// Finally nədir və nə zaman işə düşür? Kod  Nümunə göstərin.
public class Main {
    public static void main(String[] args) {

//        Java-da finally bloku exception`un atılıb-atılmamasından asılı olmayaraq icra ediləcək kod bölməsini müəyyən etmək üçün istifadə olunur.
//         Exception`un tutulmasından və ya daha da yayılmasından asılı olmayaraq finally bloku həmişə icra olunacaq.
        try {

            int result = 10/2;
            System.out.println("Result: " + result);
        }
        finally {          //Finally blokdan den evvel System.exit tipli xana gelerse ,bu yegane haldir ki,Finally blok icra olunmayacaq,cuhnki sistemden bir defelik çıxırıq bu halda.

            System.out.println("Finally block executed.");
        }
        //Yuxarıdakı kodda try bloku bölgü əməliyyatını yerinə yetirməyə cəhd edir,
        // əgər bölücü sıfırdırsa, bu, ArithmeticException-a səbəb ola bilər. İstisna baş verərsə, səhv mesajı çap edən catch bloku tərəfindən tutulur.
        //Bununla belə, istisnanın baş verib-verməməsindən asılı olmayaraq, finally bloku həmişə icra olunacaq. Bu halda, o, "Finally blok icra edildi i" mesajını çap edir.
        //Finally blok açıq resursların bağlanması, kilidlərin buraxılması
        // və ya əməliyyatların yekunlaşdırılması kimi müəyyən təmizləmə əməliyyatlarının və ya hərəkətlərin yerinə yetirilməsini təmin etmək istədiyimiz ssenarilər üçün faydalıdır.
        // Bu, exception`lardan asılı olmayaraq həmişə işlədilməli olan kritik kodun icrası üçün etibarlı bir yol təqdim edir.
    }
        }



