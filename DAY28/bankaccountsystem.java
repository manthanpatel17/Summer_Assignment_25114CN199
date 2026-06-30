import java.util.Scanner;

public class BankAccountSystem 
{
  public static void main(String args[]) 
{
    Scanner sc = new Scanner(System.in);
    double balance = 1000;

    while (true) {
      System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit Money");
      System.out.println("3. Withdraw Money");
      System.out.println("4. Exit");

      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.println("Current Balance: " + balance);
          break;

        case 2:
          System.out.print("Enter amount to deposit: ");
          double deposit = sc.nextDouble();

          if (deposit > 0) {
            balance += deposit;
            System.out.println(" " + deposit + " deposited successfully.");
          } else {
            System.out.println("Invalid amount.");
          }
          break;

        case 3:
          System.out.print("Enter amount to withdraw: ");
          double withdraw = sc.nextDouble();

          if (withdraw <= 0) {
            System.out.println("Invalid amount.");
          } else if (withdraw > balance) {
            System.out.println("Insufficient balance.");
          } else {
            balance -= withdraw;
            System.out.println(" " + withdraw + " withdrawn successfully.");
          }
          break;

        case 4:
          System.out.println("Thank you for using the Bank Account System!");
          sc.close();
          return;

        default:
          System.out.println("Invalid choice.");
      }
    }
  }
}
