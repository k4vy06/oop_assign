import java.util.Scanner;
import java.util.InputMismatchException;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept student age
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            // Example arithmetic operation
            int check = 10 / age;

            // Display age
            System.out.println("Student age is: " + age);
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } 
        catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
