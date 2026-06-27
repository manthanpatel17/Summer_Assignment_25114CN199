import java.util.Scanner;

public class LongestWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the string ");
    String str = sc.nextLine().trim();

    int letter = 0;
    int max = 0;
    String word = "";
    String longest = "";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ') {
        letter = 0;
        word = "";
      } else {
        letter++;
        word = word + str.charAt(i);
        if (letter > max) {
          max = letter;
          longest = word;
        }
      }
    }
    System.out.println(" the longest word is: " + longest);
    sc.close();
  }
}