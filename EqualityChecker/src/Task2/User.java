package Task2;
//2) User classı yaradın name ve surname fildleri yer alsın hemin ,sonra main classında Userin obyektin yaradaraq constraktrina deyer oturun sonra
//2.1)toString() metodunu overrive ederek cap edin
//2.2)toString() metodundan istifade etmədən consolda deyerleri cap edin
//hip(User classında fildleri return eden bir method yaradaraq)

public class User {
    private String name;
    private String surname;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

      @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public String getInfo() {
        return name + " " + surname;
    }
}
