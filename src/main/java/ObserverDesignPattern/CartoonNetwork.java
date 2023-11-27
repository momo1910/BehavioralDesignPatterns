package ObserverDesignPattern;

public class CartoonNetwork implements Channel {
    public void getProgramInfo() {
        System.out.println( "Cartoon Channel "+ programInfo);
    }

    public void setProgramInfo(String programInfo) {
        this.programInfo = programInfo;
    }

    private String programInfo;
    @Override
    public void getNewPrograNotification(String programInfo) {
         setProgramInfo(programInfo);
    }
}
