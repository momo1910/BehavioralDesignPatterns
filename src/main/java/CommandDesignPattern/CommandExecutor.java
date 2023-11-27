package CommandDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    List<FileOperation> fileOperationList=new ArrayList<>();

    public void executeCommand(FileOperation fileOperation){
        fileOperationList.add(fileOperation);
        fileOperation.execute();
        System.out.println(fileOperationList.size());
    }
}
