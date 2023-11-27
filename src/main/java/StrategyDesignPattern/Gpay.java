package StrategyDesignPattern;

public class Gpay implements PaymentStrategy{
    private String emailId;
    private int mobileNo;

    @Override
    public String toString() {
        return "Gpay{" +
                "emailId='" + emailId + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

    public Gpay(String emailId, int mobileNo) {
        this.emailId = emailId;
        this.mobileNo = mobileNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amt " + amount + " is payed using GPay" + toString());
    }
}
