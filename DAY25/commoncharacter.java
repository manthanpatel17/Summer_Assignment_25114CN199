import java.util.HashSet;
import java.util.Set;

public class CommonCharacters
{
    public static void main(String[] args) {
        String str1 = "thin sticks";
        String str2 = "thick bricks";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.print("Common characters: ");
        
        findCommonChars(str1, str2);
    }

    public static void findCommonChars(String s1, String s2) {
        // Set to store unique characters of the first string
        Set<Character> set1 = new HashSet<>();
        // Set to store the common characters to avoid duplicates
        Set<Character> commonSet = new HashSet<>();

        // Add all characters of the first string to set1 (ignoring spaces)
        for (char ch : s1.toCharArray()) {
            if (ch != ' ') {
                set1.add(ch);
            }
        }

        // Check if characters of the second string exist in set1
        for (char ch : s2.toCharArray()) {
            if (set1.contains(ch)) {
                commonSet.add(ch);
            }
        }

        // Print the result
        System.out.println(commonSet);
    }
}
