package Behavioural.Command;

public abstract class Command {
    private Receiver receiver;

    public abstract void execute();

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
