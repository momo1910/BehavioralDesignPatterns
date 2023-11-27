package org.example.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Prepare prepare=new Prepare();
        Payment payment=new Payment();
        Delievery delievery=new Delievery();
        Order order=new Order("Vada Pav");
        order.getState();
        order.setNextState(prepare);
        prepare.setNextState(payment);
        payment.setNextState(delievery);

    }

}