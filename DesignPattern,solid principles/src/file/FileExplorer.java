package file;

public class FileExplorer {
    private  ExplorerFactory explorerFactory;

    public FileExplorer(ExplorerFactory explorerFactory) {
        this.explorerFactory = explorerFactory;
    }
    public  void openFile(){
        File file = explorerFactory.generateFile();
        file.open();
    }
}
