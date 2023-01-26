package Creational.AbstractFactory;

public class MobileWidgetFactory extends WidgetFactory {
    @Override
    public Window windowFactory() {
        return new Window_Mobile();
    }

    @Override
    public Scrollbar scrollbarFactory() {
        return new Scrollbar_Mobile();
    }
}

//public class MobileWidgetFactory implements WidgetFactory {
//    @Override
//    public Window windowFactory() {
//        return new Window_Mobile();
//    }
//
//    @Override
//    public Scrollbar scrollbarFactory() {
//        return new Scrollbar_Mobile();
//    }
//}
