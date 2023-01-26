package Creational.FactoryMethod;

public class ExcelApp extends OfficeApp {
    @Override
    public Document documentFactory() {
        return new ExcelDocument();
    }

    private class ExcelDocument extends Document {
        @Override
        public void open() {
            System.out.println("Excel doc opened");
        }
    }
}
