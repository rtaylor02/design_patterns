package Behavioural.Command;

public class SmsReceiver extends Receiver {
    @Override
    public void send() {
        // Logic to send message
        System.out.println(getMessage() + " was sent in an SMS");
    }

    @Override
    public void read() {
        // Logic to read message
        System.out.println(getMessage() + " was read in an SMS");
    }
}
