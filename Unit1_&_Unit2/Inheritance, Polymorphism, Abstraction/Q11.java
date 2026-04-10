import java.util.Scanner;

// Base class
class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

// Derived class Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area of circle
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    double length, breadth;

    // Constructor
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate area of rectangle
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Input for rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        // Create objects
        Circle c = new Circle(r);
        Rectangle rect = new Rectangle(l, b);

        // Display and calculate area
        System.out.println("\n--- Circle ---");
        c.display();
        c.calculateArea();

        System.out.println("\n--- Rectangle ---");
        rect.display();
        rect.calculateArea();
    }
}
