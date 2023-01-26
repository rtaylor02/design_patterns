package Creational.AbstractFactory;

public class Scrollbar_Mobile extends Scrollbar {
    @Override
    public void setLocation(int location) {
        System.out.println("Mobile scrollbar is set to " + location);
    }
}
