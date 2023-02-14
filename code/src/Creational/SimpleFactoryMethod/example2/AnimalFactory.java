package Creational.SimpleFactoryMethod.example2;

public class AnimalFactory {
    public enum Type { DOG, TIGER };

    public Animal createAnimal(Type animalType) {
        Animal animal;
        switch(animalType) {
            case DOG -> animal = new Dog();
            case TIGER -> animal = new Tiger();
            default -> {
                System.out.println("I don't know what animal it is.. :(");
                animal = null;
            }
        }
        return animal;
    }
}
