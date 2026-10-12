package PetPetPet;

// PILLAR 2 - INHERITANCE
class Dog extends Pet {

    public Dog(String name, int age, double cost) {
        super(name, age, cost);
    }

    // PILLAR 3 - POLYMORPHISM
    @Override
    public void showCare() {
        System.out.println("Care: Walk the dog daily.");
    }
}

class Cat extends Pet {

    public Cat(String name, int age, double cost) {
        super(name, age, cost);
    }

    // PILLAR 3 - POLYMORPHISM
    @Override
    public void showCare() {
        System.out.println("Care: Clean the cat's litter box.");
    }
}

public class Main {
    public static void main(String[] args) {

        Pet[] pets = {
            new Dog("Naldo", 3, 1500),
            new Cat("Muman", 2, 1000)
        };

        for (Pet pet : pets) {
            System.out.println("\nName: " + pet.getName());
            System.out.println("Age: " + pet.getAge());
            System.out.println("Monthly Cost: PHP " + pet.getCost());

            pet.showCare();
        }

        // Test invalid cost
        System.out.println("\nTesting invalid cost:");
        pets[0].setCost(-500);

        System.out.println("Cost: PHP " + pets[0].getCost());
    }
}