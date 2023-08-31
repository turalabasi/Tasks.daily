package Task;
//5.	me metNahod ilə enum-ın özünü çağırmağın nə kimi fərqi var?
public class Main {


    public Main() {
    }

    public static void main(String[] args) {
        //	Enumun özünu çağırdığımız zaman, constant`larin kolleksiyasını təmsil edən enum tipinin özünə
        //	istinad edirik. Dəyişənləri elan etmək, metodları müəyyən etmək və enum type`a xas olan
        //	digər əməliyyatları yerinə yetirmək üçün enum type`in ozunden istifade edirik.
        //	yeni enum type da olur chagirdigimiz.

        // Accessing the enum itself
        Level size=Level.HIGH;


        //	name() method ise Enum type tərəfindən təmin edilən daxili method`dur
        //	və eenum constant`inin adini String kimi qaytarir.
        //	Enum constant`inda name() metodunu çağırmaqla onun adını əldə edə bilərik.

        // Calling the name() method
        String size1 = size.name();
        System.out.println(size1);

    }
}

