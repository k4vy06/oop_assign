import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept file name
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        // Find position of dot
        int index = fileName.lastIndexOf('.');

        // Extract extension using substring
        String extension = fileName.substring(index + 1);

        // Display extension
        System.out.println("File Extension: " + extension);

        sc.close();
    }
}
