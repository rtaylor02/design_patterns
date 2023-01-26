package Creational.AbstractFactory;

public class DesktopWidgetFactory extends WidgetFactory {
    @Override
    public Window windowFactory() {
        return new Window_Desktop();
    }

    @Override
    public Scrollbar scrollbarFactory() {
        return new Scrollbar_Desktop();
    }
}

//public class DesktopWidgetFactory implements WidgetFactory {
//    @Override
//    public Window windowFactory() {
//        return new Window_Desktop();
//    }
//
//    @Override
//    public Scrollbar scrollbarFactory() {
//        return new Scrollbar_Desktop();
//    }
//}
