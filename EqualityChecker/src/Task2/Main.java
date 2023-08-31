package Task2;
//2) User classı yaradın name ve surname fildleri yer alsın hemin ,sonra main classında Userin obyektin yaradaraq constraktrina deyer oturun sonra
//2.1)toString() metodunu overrive ederek cap edin
//2.2)toString() metodundan istifade etmədən consolda deyerleri cap edin
//hip(User classında fildleri return eden bir method yaradaraq)

public class Main {
    public static void main(String[] args) {

        User user = new User("Jack","London");
        System.out.println(user.toString()); //toString methodu ile chap
        System.out.println(user.getInfo()); // toString olmadan

        //Yuxarıdakı nümunədə İstifadəçi sinfində ad və soyad adlı iki xüsusi sahə var.
        //  Class`in konstruktorunda dəyərlər bu sahələrə təyin edilir.
        // toString() metodu ad və soyad dəyərlərini birləşdirərək tam adı qaytarır.
        // Bundan əlavə, getİnfo() adlı metod müəyyən edilir
        // və bu üsul da ad və soyad dəyərlərini birləşdirərək tam adı qaytarır.
        //Main sinifində İstifadəçi sinfinin nümunəsi yaradılır
        // və dəyərlər toString() metodundan və ya getInfo() metodundan istifadə etməklə konsola çap olunur.
        // Hər iki üsul istifadə edilə bilər və eyni nəticəni verə bilər.
        // Nümunədəki çıxış "Jack London" kimi göstəriləcək.

    }
}
