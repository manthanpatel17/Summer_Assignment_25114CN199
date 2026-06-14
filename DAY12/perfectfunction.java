import java.util.Scanner;

public class PerfectFunction
{

  static boolean isPerfect(int n) {
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sum = sum + i;
      }
    }
    return sum == n;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();

    if (num <= 0) {
      System.out.println("invalid entry");
      sc.close();
      return;
    }
    if (isPerfect(num)) {
      System.out.println(num + " is a Perfect number");
    } else {
      System.out.println(num + " is not a Perfect number");
    }

    sc.close();
  }
}