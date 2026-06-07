import java.util.Scanner;

public class RecursiveFibonacci
 {
  static int fib(int n)
   {

    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return 1;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number of terms in the Fibonacci sequence to be printed");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println(" invalid entry");
    } else {
      for (int i = 0; i < num; i++) {
        System.out.print(fib(i) + " ");

      }
    }
    sc.close();

  }
}