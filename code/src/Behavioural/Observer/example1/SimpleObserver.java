package Behavioural.Observer.example1;

public class SimpleObserver implements Observer {
    private Subject subject;
    private int value;

    public SimpleObserver(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SimpleObserver{" +
                "subject=" + subject +
                ", value=" + value +
                '}';
    }
}
