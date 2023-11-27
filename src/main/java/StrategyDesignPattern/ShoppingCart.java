package StrategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }
    public void addItems(Item item){
        itemList.add(item);
    }
    public void removeItems(Item item){
        itemList.remove(item);
    }

    public int getTotalCartAmount(){
        int bill=0;
        for (Item item:itemList) {
            bill+=item.getAmount();
        }
        return bill;
    }
    public void pleasePay(PaymentStrategy paymentStrategy, int amount){
        paymentStrategy.pay(amount);
    }

}
