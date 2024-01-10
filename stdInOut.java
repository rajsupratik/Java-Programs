import java.util.InputMismatchException;
import java.util.Scanner;

public class stdInOut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter the first integer:");
            int a = scan.nextInt();

            System.out.println("Enter the second integer:");
            int b = scan.nextInt();

            System.out.println("Enter the third integer:");
            int c = scan.nextInt();

            System.out.println("Entered values:");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            // Close the scanner to prevent resource leak
            scan.close();
        }
    }
}
