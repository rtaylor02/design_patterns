package Creational.AbstractFactory;

public class Application {
    private Window window;
    private Scrollbar scrollbar;
    protected WidgetFactory factory;

    public void openWindow() {
        window = factory.windowFactory();
        scrollbar = factory.scrollbarFactory();

        window.display();
        scrollbar.setLocation(10);
    }
}
