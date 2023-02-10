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
    }

    @Override
    public String toString() {
        return "SimpleObserver{" + this.hashCode() + ", value=" + value + "}";
    }

    public void stopObserving() {
        subject.removeObserver(this);
    }
}
