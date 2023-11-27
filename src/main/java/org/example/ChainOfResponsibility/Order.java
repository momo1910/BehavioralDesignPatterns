package org.example.ChainOfResponsibility;

public class Order implements State {
    String order;
    State state;

    public Order(String order) {
        this.order = order;
    }

    @Override
    public void getState() {
        System.out.println("Order Recieved is"+ order.toString());

    }

    @Override
    public void setNextState(State state) {
        this.state=state;
        state.getState();
    }
}
