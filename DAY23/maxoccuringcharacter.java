import java.util.Scanner;

public class MaxOccuringCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the string ");
    String str = sc.nextLine();

    int length = str.length();

    char result = '\0';

    int max = 0;

    for (int i = 0; i < length; i++) {
      int frequency = 0;

      for (int j = 0; j < length; j++) {
        if (str.charAt(i) == str.charAt(j) && i != j) {
          frequency++;
        }
      }
      if (frequency > max) {
        max = frequency;
        result = str.charAt(i);
      }
    }

    if (result == '\0') {
      System.out.println(" there is no repeating character");
    } else {
      System.out
          .println(" the maximum repeating character is " + result + " and it is occuring " + (max + 1) + " times");
    }

    sc.close();
  }
}