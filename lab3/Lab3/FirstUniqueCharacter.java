package Lab3;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstUnique(input);

        if (result != 0) {
            System.out.println(result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstUnique(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return 0;
    }
}
