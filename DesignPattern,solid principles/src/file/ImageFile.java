package file;

public class ImageFile implements File{
    @Override
    public void open() {
        System.out.println("Opening image file...");
    }
}
