package StrategyDesignPattern;

public class Item {
    public int itemNo;
    public int amount;

    public Item(int itemNo, int amount) {
        this.itemNo = itemNo;
        this.amount = amount;
    }

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
