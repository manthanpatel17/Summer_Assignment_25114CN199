import java.util.Scanner;

public class RemoveDuplicateCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String str = sc.nextLine();

    String result = "";

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (result.indexOf(ch) == -1) {
        result += ch;
      }
    }
    System.out.println(" the new string is:" + result);
    sc.close();
  }
}