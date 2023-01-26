package Behavioural.ChainOfResponsibility;

public class SpamHandler extends EmailHandler {
    @Override
    public String processMessage(String emailMessage) {
        String emailType = ""; // Logic to determine the email type
        if(emailType.equals("spam")) {
            // Logic to handle fan emails
            return "Moved to the spam folder";
        } else {
            if(getSuccessor() != null) {
                return getSuccessor().processMessage(emailMessage);
            } else {
                return "Request cannot be handled";
            }
        }
    }
}
