import java.util.Scanner;

public class PalindromeString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word ");
    String str = sc.nextLine();

    int length = str.length();
    String reverse = new String();

    for (int i = 0; i < length; i++) {
      reverse = reverse + str.charAt(length - 1 - i);
    }
    if (reverse.equals(str)) {
      System.out.println("the entered string is a  palindrome ");
    } else {
      System.out.println("the entered string is not a palindrome ");
    }
    sc.close();
  }
}