import java.util.Scanner;

public class RecursiveFactorial {
  static int fact(int n) {
    int ans;
    if (n <= 1) {
      return 1;
    }

    ans = n * fact(n - 1);
    return ans;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number whose factorial is to be printed");
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println("Factorial is not defined for negative numbers.");
    } else {
      System.out.println("Factorial is: " + fact(num));
    }
    sc.close();
  }
}
