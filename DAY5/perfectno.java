import java.util.Scanner;

public class Perfectno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number to be checked ");
    int num = sc.nextInt();

    if (num <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }

    int sum = 0;
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }
    if (sum == num) {
      System.out.println(num + " is a Perfect number");
    } else {
      System.out.println(num + " is not a Perfect number");
    }
    sc.close();
  }
}
