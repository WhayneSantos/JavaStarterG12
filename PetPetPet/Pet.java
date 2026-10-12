package PetPetPet;

// PILLAR 4 - ABSTRACTION
public abstract class Pet {

    // PILLAR 1 - ENCAPSULATION
    private String name;
    private int age;
    private double cost;

    public Pet(String name, int age, double cost) {
        this.name = name;
        this.age = age;
        setCost(cost);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCost() {
        return cost;
    }

    // Setter with validation
    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Invalid cost!");
        }
    }

    // Abstract method
    public abstract void showCare();
}