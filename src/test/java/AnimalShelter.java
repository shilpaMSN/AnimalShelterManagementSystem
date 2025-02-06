import java.util.ArrayList;
import java.util.List;
// Main Class
public class AnimalShelter {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // List to store all animals
        Staff staff = new Staff(1, "Ramesh", "Veterinarian"); // Creating a staff member
        Adopter adopter = new Adopter(101, "Anish", "Anish@example.com"); // Creating an adopter

        // Adding Animals to the Shelter
        Dog buddy = new Dog("Buddy", 3, "Labrador", true, "Healthy");
        Cat whiskers = new Cat("Whiskers", 2, "White", true, "Healthy");
        Bird tweety = new Bird("Tweety", 1, 0.5, true, "Healthy");
        animals.add(buddy);
        animals.add(whiskers);
        animals.add(tweety);

        // Display All Available Animals
        System.out.println("Available Animals:");
        for (Animal animal : animals) {
            animal.displayInfo();
        }

        // Adopting an Animal
        adopter.adoptAnimal(buddy);

        // Updating Health Status
        staff.assignTask("Check Buddy's health");
        buddy.updateHealthStatus("Recovered");

        // Display Staff Tasks & Adopted Animals
        staff.displayTasks();
        adopter.displayAdoptedAnimals();
    }
}


