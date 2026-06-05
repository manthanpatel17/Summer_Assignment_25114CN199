import java.util.Scanner;

public class largestprimefactor
 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number ");
    int num = sc.nextInt();

    if (num <= 1) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    int largestPrime = -1;

    while (num % 2 == 0) {
      largestPrime = 2;
      num = num / 2;
    }
    for (int i = 3; i * i <= num; i += 2) {
      while (num % i == 0) {
        largestPrime = i;
        num = num / i;
      }
    }
    if (num > 2) {
      largestPrime = num;
    }
    System.out.println(" the largest prime factor is: " + largestPrime);
    sc.close();
  }
}