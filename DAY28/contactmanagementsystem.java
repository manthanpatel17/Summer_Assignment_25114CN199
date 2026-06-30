import java.util.Scanner;

public class ContactManagementSystem 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the total number of contacts to be saved");
    int contact = sc.nextInt();

    String[] names = new String[contact];
    String[] numbers = new String[contact];

    System.out.println("Enter contacts:");

    for (int i = 0; i < contact; i++) {
      System.out.print("Enter Name: ");
      names[i] = sc.next();

      System.out.print("Enter Phone Number: ");
      numbers[i] = sc.next();
    }

    System.out.println("\nSaved Contacts:");

    for (int i = 0; i < contact; i++) {
      System.out.println(names[i] + " - " + numbers[i]);
    }

    sc.close();
  }
}