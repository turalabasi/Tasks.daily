package file;

public class ImageExplorerFactory implements  ExplorerFactory{
    @Override
    public File generateFile() {
        return new ImageFile();
    }
}
