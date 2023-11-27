package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgenecy {
    private String programName;
    List<Channel> channelList;

    public NewsAgenecy() {
        channelList=new ArrayList<>();
    }
    public void addChannel(Channel c){
        channelList.add(c);
    }

    public void removeChannel(Channel c){
        channelList.remove(c);
    }

    public void setProgramName(String programName) {
        this.programName = programName;
        for (Channel c: channelList) {
            c.getNewPrograNotification(programName);
        }
    }
}
