abstract class Shape {
    // Abstract method
    abstract void calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a Shape");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculate_area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculate_area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        // Shape s = new Shape(); // This will give compilation error

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);

        c.display_info();
        c.calculate_area();

        r.display_info();
        r.calculate_area();
    }
}
