package CommandDesignPattern;

public class PdfFileOperation implements FileOperation{
    File file;

    public PdfFileOperation(File file) {
        this.file = file;
    }

    @Override
    public void execute() {
       file.openFile();
       file.saveFile();
       file.closeFile();
    }
}
