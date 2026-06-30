import java.util.Scanner;

public class InventoryManagementSystem
{
  public static void main(String args[]) 
{
    Scanner sc = new Scanner(System.in);
    String[] items = { "Gun", "Melee", "Vest", "helmet", "medikit" };
    int[] quantity = { 30, 50, 20, 25, 80 };

    System.out.println("Inventory List:");
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i] + " - " + quantity[i]);
    }

    System.out.print("Enter item number (1-5) to update quantity: ");
    int choice = sc.nextInt();

    System.out.print("Enter quantity to add: ");
    int add = sc.nextInt();

    quantity[choice - 1] += add;

    System.out.println("\nUpdated Inventory:");
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i] + " - " + quantity[i]);
    }

    sc.close();
  }

}
