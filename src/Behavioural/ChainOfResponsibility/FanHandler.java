package Behavioural.ChainOfResponsibility;

public class FanHandler extends EmailHandler {
    @Override
    public String processMessage(String emailMessage) {
        String emailType = ""; // Logic to determine the email type
        if(emailType.equals("fan")) {
            // Logic to handle fan emails
            return "Posted as a testimony";
        } else {
            if(getSuccessor() != null) {
                return getSuccessor().processMessage(emailMessage);
            } else {
                return "Request cannot be handled";
            }
        }
    }
}
