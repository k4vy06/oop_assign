import java.util.Scanner;

// Employee class
class Employee {
    String name;
    double salary;

    // Constructor using this keyword
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(name, salary);
        }

        // Display employee details
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}
