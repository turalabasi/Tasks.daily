package file;

public class TextExplorerFactory implements ExplorerFactory{
    @Override
    public File generateFile() {
        return new TextFile();
    }
}
