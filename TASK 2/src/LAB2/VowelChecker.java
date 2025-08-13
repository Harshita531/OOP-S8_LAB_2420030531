package LAB2;
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a single alphabet: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase for easier checking
        char lowerCh = Character.toLowerCase(ch);

        // Check if vowel
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is NOT a Vowel.");
        }

        sc.close();
    }
}
