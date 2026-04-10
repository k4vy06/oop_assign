class PaymentThread extends Thread {
    public void run() {
        try {
            System.out.println("Processing payment...");
            Thread.sleep(1500); // simulate payment delay
        } catch (InterruptedException e) {
            System.out.println("Payment interrupted");
        }
    }
}

class OrderThread extends Thread {
    public void run() {
        try {
            Thread.sleep(500); // ensure payment starts first
            System.out.println("Order confirmed...");
        } catch (InterruptedException e) {
            System.out.println("Order interrupted");
        }
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create thread objects
        PaymentThread payment = new PaymentThread();
        OrderThread order = new OrderThread();

        // Start threads
        payment.start();
        order.start();
    }
}
