package MediatorDesignPattern;

public class MediatorMain {
    public static void main (String args[]){
        MediatorImpl mediator= new MediatorImpl();
        UserImpl user1=new UserImpl(mediator,"priti");
        UserImpl user2=new UserImpl(mediator,"mayand");
        UserImpl user3=new UserImpl(mediator,"digvijay");
        UserImpl user4=new UserImpl(mediator,"sauarbh");
        UserImpl user5=new UserImpl(mediator,"pooja");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);
        user1.sendMessage("Ludo ??");
    }
}
