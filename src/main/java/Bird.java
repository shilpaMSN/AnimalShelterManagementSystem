
// Derived Class: Bird
class Bird extends Animal{
    private double wingSpan;
    private boolean canFly;
    // Constructor to initialize bird attributes
    public Bird(String name, int age, double wingSpan, boolean canFly, String healthStatus) {
        super(name, "Bird", age, healthStatus);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    // Override displayInfo method to show bird-specific details
    @Override
    public void displayInfo() {
        System.out.println("Bird: " + name + " | Wing Span: " + wingSpan + "m | Age: " + age + " | Health: " + healthStatus + " | Status: " + (adoptionStatus ? "Adopted" : "Available"));
    }
}
