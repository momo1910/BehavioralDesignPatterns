package MediatorDesignPattern;

public abstract class User {
    Mediator mediator;
    String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(String msg);
    public abstract void reciveMessage(String msg);
}
