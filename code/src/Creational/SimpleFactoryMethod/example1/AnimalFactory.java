package Creational.SimpleFactoryMethod.example1;

public class AnimalFactory {
    public Animal createAnimal(String animalType) {
        Animal animal;
        switch(animalType.toLowerCase()) {
            case "dog" -> animal = new Dog();
            case "tiger" -> animal = new Tiger();
            default -> {
                System.out.println("I don't know what animal it is.. :(");
                animal = null;
            }
        }

        return animal;
    }
}
