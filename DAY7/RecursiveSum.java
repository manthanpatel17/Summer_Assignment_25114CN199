import java.util.Scanner;

public class RecursiveSum {

  static int sumofdigits(int n) {
    if (n == 0) {
      return 0;
    }

    return (n % 10) + sumofdigits(n / 10);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number ");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println(" invalid entry");
    } else {
      System.out.println(" sum of digits is " + sumofdigits(num));
    }
    sc.close();

  }
}