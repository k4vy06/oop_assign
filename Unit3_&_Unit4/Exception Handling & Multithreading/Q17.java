class DownloadManager implements Runnable {
    private String fileName;

    // Constructor
    public DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    // Run method executed by thread
    public void run() {
        System.out.println("Downloading " + fileName + "...");
        
        try {
            // Simulate download time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Download interrupted for " + fileName);
        }

        System.out.println(fileName + " Download Complete");
    }

    public static void main(String[] args) {
        // Create Runnable objects
        DownloadManager file1 = new DownloadManager("File1");
        DownloadManager file2 = new DownloadManager("File2");
        DownloadManager file3 = new DownloadManager("File3");

        // Create Thread objects
        Thread t1 = new Thread(file1);
        Thread t2 = new Thread(file2);
        Thread t3 = new Thread(file3);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
