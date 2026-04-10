class MusicPlayer extends Thread {

    public void run() {
        try {
            System.out.println("Playing song...");

            for (int i = 1; i <= 3; i++) {
                System.out.println("Progress " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        // Create thread object
        MusicPlayer mp = new MusicPlayer();

        // Start thread
        mp.start();
    }
}
