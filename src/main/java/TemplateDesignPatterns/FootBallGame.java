package TemplateDesignPatterns;

public class FootBallGame implements Game{
    @Override
    public void init() {
        System.out.println("FootBall team is getting ready");
    }

    @Override
    public void startGame() {
        System.out.println("FootBall team started Playing");
    }

    @Override
    public void endGame() {
        System.out.println("FootBall team done with Playing");
    }
}
