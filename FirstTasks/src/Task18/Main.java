package Task18;

public class Main {
    public static String foo(String s, char c, int count) {
        for (int i = 0; i < count; i++) {
            s += c;
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "java";
        char c = 'c';
        int count = 8;
        String result = foo(s, c, count);
        System.out.println(result);
    }
}
