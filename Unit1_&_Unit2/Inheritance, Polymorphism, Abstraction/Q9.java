class Calculator {

    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sum of 2 integers: " + obj.add(5, 10));
        System.out.println("Sum of 3 integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 2.5));
    }
}
