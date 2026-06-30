import java.util.Scanner;

public class SalaryManagementSystem {
  public static void main(String[] args) {
    String employeeName;
    double salary, saving, TaxableIncome, IncomeTax;

    Scanner sc = new Scanner(System.in);
    System.out.print("enter Employee Name: ");
    employeeName = sc.nextLine();

    System.out.print("enter annual salary: ");
    salary = sc.nextDouble();

    System.out.print("enter annual saving: ");
    saving = sc.nextDouble();

    TaxableIncome = salary - saving;

    if (TaxableIncome <= 350000) {
      IncomeTax = 0;
    } else if (TaxableIncome <= 600000) {
      IncomeTax = (TaxableIncome - 350000) * 0.15;
    } else if (TaxableIncome <= 1000000) {
      IncomeTax = (250000 * 0.15) + (TaxableIncome - 600000) * 0.25;
    } else {
      IncomeTax = (250000 * 0.15) + (400000 * 0.25) + (TaxableIncome - 1000000) * 0.35;
    }
    System.out.println("Employee Name: " + employeeName);
    System.out.println("Annual Salary: " + salary);
    System.out.println("Annual Saving: " + saving);
    System.out.println("Taxable income: " + TaxableIncome);
    System.out.println("Income Tax: " + IncomeTax);

    sc.close();
  }
}