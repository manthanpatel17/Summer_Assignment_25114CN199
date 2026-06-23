import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String str = sc.next();

    int length = str.length();
    String reverse = new String();

    for (int i = 0; i < length; i++) {
      reverse = reverse + str.charAt(length - 1 - i);
    }
    System.out.println("the reverse string is: " + reverse);
    sc.close();
  }
}