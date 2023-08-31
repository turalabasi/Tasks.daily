public interface FileWriteService {
    void writeWithWriter(String filePath,String data);
    void writeWithOutputStream(String filePath,String data);
}
