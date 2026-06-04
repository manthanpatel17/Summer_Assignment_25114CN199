import java.util.Scanner;

public class Armstrong 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number to be checked ");
    int num = sc.nextInt();

    if (num < 0) 
    {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    if (num == 0) 
    {
      System.out.println(" 0 is an Armstrong number.");
      sc.close();
      return;
    }
    int count = 0;
    int n = num;
    int sum = 0;

    while (n != 0) {
      n = n / 10;
      count++;
    }
    n = num;
    while (n != 0) {
      int digit = n % 10;
      sum += (int) Math.pow(digit, count);
      n = n / 10;
    }
    if (sum == num) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is not an Armstrong number.");
    }
    sc.close();
  }
}
