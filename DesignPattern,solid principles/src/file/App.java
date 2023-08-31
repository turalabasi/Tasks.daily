package file;

public class App {
    public static void main(String[] args) {
        ExplorerFactory textExplorerFactory = new TextExplorerFactory();
        FileExplorer textFileExplorer = new FileExplorer(textExplorerFactory);
        textFileExplorer.openFile();

        System.out.println("");
        ExplorerFactory imageExplorerFactory = new ImageExplorerFactory();
        FileExplorer imageFileExplorer = new FileExplorer(imageExplorerFactory);
        imageFileExplorer.openFile();
    }

    }


