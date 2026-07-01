import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a=");
        int a = scanner.nextInt();

        System.out.print("b=");
        int b = scanner.nextInt();

        System.out.print("c=");
        int c = scanner.nextInt();

        System.out.print("d=");
        int d = scanner.nextInt();

        System.out.print("e=");
        int e = scanner.nextInt();

        // Evaluate: result = a + b * c - d / e
        // Operator precedence: * and / have higher precedence than + and -, and associate left-to-right.
        int result = a + b * c - d / e;

        System.out.println("Result = " + result);

        scanner.close();
    }
}
