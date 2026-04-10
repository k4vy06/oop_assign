// Employee class
class Employee {
    String name;
    int id;

    // Static variable to count employees
    static int employeeCount = 0;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; // Increase count when object is created
    }

    // Method to display employee details
    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println();
    }

    // Static method to display total employees
    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating Employee objects
        Employee e1 = new Employee("Rahul", 101);
        Employee e2 = new Employee("Sneha", 102);
        Employee e3 = new Employee("Amit", 103);

        // Display employee details
        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();

        // Display total employee count
        Employee.displayCount();
    }
}
