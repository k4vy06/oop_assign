import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    // Method to accept CarId and CarType
    void GetCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car ID: ");
        CarId = sc.nextInt();
        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        CarType = sc.next();
    }

    // Method to calculate rent
    float GetRent() {
        if (CarType.equalsIgnoreCase("Small"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;
        else
            Rent = 0;

        return Rent;
    }

    // Method to display details
    void ShowCar() {
        System.out.println("\nCar Details:");
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL c = new CARRENTAL();
        c.GetCar();
        c.GetRent();
        c.ShowCar();
    }
}
