import java.util.Scanner;

class TextEditorBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StringBuffer
        StringBuffer sb = new StringBuffer();

        // Accept initial text
        System.out.print("Enter initial text: ");
        String text = sc.nextLine();
        sb.append(text);

        // Append text
        System.out.print("Enter text to append: ");
        String appendText = sc.nextLine();
        sb.append(appendText);

        // Insert text at specific position
        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();

        System.out.print("Enter position to insert: ");
        int position = sc.nextInt();

        sb.insert(position, insertText);

        // Reverse final string
        sb.reverse();

        // Display final string
        System.out.println("Final String after reverse: " + sb);

        sc.close();
    }
}
