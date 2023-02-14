package Creational.SimpleFactoryMethod.example1;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.print("Creating a dog: ");
        animalFactory.createAnimal("DOG");

        System.out.print("Creating a tiger: ");
        animalFactory.createAnimal("Tiger");

        System.out.print("Creating a monkey: ");
        animalFactory.createAnimal("monkey");
    }
}
