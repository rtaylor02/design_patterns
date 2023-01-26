package Behavioural.ChainOfResponsibility;

public abstract class EmailHandler {
    EmailHandler successor;

    public abstract String processMessage(String emailMessage);

    public EmailHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(EmailHandler successor) {
        this.successor = successor;
    }
}
