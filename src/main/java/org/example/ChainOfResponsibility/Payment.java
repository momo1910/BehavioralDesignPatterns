package org.example.ChainOfResponsibility;

public class Payment implements State {
    State state;
    @Override
    public void getState() {
        System.out.println("Order payment is completed");

    }

    @Override
    public void setNextState(State state) {
        this.state=state;
        state.getState();
    }
}
