import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;
    float Amount;

    // Function to calculate amount
    float Compute() {
        Amount = Days * Charges;
        if (Amount > 11000) {
            Amount = 1.02f * Amount;
        }
        return Amount;
    }

    // Function to get information
    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();
        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    // Function to display information
    void DispInfo() {
        Compute();
        System.out.println("\nResort Details:");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("Days of Stay: " + Days);
        System.out.println("Total Amount: " + Amount);
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}
