package LAB2;
import java.util.Scanner;

public class GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first interval (in hours): ");
        int num1 = sc.nextInt();

        System.out.print("Enter second interval (in hours): ");
        int num2 = sc.nextInt();

        // Compute GCD using Euclidean Algorithm
        int a = num1, b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Output
        System.out.println("GCD (Optimal joint maintenance cycle) = " + a + " hours");

        sc.close();
    }
}


