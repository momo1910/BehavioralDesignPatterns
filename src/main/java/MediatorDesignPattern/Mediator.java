package MediatorDesignPattern;

public interface Mediator {
    void sendmessage(String message, User user);
    void addUser(User user);
}
