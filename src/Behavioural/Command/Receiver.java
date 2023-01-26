package Behavioural.Command;

public abstract class Receiver {
    private String message;
    public abstract void send();
    public abstract void read();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
