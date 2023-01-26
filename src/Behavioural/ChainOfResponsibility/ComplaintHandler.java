package Behavioural.ChainOfResponsibility;

public class ComplaintHandler extends EmailHandler {
    @Override
    public String processMessage(String emailMessage) {
        String emailType = ""; // Logic to determine the email type
        if(emailType.equals("complaint")) {
            // Logic to handle fan emails
            return "Forwarded to the customer services";
        } else {
            if(getSuccessor() != null) {
                return getSuccessor().processMessage(emailMessage);
            } else {
                return "Request cannot be handled";
            }
        }
    }
}
