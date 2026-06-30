import java.util.Scanner;

public class StudentRecords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int n = sc.nextInt();

    String[] names = new String[n];
    String[] classes = new String[n];
    int[] rolls = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("\nStudent " + (i + 1));
      System.out.print("Enter Name: ");
      names[i] = sc.next();
      System.out.print("Enter Class: ");
      classes[i] = sc.next();
      System.out.print("Enter Roll Number: ");
      rolls[i] = sc.nextInt();
    }

    System.out.println("\n--- Student Records ---");
    for (int i = 0; i < n; i++) {
      System.out.println("Name: " + names[i]);
      System.out.println("Class: " + classes[i]);
      System.out.println("Roll Number: " + rolls[i]);
      System.out.println();
    }

    sc.close();
  }
}