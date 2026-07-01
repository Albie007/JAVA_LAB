import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.println("Before Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Technique 1: Swapping using a temporary variable (demonstrated here, then swapped back)
        int temp = a;
        a = b;
        b = temp;

        // Swap back to original to demonstrate Technique 2
        temp = a;
        a = b;
        b = temp;

        // Technique 2: Swapping without a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close();
    }
}