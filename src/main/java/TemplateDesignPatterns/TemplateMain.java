package TemplateDesignPatterns;

public class TemplateMain {
    public static void main(String args[]){
        Game game=new CricketGame();
        game.intialize();
        Game game1=new FootBallGame();
        game1.intialize();
    }
}
