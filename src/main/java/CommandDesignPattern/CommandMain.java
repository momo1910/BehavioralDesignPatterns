package CommandDesignPattern;

public class CommandMain {
    public static void main(String args[]){
        System.out.println("Welcome to command Pattern");
        CommandExecutor commandExecutor=new CommandExecutor();

        WordFileOperation wordFileOperation=
                new WordFileOperation(new File("abc.docx"));
        PdfFileOperation pdfFileOperation=
                new PdfFileOperation(new File("abc.pdf"));
        commandExecutor.executeCommand(wordFileOperation);
        commandExecutor.executeCommand(pdfFileOperation);

    }
}
