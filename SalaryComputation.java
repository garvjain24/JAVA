import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryComputation {
    public static void main(String[] args) {
        try {
            // Create BufferedReader to read from the console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Input: Basic Salary
            System.out.print("Enter Basic Salary: ");
            double basicSalary = Double.parseDouble(reader.readLine());

            // Calculate allowances and deductions (you can customize these based on your requirements)
            double hra = 0.2 * basicSalary;
            double da = 0.1 * basicSalary;
            double tax = 0.05 * basicSalary;

            // Calculate Gross Salary
            double grossSalary = basicSalary + hra + da - tax;

            // Display the results
            System.out.println("\nSalary Details:");
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Tax: " + tax);
            System.out.println("Gross Salary: " + grossSalary);

            // Close the BufferedReader
            reader.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading input. Please enter valid numeric values.");
        }
    }
}
