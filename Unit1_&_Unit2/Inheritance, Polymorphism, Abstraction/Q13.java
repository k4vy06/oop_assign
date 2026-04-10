import java.util.Scanner;

// Abstract class Employee
abstract class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Abstract method
    abstract double calculateBonus();

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Manager class
class Manager extends Employee {

    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

// Developer class
class Developer extends Employee {
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    double calculateBonus() {
        return (salary * 0.10) + projectIncentive;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("Rahul", 101, 50000);
        Employee e2 = new Developer("Sneha", 102, 40000, 5000);

        System.out.println("Manager Details:");
        e1.display();
        System.out.println("Bonus: " + e1.calculateBonus());

        System.out.println("\nDeveloper Details:");
        e2.display();
        System.out.println("Bonus: " + e2.calculateBonus());
    }
}
