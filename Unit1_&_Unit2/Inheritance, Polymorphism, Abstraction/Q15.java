import java.util.Scanner;

// Abstract class
abstract class Ride {
    double distance;

    Ride(double distance) {
        this.distance = distance;
    }

    // Abstract method
    abstract double calculateFare();
}

// Bike Ride class
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 5;
    }
}

// Auto Ride class
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 8;
    }
}

// Car Ride class
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    double calculateFare() {
        return distance * 12;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ride[] rides = new Ride[3];

        System.out.print("Enter distance for Bike Ride: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter distance for Auto Ride: ");
        double d2 = sc.nextDouble();

        System.out.print("Enter distance for Car Ride: ");
        double d3 = sc.nextDouble();

        rides[0] = new BikeRide(d1);
        rides[1] = new AutoRide(d2);
        rides[2] = new CarRide(d3);

        System.out.println("\nFare Details:");
        for (Ride r : rides) {
            System.out.println("Distance: " + r.distance + " km");
            System.out.println("Fare: Rs. " + r.calculateFare());
            System.out.println();
        }
    }
}
