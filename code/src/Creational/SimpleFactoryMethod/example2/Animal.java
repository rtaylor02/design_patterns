package Creational.SimpleFactoryMethod.example2;

public interface Animal {
    void displayBehaviour();
}

class Dog implements Animal {
    public Dog() {
        displayBehaviour();
    }

    @Override
    public void displayBehaviour() {
        System.out.println("Woof! I'm a dog.");
    }
}

class Tiger implements Animal {
    public Tiger() {
        displayBehaviour();
    }

    @Override
    public void displayBehaviour() {
        System.out.println("Roar! I'm a tiger.");
    }
}