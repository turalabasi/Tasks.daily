package Task8;
//8.	Wrapper type la, primitive type arasında nə fərqlər var. Nümunə ilə göstərin.

public class Main {

    public static void main(String[] args){

      //  Java'da wrapper tiplər, primitiv tiplərinin obyekt formasını təmsil edən klasslardır.
        //  Primitiv tiplər əsasən ədədi dəyərləri saxlamaq üçün istifadə olunur
        //  və əməliyyatları daha effektiv və sürətli təmin edir.
        //  Wrapper tiplər isə primitiv tiplərinə əlavə olaraq,
        //  onların obyekt formasını əhatə edən funksional qabiliyyətləri də daxil edir.

        // Primitive type (int)
        int primitiveInt = 10;

// Wrapper type (Integer)
        Integer wrapperInt = Integer.valueOf(primitiveInt);

// Primitiv tiplər ədədi dəyərləri sadəcə dəyişənlərdə saxlayır
        System.out.println("Primitive int: " + primitiveInt);

// // Wrapper tiplər isə əlavə funksional qabiliyyətlərə malikdir.
        System.out.println( Integer.MAX_VALUE);
        System.out.println( Integer.toBinaryString(10));

       // Yuxarıdakı nümunədə, primitiveInt dəyişəni primitiv bir int tipini saxlayır,
        // wrapperInt isə bu int dəyərini Integer wrapper tipində saxlayır
        // və onu əlavə funksionalliqlarla istifadə edirş

       // Primitiv tiplər sadəcə dəyişənlərdə saxlanır
        // və ədədi əməliyyatlar üçün optimal performans təmin edir.
        // Obyekt tipləri (wrapper tiplər) isə primitiv tiplərinin əlavə funksional qabiliyyətlərini əhatə edir
        // və lazımi olduğunda primitiv tipləri obyekt formada istifadə etməyə imkan verir.




    }
}
