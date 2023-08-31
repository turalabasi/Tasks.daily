package genericsMethod;

public class Util {
    public static <T> T getLastElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return array[array.length - 1];
    }
}
