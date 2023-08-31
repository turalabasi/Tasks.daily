public interface FileReadService {
    void readWithReader(String filePath);
    void readWithInputStream(String filePath);
     byte[] readBytes(String filePath);
}
