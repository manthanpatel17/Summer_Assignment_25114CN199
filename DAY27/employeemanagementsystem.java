import java.util.Scanner;

public class EmployeeManagementSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of employees: ");
    int n = sc.nextInt();
    sc.nextLine();

    int[] empId = new int[n];
    String[] empName = new String[n];
    String[] department = new String[n];
    double[] salary = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.println("\nEnter details of Employee " + (i + 1));

      System.out.print("Employee ID: ");
      empId[i] = sc.nextInt();
      sc.nextLine();

      System.out.print("Employee Name: ");
      empName[i] = sc.nextLine();

      System.out.print("Department: ");
      department[i] = sc.nextLine();

      System.out.print("Salary: ");
      salary[i] = sc.nextDouble();
    }

    System.out.println("\n----- EMPLOYEE RECORDS -----");

    for (int i = 0; i < n; i++) {
      System.out.println("\nEmployee " + (i + 1));
      System.out.println("ID         : " + empId[i]);
      System.out.println("Name       : " + empName[i]);
      System.out.println("Department : " + department[i]);
      System.out.println("Salary     : " + salary[i]);
    }
    sc.close();
  }
}
