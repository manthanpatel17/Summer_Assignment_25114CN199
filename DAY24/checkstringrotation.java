import java.util.Scanner;

public class CheckStringRotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first string ");
    String str1 = sc.nextLine();
    System.out.println(" enter the second string ");
    String str2 = sc.nextLine();

    if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
      System.out.println("Strings are rotation of each other");
    } else {
      System.out.println(" Strings are not rotation of each other");
    }
    sc.close();
  }
}
