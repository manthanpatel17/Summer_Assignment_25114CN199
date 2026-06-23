import java.util.*;

public class CountVowelConsonants {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String str = sc.next();

    int length = str.length();
    int vowel = 0;
    int consonant = 0;
    char temp;

    for (int i = 0; i < length; i++) {
      temp = str.charAt(i);
      if (temp == 'a' || temp == 'A' || temp == 'e' || temp == 'E' || temp == 'i' || temp == 'I' || temp == 'o'
          || temp == 'O' || temp == 'u' || temp == 'U') {
        vowel++;
      } else {
        consonant++;
      }
    }

    System.out.println(" the number of vowel are: " + vowel);
    System.out.println(" the number of consonant are: " + consonant);
    sc.close();
  }
}
