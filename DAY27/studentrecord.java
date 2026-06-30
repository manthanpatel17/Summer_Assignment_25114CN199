import java.util.Scanner;

public class StudentRecord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students: ");
    int n = sc.nextInt();

    String[] names = new String[n];
    int[] marks = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter name for the student " + (i + 1));
      names[i] = sc.next();
    }
    for (int i = 0; i < n; i++) {
      System.out.println("Enter marks for the student " + (i + 1));
      marks[i] = sc.nextInt();
    }

    System.out.println("--- Student Records ---");
    for (int i = 0; i < n; i++) {
      System.out.println("Name: " + names[i]);
      System.out.println("Marks: " + marks[i]);
    }
    sc.close();
  }
}