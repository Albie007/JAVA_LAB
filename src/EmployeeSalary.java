import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        double grossSalary = basicSalary + da + hra;

        // Print DA, HRA, Gross Salary as integer if they are whole numbers
        if (da == (long) da) {
            System.out.printf("DA = %d%n", (long) da);
        } else {
            System.out.printf("DA = %.2f%n", da);
        }

        if (hra == (long) hra) {
            System.out.printf("HRA = %d%n", (long) hra);
        } else {
            System.out.printf("HRA = %.2f%n", hra);
        }

        if (grossSalary == (long) grossSalary) {
            System.out.printf("Gross Salary = %d%n", (long) grossSalary);
        } else {
            System.out.printf("Gross Salary = %.2f%n", grossSalary);
        }

        scanner.close();
    }
}
