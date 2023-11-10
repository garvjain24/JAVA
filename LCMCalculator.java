import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM
        int lcm = calculateLCM(num1, num2);

        // Display the result
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Function to calculate the LCM using GCD (Greatest Common Divisor)
    private static int calculateLCM(int num1, int num2) {
        // Calculate GCD using Euclidean Algorithm
        int gcd = calculateGCD(num1, num2);

        // Calculate LCM using the formula: LCM = (num1 * num2) / GCD
        return (num1 * num2) / gcd;
    }

    // Function to calculate GCD using Euclidean Algorithm
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
