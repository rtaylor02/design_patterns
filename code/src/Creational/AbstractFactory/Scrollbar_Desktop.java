package Creational.AbstractFactory;

public class Scrollbar_Desktop extends Scrollbar {
    @Override
    public void setLocation(int location) {
        System.out.println("Desktop scrollbar is set to " + location);
    }
}
