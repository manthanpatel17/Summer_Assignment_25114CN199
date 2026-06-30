import java.util.Scanner;

public class LibraryManagementSystem
 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String[] books = { "Java", "Python", "C++", "DSA", "DBMS" };
    boolean[] issued = new boolean[5];

    System.out.println("Available Books:");
    for (int i = 0; i < books.length; i++) {
      System.out.println((i + 1) + ". " + books[i]);
    }
    for (int i = 0; i < books.length; i++) {
      System.out.print("Enter book number to issue: ");
      int choice = sc.nextInt();

      if (choice >= 1 && choice <= books.length) {
        if (!issued[choice - 1]) {
          issued[choice - 1] = true;
          System.out.println("Book issued successfully: " + books[choice - 1]);
        } else {
          System.out.println("Book is already issued.");
          break;
        }
      } else {
        System.out.println("Invalid book number.");
        break;
      }
    }
    sc.close();
  }
}