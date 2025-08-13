package LAB2;
import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(number); // Handle negative numbers

        // Calculate sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Output
        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
