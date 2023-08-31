package Task6;

public class Main {
    public static void main(String[] args) {
    Fruit alma = new Fruit("alma");
    Fruit alma1=new Fruit("alma");
//    hashCode() override olunmadan:
//Əgər hashCode() metodu Fruit sinfində override olunmamishsa,
// Obyekt sinfindən miras qalmış defaullt tətbiqdən istifadə olunacaq.
// hashCode() funksiyasının standart tətbiqi obyektin yaddaş ünvanını integer şəklində qaytarır.
// Bu halda, alma və alma1 Meyvə sinfinin iki ayrı nümunəsi olduğundan,
// onların müxtəlif yaddaş ünvanları olacaq və nəticədə müxtəlif hash kodları yaranacaq.
// Buna görə də, çıxış "Obyektlər bərabər deyil (hashCode)" olacaq.
//HashCode() override olunarsa:
//Fərdi tətbiq təmin etmək üçün Fruit sinifində hashCode() metodunu override etsek,
// davranış məntiqimizə əsasən dəyişə bilər.
// Əsas tələb odur ki, əgər iki obyekt equals() metoduna görə bərabər hesab edilirsə,
// onların hashCode() qiymətləri eyni olmalıdır.
// Fərz edək ki, biz eyni ada malik meyvələr üçün eyni hash kodunu yaratmaq üçün hashCode() funksiyasını override edirik.

    if (alma.equals(alma1)){
        System.out.println("Hashcodes are egual");
    }
    else {
        System.out.println("Hashcodes are not egual");
    }

}}
