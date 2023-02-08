package Behavioural.Adapter.example2;

public class SuperDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("Beep..beep..");
    }

    @Override
    public void spinRotors() {
        System.out.println("Spinning rotors..");
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off..");
    }
}
