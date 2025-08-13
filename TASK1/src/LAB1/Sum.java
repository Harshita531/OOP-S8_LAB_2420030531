package LAB1;
import java.util.Scanner;

public class Sum{

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for morning shift earnings
        System.out.print("Enter morning shift earnings (in rupees): ");
        double morningShiftEarnings = scanner.nextDouble();

        // Prompt for evening shift earnings
        System.out.print("Enter evening shift earnings (in rupees): ");
        double eveningShiftEarnings = scanner.nextDouble();

        // Calculate total earnings
        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

        // Display the total earnings
        System.out.println("Total earnings for the day: ₹" + totalDailyEarnings);

        // Close the scanner
        scanner.close();
    }
}