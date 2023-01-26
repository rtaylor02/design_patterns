package Creational.AbstractFactory;

public abstract class WidgetFactory {
    public abstract Window windowFactory();
    public abstract Scrollbar scrollbarFactory();
}

//interface WidgetFactory {
//    Window windowFactory();
//    Scrollbar scrollbarFactory();
//}
