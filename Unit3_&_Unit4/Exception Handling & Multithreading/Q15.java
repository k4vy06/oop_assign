import java.util.Scanner;

class BankApplication {

    // Method that throws exception
    static void processTransaction(double balance, double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept balance and withdrawal amount
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            // Call method
            processTransaction(balance, amount);

        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }

        sc.close();
    }
}
