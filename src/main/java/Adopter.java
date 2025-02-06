import java.util.ArrayList;
import java.util.List;

// Adopter Class
class Adopter {
    private int adopterId;
    private String name, contactInfo;
    private List<Animal> adoptedAnimals = new ArrayList<>();

    // Constructor to initialize adopter attributes
    public Adopter(int adopterId, String name, String contactInfo) {
        this.adopterId = adopterId;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Method to adopt an animal
    public void adoptAnimal(Animal animal) {
        if (!animal.adoptionStatus) {
            animal.adopt(); // Mark the animal as adopted
            adoptedAnimals.add(animal);
            System.out.println(name + " has adopted " + animal.name + ".");
        } else {
            System.out.println(animal.name + " is already adopted.");
        }
    }

    // Method to display adopted animals
    public void displayAdoptedAnimals() {
        System.out.println(name + "'s Adopted Animals:");
        for (Animal animal : adoptedAnimals) {
            animal.displayInfo();
        }
    }
}