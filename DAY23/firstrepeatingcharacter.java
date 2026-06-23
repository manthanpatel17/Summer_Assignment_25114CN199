public import java.util.Scanner;

public class FirstRepeatingCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String str = sc.nextLine();

    int length = str.length();

    char result = '\0';

    for (int i = 0; i < length; i++) {
      boolean found = false;
      for (int j = i + 1; j < length; j++) {
        if (str.charAt(i) == str.charAt(j) && i != j) {
          found = true;
          break;
        }
      }
      if (found) {
        result = str.charAt(i);
        break;
      }
    }

    if (result == '\0') {
      System.out.println(" there is no repeating character");
    } else {
      System.out.println(" the first repeating character is:" + result);
    }

    sc.close();
  }
}