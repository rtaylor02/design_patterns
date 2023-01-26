package Behavioural.Command;

public class ReadCommand extends Command {
    @Override
    public void execute() {
        // Common logic for the read command
        getReceiver().read();

        // Clean up after the action was performed
    }
}
