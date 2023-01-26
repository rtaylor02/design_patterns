package Creational.FactoryMethod;

public abstract class OfficeApp {
    public abstract Document documentFactory();

    public void newDocument() {
        Document document = documentFactory();
        document.open();
    }

    static abstract class Document {
        public abstract void open();
    }
}
