package VisitorDesignPattern;

public class Fruit implements Item{
    private String fruitName;
    private int kg;
    private int priceperKg;

    public Fruit(String fruitName, int kg, int priceperKg) {
        this.fruitName = fruitName;
        this.kg = kg;
        this.priceperKg = priceperKg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getPriceperKg() {
        return priceperKg;
    }

    public void setPriceperKg(int priceperKg) {
        this.priceperKg = priceperKg;
    }

    @Override
    public int accept(ShoppingCart shoppingCart) {
        return shoppingCart.visit(this);
    }
}
