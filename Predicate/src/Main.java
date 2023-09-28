

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer number) {
//                return number * number;
//            }
//        };
//        //Function<Integer, Integer> squareFunction = number -> number * number;
//
//        int result = squareFunction.apply(5);
//        System.out.println("Square of 5: " + result);
//    }

//    Consumer<String> customConsumer = new Consumer<String>() {
        //Consumer<String> customConsumer = str -> System.out.println("Custom Consumer: " + str);
        //
        //
        //        customConsumer.accept("yellow");
        //        customConsumer.accept("red");
        //        customConsumer.accept("black");
        //    }
//

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "asanxidmet";
            }
        };
        System.out.println(supplier.get());
    }

}