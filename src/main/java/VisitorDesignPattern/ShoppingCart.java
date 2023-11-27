package VisitorDesignPattern;

public interface ShoppingCart {
    public int visit(Book book);
    public int visit(Fruit fruit);

}
