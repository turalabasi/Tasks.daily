public class FunctionImpl implements Function<Integer,Integer> {




    @Override
    public Integer apply(Integer number) {
        return number * number;
    }

}
