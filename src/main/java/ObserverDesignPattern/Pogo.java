package ObserverDesignPattern;

public class Pogo implements Channel{
    private String programInfo;

    public void getProgramInfo() {
        System.out.println("Pojo channel "+ programInfo);
    }

    public void setProgramInfo(String programInfo) {
        this.programInfo = programInfo;
    }

    @Override
    public void getNewPrograNotification(String programInfo) {
        setProgramInfo(programInfo);
    }
}
