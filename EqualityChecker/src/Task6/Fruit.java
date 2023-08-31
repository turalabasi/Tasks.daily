package Task6;

import java.util.Objects;

//6) Classda hashCode() override etməklə etməməyin fərqi nədir ?
public class Fruit {
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return Objects.equals(name, fruit.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
