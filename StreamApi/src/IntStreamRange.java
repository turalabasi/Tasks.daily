import java.util.stream.IntStream;

public class IntStreamRange {
    public static void main(String[] args) {

//      IntStream.range Java proqramlaşdırma dilinin java.util.stream paketinin bir hissəsidir
//      və müəyyən diapazonda ardıcıl tam ədədlər ardıcıllığını yaratmaq üçün istifadə olunur.
//      Bu üsul ilk növbədə müəyyən diapazonda tam ədədlər axını yaratmaq üçün istifadə olunur.
        IntStream.range(1, 11)
                .forEach(System.out::println);
    }
}
