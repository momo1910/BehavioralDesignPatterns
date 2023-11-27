package CommandDesignPattern;

public class WordFileOperation implements FileOperation {
    File file;

    public WordFileOperation(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.openFile();
        file.saveFile();
        file.closeFile();
    }
}
