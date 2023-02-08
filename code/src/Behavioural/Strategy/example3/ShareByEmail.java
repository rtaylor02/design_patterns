package Behavioural.Strategy.example3;

public class ShareByEmail implements ShareMedium {
    @Override
    public void share() {
        System.out.println("Sharing by email..");
    }
}
