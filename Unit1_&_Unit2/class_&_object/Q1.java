class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating two objects
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Sneha", 22);

        // Printing details
        p1.display();
        p2.display();
    }
}
