import java.util.Scanner;

public class CharacterFrequency {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the sentence ");
    String str = sc.nextLine();
    System.out.println(" enter the character whose frequency we need to know ");
    char x = sc.next().charAt(0);

    int frequency = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == x) {
        frequency++;
      }
    }

    System.out.println(" the frequency of the character is: " + frequency);
    sc.close();
  }
}
