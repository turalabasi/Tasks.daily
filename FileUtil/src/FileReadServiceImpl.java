import java.io.*;

public class FileReadServiceImpl implements  FileReadService{


    @Override
    public void readWithReader(String filePath) {
        File file = new File(filePath);
        if (!file.exists()){
            System.err.println("File does not exist");
            return;
        }
        try {
            FileReader fileReader = new FileReader(file);
            int c;
            String str = "";
            while ((c = fileReader.read()) != -1);{
                str += (char) c;
            }
            System.out.println(str);

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void readWithInputStream(String filePath) {
        File file = new File("C:\\Users\\Gagi\\Pictures\\comment.png");
        if (!file.exists()){
            System.err.println("File does not exist");
            return;
        }
        try {
            InputStream inputStream = new FileInputStream(file);
            int c;
            String str = "";
            inputStream.readAllBytes();
            while ((c = inputStream.read()) != -1);{
                str += (char) c;
            }
            System.out.println(str);

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
@Override
    public byte[] readBytes(String filePath) {

        File file = new File("C:\\Users\\Gagi\\Pictures\\comment.png" + filePath);
        byte [] bytes = {};
        if (!file.exists()) {
            System.err.println("File does not exist");
            return bytes;
        }
        try {
            InputStream inputStream = new FileInputStream(file);
             bytes = inputStream.readAllBytes();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return bytes;
    }
}
