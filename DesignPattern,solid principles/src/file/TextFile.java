package file;

public class TextFile implements File{
    @Override
    public void open() {
        System.out.println("Opening text file...");
    }
}
