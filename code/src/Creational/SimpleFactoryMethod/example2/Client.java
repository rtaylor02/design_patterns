package Creational.SimpleFactoryMethod.example2;


public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        System.out.print("Creating a dog: ");
        animalFactory.createAnimal(AnimalFactory.Type.DOG);

        System.out.print("Creating a tiger: ");
        animalFactory.createAnimal(AnimalFactory.Type.TIGER);

        System.out.print("Creating a monkey: ");
        // animalFactory.createAnimal("monkey"); // Now it's a compile-time error
    }
}
