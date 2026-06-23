import java.util.Scanner;

public class LowerToUppercase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the word [in the lowercase] ");
    String str = sc.next();

    System.out.println(" the word in uppercase is:" + str.toUpperCase());
    sc.close();
  }
}