import java.util.Scanner;

public class Factor
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number ");
    int num = sc.nextInt();
    if (num <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    System.out.println(" factors are:");

    for (int i = 1; i <= num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }

    sc.close();

  }
}