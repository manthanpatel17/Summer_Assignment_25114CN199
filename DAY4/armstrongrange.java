import java.util.Scanner;

public class ArmstrongRange 
 {
  public static void main(String args[]) 
  
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first number");
    int n1 = sc.nextInt();
    System.out.println(" enter the second number");
    int n2 = sc.nextInt();

    if (n1 > n2 || n1 < 0 || n2 < 0) {
      System.out.println(" invalid range");
      sc.close();
      return;
    }

    for (int i = n1; i <= n2; i++) {

      if (i == 0) {
        System.out.println("0 is an Armstrong number.");
        continue;
      }

      int n = i;
      int count = 0;
      int sum = 0;

      while (n != 0) {
        n = n / 10;
        count++;
      }
      n = i;
      while (n != 0) {
        int digit = n % 10;
        sum += (int) Math.pow(digit, count);
        n = n / 10;
      }
      if (sum == i) {
        System.out.println(i + " is an Armstrong number.");
      }
    }

    sc.close();
  }
}