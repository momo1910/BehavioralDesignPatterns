package StateDesignPattern;

public class PlayState implements State{
    @Override
    public void performActions() {
        System.out.println("Song is playing....");

    }
     public String toString(){
        return "Start State";
     }

}
