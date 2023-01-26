package Creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        OfficeApp officeApp = new WordApp();
        officeApp.newDocument();

        officeApp = new ExcelApp();
        officeApp.newDocument();
    }
}
