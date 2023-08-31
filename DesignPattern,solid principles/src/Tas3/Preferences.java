package Tas3;

public class Preferences {
    public static Preferences instance = null;

    protected Preferences() {
    }

    public static Preferences getInstance() {
        if (instance == null) {
             instance = new Preferences();

        }
        return instance;
    }
    public  void HelloSingleton(){
        System.out.println("Hello Single");
    }
}
