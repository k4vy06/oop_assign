class BankingSystem {
    private int balance = 5000;

    public void withdraw(String user, int amount) {
        synchronized(this) {
            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(user + " Insufficient balance");
            }
        }
    }
}

class Customer extends Thread {
    BankingSystem bank;
    String name;
    int amount;

    Customer(BankingSystem bank, String name, int amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        Customer c1 = new Customer(bank, "Rahul", 2000);
        Customer c2 = new Customer(bank, "Amit", 3000);
        Customer c3 = new Customer(bank, "Neha", 1000);

        c1.start();
        c2.start();
        c3.start();
    }
}
