import java.util.ArrayList;
import java.util.List;

// Staff Class
class Staff {
    private int staffId;
    private String name, role;
    private List<String> tasks = new ArrayList<>();

    // Constructor to initialize staff attributes
    public Staff(int staffId, String name, String role) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
    }

    // Method to assign a task to staff
    public void assignTask(String task) {
        tasks.add(task);
    }

    // Method to display staff tasks
    public void displayTasks() {
        System.out.println("Tasks for " + name + ": " + tasks);
    }
}
