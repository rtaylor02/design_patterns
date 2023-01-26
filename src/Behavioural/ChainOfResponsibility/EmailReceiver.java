package Behavioural.ChainOfResponsibility;

/*
This is how it's done without the Chain of Responsibility (COR) pattern
 */
public class EmailReceiver {
    // Using COR pattern
    private EmailHandler handler;

    public String handleEmail(String emailMessage) {
        //region With COR pattern
        return handler.processMessage(emailMessage);
        //endregion


        //region Without COR pattern
        /*
        String emailType = ""; // Logic to detect email type
        String confirmationMessage = "";

        if (emailType.equals("spam")) {
            // Logic to handle spam emails
            confirmationMessage = "Moved to the spam folder";
        } else if (emailType.equals("fan")) {
            // Logic to handle fan emails
            confirmationMessage = "Posted as a testimony";
        } else if (emailType.equals("complaint")) {
            // Logic to handle complaint emails
            confirmationMessage = "Forwarded to the customer services";
        } else if (emailType.equals("newLoc")) {
            // Logic to handle newLoc emails
            confirmationMessage = "Forwarded to Suggestions and Planning Department";
        } else {
            // Default handling logic
            confirmationMessage = "Left in the inbox";
        }

        return confirmationMessage;
         */
        //endregion
    }

    public void receiveEmail(String emailMessage) {
        String msg = handleEmail(emailMessage);
        System.out.println(msg);
    }

    public EmailHandler getHandler() {
        return handler;
    }

    public void setHandler(EmailHandler handler) {
        this.handler = handler;
    }
}
