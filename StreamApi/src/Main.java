import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);

            int maxNumber = integerList.stream()
                    .max(Integer::compareTo)
                    .orElse(0);
                                 System.out.println("maxNumber : " + maxNumber);

            int minNumber = integerList.stream()
                    .min(Integer::compareTo)
                    .orElse(0);
                                 System.out.println("minNumber : " + minNumber);

                    //ededlerin cemi
            int sum = integerList.stream().reduce(0,(a,b)-> a+b);
            //ve ya int sum = integerList.stream()
        //                .mapToInt(Integer::intValue)
        //                .sum();
        //        System.out.println("Cem: " + sum);


        System.out.println("sum : " + sum);
        //ededlerin kvadratlari cemi
        List<Integer>  squares = integerList.stream()
                .map(x -> x *x )
                .collect(Collectors.toList());
        System.out.println("squares : " + squares);


        List<Integer> factorial = integerList.stream()
                .map(n -> IntStream.rangeClosed(1, n)
                        .boxed()
                        .reduce(1, (x, y) -> x * y))
                        .toList();
        System.out.println("faktorial  : " + factorial);



    }


}