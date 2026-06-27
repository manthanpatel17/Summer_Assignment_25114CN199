import java.util.Scanner;

public class QuizApplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int score = 0;
    System.out.println(" Quiz Game started! ");

    System.out.println("1. What is the capital of India?");
    System.out.println("a) Mumbai");
    System.out.println("b) New Delhi");
    System.out.println("c) Kolkata");
    char ans1 = sc.next().charAt(0);

    if (ans1 == 'b' || ans1 == 'B') {
      score++;
    }

    System.out.println("2. Which planet is known as the Red Planet?");
    System.out.println("a) Mars");
    System.out.println("b) Venus");
    System.out.println("c) Jupiter");
    char ans2 = sc.next().charAt(0);

    if (ans2 == 'a' || ans2 == 'A') {
      score++;
    }

    System.out.println("3. How many days are there in a leap year?");
    System.out.println("a) 364");
    System.out.println("b) 365");
    System.out.println("c) 366");
    char ans3 = sc.next().charAt(0);

    if (ans3 == 'c' || ans3 == 'C') {
      score++;
    }

    System.out.println("4. Which keyword is used to create an object in Java?");
    System.out.println("a) new");
    System.out.println("b) class");
    System.out.println("c) static");
    char ans4 = sc.next().charAt(0);

    if (ans4 == 'a' || ans4 == 'A') {
      score++;
    }

    System.out.println("5. What is 5 X 6?");
    System.out.println("a) 25");
    System.out.println("b) 30");
    System.out.println("c) 35");
    char ans5 = sc.next().charAt(0);

    if (ans5 == 'b' || ans5 == 'B') {
      score++;
    }

    System.out.println(" RESULT TIME ");
    System.out.println("Your score: " + score + "/5");

    if (score == 5) {
      System.out.println("Excellent!");
    } else if (score >= 3) {
      System.out.println("Good job!");
    } else {
      System.out.println("Keep practicing!");
    }

    sc.close();
  }
}