//1 ) Classda toStringi override etməklə etməməyin fərqi nədir ?
public class Fruit {
    private String  name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}

