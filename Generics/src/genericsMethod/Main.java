package genericsMethod;

import static genericsMethod.Util.getLastElement;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
        String[] stringArray = { "iron", "knife", "spoon" };

        Integer lastInt = getLastElement(intArray);
        System.out.println("Last element of intArray: " + lastInt);

        String lastString = getLastElement(stringArray);
        System.out.println("Last element of stringArray: " + lastString);
    }
}








