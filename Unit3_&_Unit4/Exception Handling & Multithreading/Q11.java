import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept account balance
            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            // Accept withdrawal amount
            System.out.print("Enter Withdrawal Amount: ");
            double withdraw = sc.nextDouble();

            // Check balance
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance = balance - withdraw;
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + balance);
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
