package LAB2;
import java.util.Scanner;

public class AlphabetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        // Check if character is an alphabet
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a valid alphabetic character.");
        } else {
            System.out.println(ch + " is NOT a valid alphabetic character.");
        }

        sc.close();
    }
}
