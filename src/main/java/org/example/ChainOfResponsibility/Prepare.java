package org.example.ChainOfResponsibility;

public class Prepare implements State {
    State state;

    @Override
    public void getState() {
        System.out.println("order is been Prepared");
    }

    @Override
    public void setNextState(State state) {
        this.state=state;
        state.getState();
    }
}
