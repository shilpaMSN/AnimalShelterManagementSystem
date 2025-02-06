

// Abstract Base Class: Animal
abstract class Animal {
    protected String name, species, healthStatus;
    protected int age;
    protected boolean adoptionStatus;

    // Constructor to initialize animal attributes
    public Animal(String name, String species, int age, String healthStatus) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.healthStatus = healthStatus;
        this.adoptionStatus = false; // Default adoption status is false (not adopted)
    }

    // Method to update the animal's health status
    public void updateHealthStatus(String status) {
        this.healthStatus = status;
    }

    // Method to mark the animal as adopted
    public void adopt() {
        this.adoptionStatus = true;
    }

    // Abstract method to display animal details (implemented in subclasses)
    public abstract void displayInfo();
}

