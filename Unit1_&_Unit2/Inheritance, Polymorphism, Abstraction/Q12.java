import java.util.Scanner;

// Abstract class
abstract class Payment {
    // Abstract method
    abstract void pay(double amount);
}

// Credit Card Payment class
class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Payment of Rs. " + amount + " paid using Credit Card.");
    }
}

// UPI Payment class
class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("Payment of Rs. " + amount + " paid using UPI.");
    }
}

// Net Banking Payment class
class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Processing Net Banking Payment...");
        System.out.println("Payment of Rs. " + amount + " paid using Net Banking.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
        } else if (choice == 2) {
            payment = new UPIPayment();
        } else {
            payment = new NetBankingPayment();
        }

        payment.pay(amount);
    }
}
