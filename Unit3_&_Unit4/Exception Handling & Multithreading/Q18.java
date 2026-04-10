class RailwayReservation {
    private int availableTickets = 2;

    // Synchronized method to avoid double booking
    public synchronized void bookTicket(String passengerName, int tickets) {
        if (tickets <= availableTickets) {
            System.out.println(passengerName + ": Ticket booked successfully");
            availableTickets -= tickets;
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }
}

class Passenger extends Thread {
    RailwayReservation reservation;
    String name;
    int tickets;

    Passenger(RailwayReservation reservation, String name, int tickets) {
        this.reservation = reservation;
        this.name = name;
        this.tickets = tickets;
    }

    public void run() {
        reservation.bookTicket(name, tickets);
    }
}

public class Main {
    public static void main(String[] args) {
        RailwayReservation reservation = new RailwayReservation();

        Passenger p1 = new Passenger(reservation, "Rahul", 1);
        Passenger p2 = new Passenger(reservation, "Amit", 2);
        Passenger p3 = new Passenger(reservation, "Neha", 1);

        p1.start();
        p2.start();
        p3.start();
    }
}
