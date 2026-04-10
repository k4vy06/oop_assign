import java.util.Scanner;

class FileProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Simulate file reading
            System.out.println("Reading file...");

            // Simulate file processing input
            System.out.print("Enter number of lines to read: ");
            int lines = sc.nextInt();

            // Simulate exception if lines are negative
            if (lines < 0) {
                throw new Exception("Invalid number of lines");
            }

            System.out.println("File processed successfully");

        } catch (Exception e) {
            System.out.println("Error while reading file");
        } finally {
            // Cleanup message
            System.out.println("Closing file resources");
            sc.close();
        }
    }
}
