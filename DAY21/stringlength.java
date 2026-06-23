import java.util.*;

public class StringLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String word = sc.nextLine();
    word = word + " ";
    int i = 0;
    while (word.charAt(i) != ' ') {
      i++;
    }
    System.out.print("length is: " + i);

    sc.close();

  }
}