import java.util.Scanner;

public class FibonacciFunction
 {

  static void fibonacci(int n) 
  {
    int a = 0, b = 1;
    System.out.print("Fibonacci series: ");
    for (int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int next = a + b;
      a = b;
      b = next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the total number of terms in fibonacci  series");
    int terms = sc.nextInt();

    if (terms <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }

    fibonacci(terms);
    sc.close();

  }
}