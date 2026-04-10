import java.util.Scanner;

// Base class
class Staff {
    String name;

    Staff(String name) {
        this.name = name;
    }

    void work() {
        System.out.println(name + " works at the hospital.");
    }
}

// Doctor class
class Doctor extends Staff {
    Doctor(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " treats patients and prescribes medicines.");
    }
}

// Nurse class
class Nurse extends Staff {
    Nurse(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " takes care of patients and assists doctors.");
    }
}

// Receptionist class
class Receptionist extends Staff {
    Receptionist(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " manages appointments and patient records.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Staff s1 = new Doctor("Dr. Rahul");
        Staff s2 = new Nurse("Nurse Sneha");
        Staff s3 = new Receptionist("Ankit");

        s1.work();
        s2.work();
        s3.work();
    }
}
