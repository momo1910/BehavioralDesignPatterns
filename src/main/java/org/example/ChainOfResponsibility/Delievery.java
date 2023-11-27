package org.example.ChainOfResponsibility;

public class Delievery implements State {
    State state;
    @Override
    public void getState() {
       System.out.println("Order is delievered. Enjoy the foood");
    }

    @Override
    public void setNextState(State state) {
        return;
    }
}
