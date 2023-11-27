package MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    List<User> userList;

    public MediatorImpl() {
        userList=new ArrayList<>();
    }

    @Override
    public void sendmessage(String message, User user) {
        for (User u: userList) {
              if(u!=user)
                  u.reciveMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
