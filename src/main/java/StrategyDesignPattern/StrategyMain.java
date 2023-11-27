package StrategyDesignPattern;

public class StrategyMain {
    public static void main(String args[]){
        Item item= new Item(1,10);
        Item item1= new Item(2,80);
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addItems(item);
        shoppingCart.addItems(item1);
        int bill =shoppingCart.getTotalCartAmount();
        shoppingCart.pleasePay(new DebitCard("priti",123,456,"16.02.2090"),bill);
        shoppingCart.pleasePay(new Gpay("abc.gmail.com",11122334),bill);
    }
    /*here strategy is sleected at runtime . In state pattern context was to be send "*
    Another exmaple Uber ->Car, Public Transhport , Auto (diff startegy of covering Route from Point A to point B
    Depending upon which user has selected that stragey will come /
     */
}
