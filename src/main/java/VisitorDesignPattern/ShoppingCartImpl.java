package VisitorDesignPattern;

public class ShoppingCartImpl implements ShoppingCart{
    int total=0;
    @Override
    public int visit(Book book) {
        return book.getPrice()-10;
    }

    @Override
    public int visit(Fruit fruit) {
        return fruit.getKg()* fruit.getPriceperKg() ;
    }
}
