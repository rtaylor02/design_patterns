package Creational.AbstractFactory;

public class DesktopApp extends Application {
    public DesktopApp() {
        factory = new DesktopWidgetFactory();
    }
}
