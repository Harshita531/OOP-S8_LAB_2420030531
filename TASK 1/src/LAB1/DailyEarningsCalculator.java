package LAB1;
import java.util.Scanner;

public class DailyEarningsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter morning shift earnings (in ₹): ");
        double morningShiftEarnings = sc.nextDouble();

        System.out.print("Enter evening shift earnings (in ₹): ");
        double eveningShiftEarnings = sc.nextDouble();

        // Calculation
        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

        // Output
        System.out.println("Total daily earnings: ₹" + totalDailyEarnings);

        sc.close();
    }
}
