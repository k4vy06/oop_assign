class ChatApplication {

    // Thread for sending messages
    static class Sender extends Thread {
        public void run() {
            try {
                System.out.println("Sender Thread Started");
                Thread.sleep(1000);
                System.out.println("Sending message...");
                Thread.sleep(1000);
                System.out.println("Message sent");
            } catch (InterruptedException e) {
                System.out.println("Sender interrupted");
            }
        }
    }

    // Thread for receiving messages
    static class Receiver extends Thread {
        public void run() {
            try {
                System.out.println("Receiver Thread Started");
                Thread.sleep(1500);
                System.out.println("Receiving message...");
                Thread.sleep(1000);
                System.out.println("Message received");
            } catch (InterruptedException e) {
                System.out.println("Receiver interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Thread lifecycle demonstration
        System.out.println("Sender State: " + sender.getState());
        System.out.println("Receiver State: " + receiver.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender State after start: " + sender.getState());
        System.out.println("Receiver State after start: " + receiver.getState());
    }
}
