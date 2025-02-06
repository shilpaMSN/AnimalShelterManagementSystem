// Derived Class: Dog
class Dog extends Animal{
    private String breed;
    private boolean trained;

    // Constructor to initialize dog attributes
    public Dog(String name, int age, String breed, boolean trained, String healthStatus) {
        super(name, "Dog", age, healthStatus);
        this.breed = breed;
        this.trained = trained;
    }

    // Override displayInfo method to show dog-specific details
    @Override
    public void displayInfo() {
        System.out.println("Dog: " + name + " | Breed: " + breed + " | Age: " + age + " | Health: " + healthStatus + " | Status: " + (adoptionStatus ? "Adopted" : "Available"));
    }
}