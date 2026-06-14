import java.util.Scanner;

public class ArmstrongFunction 
{
  static int isArmstrong(int n) 
{

    int count = 0;
    int x = n;
    int sum = 0;

    while (x != 0) {
      x = x / 10;
      count++;
    }
    x = n;
    while (x != 0) {
      int digit = x % 10;
      sum += (int) Math.pow(digit, count);
      x = x / 10;
    }

    return (sum == n) ? 1 : 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    if (num == 0) {
      System.out.println(" 0 is an Armstrong number.");
      sc.close();
      return;
    }
    if (isArmstrong(num) == 1) {
      System.out.println(num + " is an Armstrong number");
    } else {
      System.out.println(num + " is not an Armstrong number");
    }

    sc.close();

  }
}
