import java.util.Scanner;

public class FunctionMaximum 
{
  public static int maximum(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();

    int max = maximum(num1, num2);
    System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max);
    sc.close();
  }
}