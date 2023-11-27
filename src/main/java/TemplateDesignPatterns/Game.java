package TemplateDesignPatterns;

public interface Game {
    public void init();
    public void startGame();
    public void endGame();

    public default void intialize(){
        init();
        startGame();
        endGame();
    }
}
