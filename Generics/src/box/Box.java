package box;

public class Box<T> {
    private T contents;

    public void put(T item) {
        contents = item;
    }

    public T get() {
        return contents;
    }
}