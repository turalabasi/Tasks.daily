package task3;
//3.	Values() – method nə işə yarayır. Nümunə göstərin.
public class Main {
    public static void main(String[] args) {
        //values() və loopdan istifadə edərək Enum üzərində təkrarlama edə
        // bilərik. values() funksiyası dəyərlər üzərində təkrarlaya biləcəyimiz sabitlər kimi
        // Enum dəyərlərinin massivini qaytarır.
        Week[] weeks = Week.values();
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i].getName() + "-" + weeks[i].getDay());

        }
    }
}