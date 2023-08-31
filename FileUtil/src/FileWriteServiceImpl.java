import java.io.*;

import static java.nio.file.Files.write;

public class FileWriteServiceImpl implements FileWriteService{

    @Override
    public void writeWithWriter(String filePath, String data) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("file is created");

            }
            FileWriter writer = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
            writer.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public void writeWithOutputStream(String filePath, String data) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("file is created");

            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write("hello java".getBytes());
            fileOutputStream.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    }

