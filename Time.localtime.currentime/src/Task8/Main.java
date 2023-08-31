package Task8;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//. LocaleTime.now() çap edərkən, mikrosaniyələri necə silə bilərik? Nümunə göstərin
public class Main {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedTime = currentTime.format(formatter);

        System.out.println( formattedTime);
    }
}
