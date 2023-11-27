package StateDesignPattern;

public class PauseState implements State{
    @Override
    public void performActions() {
        System.out.println("Song is paused");

    }
     public String toString(){
        return  "PAUSE STATE";
     }
}
