import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class anyMatch {
    public static void main(String[] args) {


        boolean anyMatch = Stream.of(2,4,6,8,10)
                .anyMatch(i -> i >6);
        System.out.println(anyMatch);  //netice - true

        boolean allMatch = Stream.of(3,5,7,9,11)
                .allMatch(i-> i%2 != 0);
        System.out.println(allMatch); //netice - true

        boolean noneMatch = Stream.of(3,5,7,9,11)
                .noneMatch(i -> i%2 ==0);

        System.out.println(noneMatch); //netice - true

    }
}
