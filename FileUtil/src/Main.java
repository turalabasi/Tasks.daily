import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    FileReadService readService;
    FileWriteService writeService;

    Main() {
        readService = new FileReadServiceImpl();
        writeService = new FileWriteServiceImpl();

    }

    public static void main(String[] args) {

                        Main main = new Main();
        byte[] bytes = main.readService.readBytes("comment.png");
        for (byte b : bytes){
        System.out.println(b);


    }
}}