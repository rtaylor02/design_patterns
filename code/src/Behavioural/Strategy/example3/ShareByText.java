package Behavioural.Strategy.example3;

public class ShareByText implements ShareMedium {
    @Override
    public void share() {
        System.out.println("Sharing by text..");
    }
}
