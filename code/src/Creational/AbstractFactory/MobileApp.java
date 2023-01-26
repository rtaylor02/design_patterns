package Creational.AbstractFactory;

public class MobileApp extends Application {
    public MobileApp() {
        factory = new MobileWidgetFactory();
    }
}
