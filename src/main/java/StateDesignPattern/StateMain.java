package StateDesignPattern;

public class StateMain {
    public static void main(String args[]){
        Context context=new Context();
        PlayState playState=new PlayState();
        context.setCurrentState(playState);
        context.getCurrentState().performActions();
        System.out.println(context.getCurrentState().toString());
        PauseState pauseState=new PauseState();
        context.setCurrentState(pauseState);
        context.getCurrentState().performActions();
        System.out.println(context.getCurrentState().toString());
    }
}
