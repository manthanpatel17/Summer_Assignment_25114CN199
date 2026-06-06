import java.util.Scanner;

public class CalculatePower 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number whose power is to be calculated ");
    int num = sc.nextInt();
    System.out.println(" enter the power to be raised to ");
    int power = sc.nextInt();
    int result = 1;

    if (num == 0 && power == 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    if (power < 0) {
      System.out.println("Negative powers are not supported");
      sc.close();
      return;
    }

    if (power == 0) {
      System.out.println(" answer is 1");
      sc.close();
      return;
    }
    for (int i = 1; i <= power; i++) {
      result = result * num;

    }
    System.out.println(" answer is " + result);
    sc.close();
  }
}