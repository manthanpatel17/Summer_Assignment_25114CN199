import java.util.Scanner;

public class FunctionSum {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int num1 = sc.nextInt();
    System.out.println("enter the second number");
    int num2 = sc.nextInt();

    int result = sum(num1, num2);
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    sc.close();
  }

}