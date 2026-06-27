import java.util.Scanner;

public class VotingEligibility {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter your age");
    int age = sc.nextInt();

    if (age >= 0 && age < 18) {
      System.out.println("Not eligible");
    } else if (age < 0) {
      System.out.println("Please enter valid age");
    } else {
      System.out.println("Eligible");
    }
    sc.close();
  }

}