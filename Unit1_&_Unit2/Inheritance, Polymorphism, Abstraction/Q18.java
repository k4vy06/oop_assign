import java.util.Scanner;

// Bank class
class Bank {
    // Final interest rate
    final double interestRate = 5.5;

    // Method to calculate interest
    double calculateInterest(double amount) {
        double interest = (amount * interestRate) / 100;
        return interest;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();

        System.out.print("Enter amount for Customer 1: ");
        double amount1 = sc.nextDouble();

        System.out.print("Enter amount for Customer 2: ");
        double amount2 = sc.nextDouble();

        System.out.print("Enter amount for Customer 3: ");
        double amount3 = sc.nextDouble();

        System.out.println("\nInterest Details:");
        System.out.println("Customer 1 Interest: " + bank.calculateInterest(amount1));
        System.out.println("Customer 2 Interest: " + bank.calculateInterest(amount2));
        System.out.println("Customer 3 Interest: " + bank.calculateInterest(amount3));
    }
}
