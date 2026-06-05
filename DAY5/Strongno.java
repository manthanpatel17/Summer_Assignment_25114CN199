import java.util.Scanner;

public class Strongno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number to be checked ");
    int num = sc.nextInt();

    int sum = 0;
    int n = num;

    if (num < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    if (num == 0) {
      System.out.println(num + " is not a Strong number");
      sc.close();
      return;
    }

    while (n != 0) {
      int digit = n % 10;
      int fact = 1;
      for (int i = 1; i <= digit; i++) {
        fact = fact * i;
      }
      sum = sum + fact;
      n = n / 10;
    }
    if (sum == num) {
      System.out.println(num + " is a Strong number");
    } else {
      System.out.println(num + " is not a Strong number");
    }
    sc.close();
  }
}