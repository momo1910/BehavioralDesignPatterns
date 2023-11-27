package VisitorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main (String args1[]){
        Fruit fruit= new Fruit("apple",4,40);
        Book book= new Book("deisgnPatterns",770);

        List<Item> itemList=new ArrayList<>();
        itemList.add(fruit);
        itemList.add(book);
        int getTotal=getTotal(itemList);
        System.out.println("bill Calcualted from ShoppingCart Vistior is "+ getTotal);
    }

    private static int getTotal(List<Item> itemList) {
        ShoppingCartImpl shoppingCart= new ShoppingCartImpl();
        int bill=0;
        for (Item item:itemList) {
            bill+=item.accept(shoppingCart);
        }
        return bill;
    }
}
