import java.util.Scanner;

public class RecursiveReverseNo {
  static int reverse(int n, int rev)
  {
    if (n == 0) {
      return rev;
    }

    rev = rev * 10 + n % 10;
    return reverse(n / 10, rev);
  }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number ");
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    System.out.println(" reverse of the number is " + reverse(num, 0));
    sc.close();
 }
}