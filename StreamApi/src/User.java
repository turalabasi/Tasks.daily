import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("ilqar", 34));
        userList.add(new User("ramal", 25));
        userList.add(new User("Baba", 35));


       List<String> nameList =  userList.stream()
                .map(User::getName)
                .toList();

        List<String> filteredNameList = nameList.stream()
                .filter(name -> name.length() > 4 )
                .toList();
        filteredNameList.forEach(System.out::println);



    }
}
