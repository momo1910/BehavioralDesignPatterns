package MomentoDesignPattern;

public class Momento {
    public Momento(String state) {
        this.state = state;
    }
    public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Momento{" +
                "state='" + state + '\'' +
                '}';
    }
}
