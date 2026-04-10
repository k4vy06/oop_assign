import java.util.Scanner;

class TextProcessingBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StringBuilder
        StringBuilder sb = new StringBuilder();

        // Accept initial text
        System.out.print("Enter initial text: ");
        String text = sc.nextLine();
        sb.append(text);

        // Append additional text
        System.out.print("Enter text to append: ");
        String appendText = sc.nextLine();
        sb.append(appendText);

        // Display modified string
        System.out.println("Modified String: " + sb);

        sc.close();
    }
}
