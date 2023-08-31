package Fruit2;
//3) Classda equalsı override etməklə etməməyin fərqi nədir ?
public class Fruit {
    private String  name;

    public Fruit(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Fruit other = (Fruit) obj;
        return name.equals(other.name);
    }
}
