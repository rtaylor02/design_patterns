package Creational.AbstractFactory;

public class TestDrive {
    public static void main(String[] args) {
        Application app = new DesktopApp();
        app.openWindow();

        app = new MobileApp();
        app.openWindow();
    }
}
