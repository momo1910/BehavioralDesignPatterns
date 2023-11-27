package TemplateDesignPatterns;

public class CricketGame implements Game{
    @Override
    public void init() {
        System.out.println("Cricket team is getting ready");
    }

    @Override
    public void startGame() {
        System.out.println("Cricket team started Playing");
    }

    @Override
    public void endGame() {
        System.out.println("Cricket team done with Playing");
    }
}
