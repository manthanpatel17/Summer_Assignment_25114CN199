import java.util.Scanner;

public class DecimalToBinary 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the decimal number ");
    int n = sc.nextInt();

    if (n < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    if (n == 0) {
      System.out.println(" binary number is 0");
      sc.close();
      return;
    }
    int binary = 0;
    int place = 1;
    while (n > 0) {
      int rem = n % 2;
      binary = binary + rem * place;
      place = place * 10;
      n = n / 2;
    }

    System.out.println(" binary number is " + binary);
    sc.close();

  }

}