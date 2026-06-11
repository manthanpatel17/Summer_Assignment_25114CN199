import java.util.Scanner;

public class FunctionFactorial {
  static int fact(int n) {
    int product = 1;
    if (n == 0 || n == 1) {
      return 1;
    }
    for (int i = 2; i <= n; i++) {
      product = product * i;
    }
    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();

    int result = fact(num);
    System.out.println("The factorial of " + num + " is " + result);

    sc.close();
  }
}
