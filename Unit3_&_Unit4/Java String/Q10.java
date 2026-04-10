import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept password from user
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Get last two characters
        String lastTwo = password.substring(password.length() - 2);

        // Replace all characters with *
        String masked = password.replace(password.substring(0, password.length() - 2), "");
        masked = "*".repeat(password.length() - 2) + lastTwo;

        // Display masked password
        System.out.println("Masked Password: " + masked);

        sc.close();
    }
}
