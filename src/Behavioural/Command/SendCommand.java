package Behavioural.Command;

public class SendCommand extends Command {
    @Override
    public void execute() {
        // Common logic for the send command
        getReceiver().send();

        // Clean up after the action was performed
    }
}
