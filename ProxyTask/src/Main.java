public class Main {
    public static void main(String[] args) {

        Internet internet = new InternetProxy();
        internet.ConnectTo("acu.org");
        internet.ConnectTo("google.com");

    }
}