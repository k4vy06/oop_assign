import java.util.Scanner;

class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override toString() method
    public String toString() {
        return "Student ID: " + id + "\nStudent Name: " + name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Create object
        Student s1 = new Student(id, name);

        // Display object details using toString()
        System.out.println("\nStudent Details:");
        System.out.println(s1.toString());

        sc.close();
    }
}
