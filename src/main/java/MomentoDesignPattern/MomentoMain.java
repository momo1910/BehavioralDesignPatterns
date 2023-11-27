package MomentoDesignPattern;

public class MomentoMain {
    public static void main (String args[]) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        careTaker.addMomento(originator.saveMemento("New"));
        careTaker.addMomento(originator.saveMemento("Ready"));
        careTaker.addMomento(originator.saveMemento("Running"));
        careTaker.addMomento(originator.saveMemento("Completed"));
        careTaker.getMomento(3);
        careTaker.getMomento(2);
        careTaker.getMomento(1);
    }
}
