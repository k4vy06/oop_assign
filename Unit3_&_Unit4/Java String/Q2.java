import java.util.Scanner;

class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept email address
        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        // Check Gmail address
        if(email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
