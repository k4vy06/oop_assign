class ThreadPrioritySystem extends Thread {

    public ThreadPrioritySystem(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }

    public static void main(String[] args) {
        // Create threads
        ThreadPrioritySystem t1 = new ThreadPrioritySystem("Low Priority Thread");
        ThreadPrioritySystem t2 = new ThreadPrioritySystem("Medium Priority Thread");
        ThreadPrioritySystem t3 = new ThreadPrioritySystem("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
