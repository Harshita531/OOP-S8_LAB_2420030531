package LAB1;
import java.util.Scanner;

public class SphereVolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter radius of the sphere: ");
        double radius = sc.nextDouble();

        // Calculation: Volume = (4/3) × π × r³
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Output
        System.out.printf("Volume of the sphere: %.2f cubic units%n", volume);

        sc.close();
    }
}
