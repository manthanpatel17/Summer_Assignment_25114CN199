import java.util.Scanner;

public class FibonnaciN 
{
  public static void main(String args[]) 
  
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the term  you need  to find");
    int n = sc.nextInt();

    if (n <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }

    int a = 0, b = 1;
    for (int i = 1; i <= n; i++) {
      if (i == n) {
        System.out.println("The " + n + "th term is: " + a);
        break;
      }

      int temp = a + b;
      a = b;
      b = temp;

    }

  }
}