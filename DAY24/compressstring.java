import java.util.Scanner;

public class CompressString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the string ");
    String str = sc.nextLine();

    if (str.length() == 0) {
      System.out.println("Empty string");
      sc.close();
      return;
    }

    String compress = "";
    int count = 1;

    for (int i = 0; i < str.length(); i++) {
      if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
      } else {
        compress += str.charAt(i);
        compress += count;
        count = 1;
      }
    }
    System.out.println("Compressed string: " + compress);

    sc.close();
  }

}
