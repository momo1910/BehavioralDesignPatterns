package CommandDesignPattern;

public class File {
    String name;

    public File(String name) {
        this.name = name;
    }
    public void openFile(){
        System.out.println("opening a file with name "+ name);
    }
    public void closeFile(){
        System.out.println("Closing a file with name "+ name);
    }
    public void saveFile(){
        System.out.println("Saving a file with name "+ name);
    }
}
