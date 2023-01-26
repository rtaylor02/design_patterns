package Behavioural.Command;

import java.util.ArrayList;

public class Client_TestDrive {
    public static void main(String[] args) {
        // 2 commands: send & read

        // 3 receivers with corresponding actions: email, sms, notification

        SendCommand sendEmail = new SendCommand();
        EmailReceiver emailReceiver = new EmailReceiver();
        sendEmail.setReceiver(emailReceiver);

        SendCommand sendSms = new SendCommand();
        SmsReceiver smsReceiver = new SmsReceiver();
        sendSms.setReceiver(smsReceiver);

        ReadCommand readEmail = new ReadCommand();
        readEmail.setReceiver(emailReceiver);

        SendCommand readSms = new SendCommand();
        readSms.setReceiver(smsReceiver);

        // The invoker would need the references to the command object (e.g. Context Menu)
        ArrayList<Command> emailContextMenu_Invoker = new ArrayList<>();
        emailContextMenu_Invoker.add(sendEmail);
        emailContextMenu_Invoker.add(readEmail);

        ArrayList<Command> smsContextMenu_Invoker = new ArrayList<>();
        smsContextMenu_Invoker.add(sendSms);
        smsContextMenu_Invoker.add(readSms);

        // When a command is invoked, it will be executed and call the corresponding action of the receiver
        emailContextMenu_Invoker.get(0).execute();
    }
}
