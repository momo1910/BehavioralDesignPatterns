package org.example.ChainOfResponsibility;

public interface State {

    public void getState();
    public void setNextState(State state);
}
