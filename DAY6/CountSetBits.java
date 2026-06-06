import java.util.Scanner;

public class CountSetBits 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the number ");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }

    if (num == 0) {
      System.out.println("answer is 0");
      sc.close();
      return;
    }
    int count = 0;

    while (num > 0) {
      if (num % 2 == 1) {
        count++;
      }
      num = num / 2;
    }
    System.out.println(" answer is " + count);
    sc.close();
  }
}