import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
       List<Integer> intLIst = new ArrayList<>();


        intLIst.add(0,2);
        intLIst.add(1,4);
        intLIst.add(2,6);
        intLIst.add(3,8);
        intLIst.add(4,10);

        int sum = intLIst.stream().reduce((x, y) -> x + y)
                .orElse(0);
        System.out.println(sum);

        int result = intLIst.stream().reduce(100,(x,y) -> x*y);
        System.out.println(result);


    }
}
