import java.util.Scanner;

public class BinaryToDecimal 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the binary number[input in 0 and 1 only] ");
    int num = sc.nextInt();
    if (num < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    int decimal = 0;
    int place = 1;

    while (num > 0) {
      int rem = num % 10;
      if (rem != 0 && rem != 1) {
        System.out.println(" invalid entry");
        sc.close();
        return;
      }
      decimal = decimal + rem * place;
      place = place * 2;
      num = num / 10;
    }
    System.out.println(" decimal number is " + decimal);
    sc.close();
  }

}
