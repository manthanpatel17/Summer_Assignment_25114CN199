import java.util.Scanner;

public class RemoveSpaces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the sentence ");
    String str = sc.nextLine();

    String remove = "";

    int length = str.length();

    for (int i = 0; i < length; i++) {
      if (str.charAt(i) == ' ') {
        continue;
      } else {
        remove = remove + str.charAt(i);
      }
    }
    System.out.println(" the new string without spaces is: " + remove);
    sc.close();
  }

}