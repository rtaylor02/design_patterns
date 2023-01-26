package Creational.FactoryMethod;

public class WordApp extends OfficeApp {
    @Override
    public Document documentFactory() {
        return new WordDocument();
    }

    private class WordDocument extends Document {
        @Override
        public void open() {
            System.out.println("Word doc opened");
        }
    }
}
