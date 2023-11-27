package StrategyDesignPattern;

import java.util.Date;

public class DebitCard implements PaymentStrategy{

    private String name;
    private int cardNumber;
    private int cvv;
    private String expiryDate;

    @Override
    public String toString() {
        return "DebitCard{" +
                "name='" + name + '\'' +
                ", cardNumber=" + cardNumber +
                ", cvv=" + cvv +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    public DebitCard(String name, int cardNumber, int cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(int amount) {
       System.out.println("Amt " + amount + " is payed using Debit Card " + toString());
    }
}
