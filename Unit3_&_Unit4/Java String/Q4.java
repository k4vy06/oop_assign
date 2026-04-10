import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept first name
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        // Accept last name
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        // Convert to proper format (First letter capital)
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        // Concatenate names
        String fullName = firstName + " " + lastName;

        // Display full name
        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}
