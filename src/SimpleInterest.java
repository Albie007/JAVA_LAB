import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Time: ");
        double time = scanner.nextDouble();

        double si = (principal * rate * time) / 100;
        double amount = principal + si;

        // Since output can be integer or double depending on values, we can cast/format nicely
        // Let's print as int if they are integers, or check formatting:
        // Expected Output:
        // Simple Interest = 600
        // Amount = 5600
        if (si == (long) si) {
            System.out.printf("Simple Interest = %d%n", (long) si);
        } else {
            System.out.printf("Simple Interest = %.2f%n", si);
        }

        if (amount == (long) amount) {
            System.out.printf("Amount = %d%n", (long) amount);
        } else {
            System.out.printf("Amount = %.2f%n", amount);
        }

        scanner.close();
    }
}
