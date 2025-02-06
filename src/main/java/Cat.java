// Derived Class: Cat
class Cat extends Animal {
    private String color;
    private boolean indoor;
    // Constructor to initialize cat attributes
    public Cat(String name, int age, String color, boolean indoor, String healthStatus) {
        super(name, "Cat", age, healthStatus);
        this.color = color;
        this.indoor = indoor;
    }

    // Override displayInfo method to show cat-specific details
    @Override
    public void displayInfo() {
        System.out.println("Cat: " + name + " | Color: " + color + " | Age: " + age + " | Health: " + healthStatus + " | Status: " + (adoptionStatus ? "Adopted" : "Available"));
    }
}
