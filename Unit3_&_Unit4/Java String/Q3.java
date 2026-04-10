import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two student names
        System.out.print("Enter first student name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second student name: ");
        String name2 = sc.nextLine();

        // Case-sensitive comparison
        if (name1.equals(name2)) {
            System.out.println("Case-Sensitive Comparison: Names are same");
        } else {
            System.out.println("Case-Sensitive Comparison: Names are different");
        }

        // Case-insensitive comparison
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Case-Insensitive Comparison: Names are same");
        } else {
            System.out.println("Case-Insensitive Comparison: Names are different");
        }

        sc.close();
    }
}
