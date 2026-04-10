import java.util.Scanner;

// Base class Person
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void role() {
        System.out.println(name + " is a Person.");
    }
}

// Employee class extends Person
class Employee extends Person {
    int empId;

    Employee(String name, int empId) {
        super(name);
        this.empId = empId;
    }

    void role() {
        System.out.println(name + " is an Employee with ID: " + empId);
    }
}

// Manager class extends Employee (Multilevel Inheritance)
class Manager extends Employee {
    String department;

    Manager(String name, int empId, String department) {
        super(name, empId);
        this.department = department;
    }

    void role() {
        System.out.println(name + " is a Manager of " + department + " department.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Person p1;
        Person p2;
        Person p3;

        p1 = new Person("Rahul");
        p2 = new Employee("Sneha", 101);
        p3 = new Manager("Amit", 201, "IT");

        p1.role();
        p2.role();
        p3.role();
    }
}
