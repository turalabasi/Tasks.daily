import com.sun.source.tree.IfTree;

public class PredicateImpl implements Predicate<Integer>{
    @Override
    public boolean test(Integer t) {
        if (t % 2 == 0){
            return  true;
        }
        return false;
    }
}
