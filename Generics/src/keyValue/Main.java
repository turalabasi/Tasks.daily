package keyValue;

public class Main {
    public static void main(String[] args) {
        KeyValuePair<String, Integer> pair1 = new KeyValuePair<>("age", 25);
        KeyValuePair<String, String> pair2 = new KeyValuePair<>("name", "John");

        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
    }

}
