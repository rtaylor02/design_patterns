package Behavioural.ChainOfResponsibility;

public class TestDriver {
    public static void main(String[] args) {
        //region Configure the chain: FanHandler -> SpamHandler -> ComplaintHandler
        FanHandler fanHandler = new FanHandler();
        SpamHandler spamHandler = new SpamHandler();
        ComplaintHandler complaintHandler = new ComplaintHandler();

        fanHandler.setSuccessor(spamHandler);
        spamHandler.setSuccessor(complaintHandler);
        //endregion

        //region Configure the client
        EmailReceiver client = new EmailReceiver();
        client.setHandler(fanHandler); // Set the head of the chain
        client.handleEmail("Message");
        //endregion
    }
}
