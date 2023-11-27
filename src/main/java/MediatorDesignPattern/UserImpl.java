package MediatorDesignPattern;

public class UserImpl extends User {
    public UserImpl(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(this.name + "is sending message "+ msg);
        mediator.sendmessage(msg,this);
    }

    @Override
    public void reciveMessage(String msg) {
        System.out.println(this.name +" Recived message sucessully with contents "+ msg);
    }
}
