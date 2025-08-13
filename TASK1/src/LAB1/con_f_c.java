package LAB1;
import java.util.Scanner;

public class con_f_c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperatureFahrenheit = scanner.nextDouble();
        double temperatureCelsius = (5.0 / 9) * (temperatureFahrenheit - 32);
        System.out.println("Temperature in Celsius: " + temperatureCelsius + " °C");
        scanner.close();
    }
}
