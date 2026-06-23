import java.util.Scanner;

public class CheckAnagramString 
{
  public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first string ");
    String str1 = sc.nextLine();
    System.out.println(" enter the second string ");
    String str2 = sc.nextLine();

    if (str1.length() != str2.length()) {
      System.out.println(" the strings are not anagrams ");
      sc.close();
      return;
    }

    boolean flag = false;
    for (int i = 0; i < str1.length(); i++) {
      int count1 = 0;
      int count2 = 0;
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i) == str1.charAt(j)) {
          count1++;
        }

        if (str1.charAt(i) == str2.charAt(j)) {
          count2++;

        }
      }
      if (count1 != count2) {
        flag = true;
        System.out.println(" the string are not anagrams");
        break;
      }
    }

    if (!flag) {
      System.out.println(" the given strings are anagrams");
    }

    sc.close();
  }
}
