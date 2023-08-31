package Task9;
//9. printStackTrace(), getMesaage və toString() , getClouse nədir? Numune kodlar yazın
public class Main {
    public static void main(String[] args)
    {
        try
        {
            int a = 20/0;
        } catch (Exception e)
        {
//1.Java-da printStackTrace() metodu exceptionlari və xətaları idarə etmək üçün istifadə olunan bir vasitədir.
// Bu, istisnanın baş verdiyi sətir nömrəsi və sinif adı kimi digər detallarla birlikdə throwable`i çap edən Java-nın Throwable sinifinin üsuludur.
//printStackTrace() exceptıon"ların diaqnostikasında çox faydalıdır. Məsələn, kodunuzdakı beş metoddan biri exceptıon"a səbəb olarsa,
// printStackTrace() metodun exceptıon"u qaldırdığı dəqiq xətti təyin edəcək.Bu metoddan istifadə etməklə biz iki nöqtə ilə ayrılmış exceptıon"un adını (məsələn, java.lang.ArithmeticException) və təsvirini  (e.g. / by zero)
// və növbəti sətirdə stack izini (kodda həmin exceptıon"un baş verdiyi yerdə) alacağıq

            e.printStackTrace();
            System.out.println( e);
            System.out.println("---------------------------------------------------------------");


            //2. getMessage():
            //Bu üsul exception ilə əlaqəli xəta mesajını ehtiva edən String qaytarır.
            //Bu istifadəçiyə qısa səhv mesajı göstərmək və ya giriş məqsədləri üçün faydalıdır..

            System.out.println("2. getMessage() usulu ile cavab : " + e.getMessage());
            System.out.println("---------------------------------------------------------------");
            //3.toString():
            //Bu üsul, sinif adı və error mesajı daxil olmaqla, exception`un String təsvirini qaytarır.
            //O, tez-tez exception məlumatlarını insan tərəfindən oxuna bilən formatda qeyd etmək və ya göstərmək üçün istifadə olunur.

            System.out.println("3. toString() usulu ile cavab : " + e.toString());
            System.out.println("---------------------------------------------------------------");
        }

            System.out.println("davam et");
    }
}


