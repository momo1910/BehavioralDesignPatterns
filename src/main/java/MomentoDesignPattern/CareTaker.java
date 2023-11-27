package MomentoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Momento> momentoList=new ArrayList<>();

    public void addMomento(Momento m){
        momentoList.add(m);
    }

    public void getMomento(int index){
        System.out.println(momentoList.get(index));
    }
}
