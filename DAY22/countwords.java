import java.util.Scanner;

public class CountWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the sentence ");
    String str = sc.nextLine().trim();

    if (str.isEmpty()) {
      System.out.println("The number of words are: 0");
      sc.close();
      return;
    }

    int length = str.length();
    int word = 1;
    for (int i = 0; i < length - 1; i++) {
      if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
        word++;
      } else {
        continue;
      }
    }
    System.out.println(" the number of words are: " + word);
    sc.close();
  }
}