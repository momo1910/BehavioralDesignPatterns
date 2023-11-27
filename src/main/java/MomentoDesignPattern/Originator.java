package MomentoDesignPattern;

public class Originator {

    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Momento saveMemento(String state){
        return new Momento(state);
    }

    public String getMomento(Momento momento)
    {
        return momento.getState().toString();
    }
}
