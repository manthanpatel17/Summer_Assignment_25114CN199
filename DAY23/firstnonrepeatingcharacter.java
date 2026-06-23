import java.util.Scanner;

public class FirstNonRepeatingCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String str = sc.nextLine();

    int length = str.length();

    char result = '\0';

    for (int i = 0; i < length; i++) {
      boolean found = false;
      for (int j = 0; j < length; j++) {
        if (str.charAt(i) == str.charAt(j) && i != j) {
          found = true;
          break;
        }
      }
      if (!found) {

        result = str.charAt(i);
        break;
      }
    }

    if (result == '\0') {
      System.out.println(" there is no non repeating character");
    } else {
      System.out.println(" the first non repeating character is:" + result);
    }

    sc.close();
  }

}