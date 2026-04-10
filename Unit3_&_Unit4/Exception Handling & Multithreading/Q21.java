class Restaurant {
    private boolean foodReady = false;

    // Chef prepares food (Producer)
    public synchronized void prepareFood() {
        try {
            if (foodReady) {
                wait();
            }

            System.out.println("Chef prepared food");
            foodReady = true;

            notify();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Waiter serves food (Consumer)
    public synchronized void serveFood() {
        try {
            if (!foodReady) {
                wait();
            }

            System.out.println("Waiter served food");
            foodReady = false;

            notify();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Chef extends Thread {
    Restaurant restaurant;

    Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        restaurant.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant restaurant;

    Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        restaurant.serveFood();
    }
}

public class ProducerConsumerSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Chef chef = new Chef(restaurant);
        Waiter waiter = new Waiter(restaurant);

        chef.start();
        waiter.start();
    }
}
