import java.util.Scanner;

public class PalindromeFunction
 {

  static int isPalindrome(int n) {
    int x = n;
    int reverse = 0;
    while (x != 0) {
      int digit = x % 10;
      reverse = reverse * 10 + digit;
      x = x / 10;
    }

    return (reverse == n) ? 1 : 0;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println("invalid entry");
      sc.close();
      return;
    }

    if (isPalindrome(num) == 1) {
      System.out.println(num + " is a palindrome");
    } else {
      System.out.println(num + " is not a palindrome");
    }

    sc.close();

  }
}