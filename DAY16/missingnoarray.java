import java.util.Scanner;

public class MissingNoArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array");
    int size = sc.nextInt();

    if (size <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    int[] arr = new int[size];
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    int n = size + 1;
    int sum = 0;
    int check = 0;

    for (int i = 0; i < size; i++) {
      sum = sum + arr[i];
    }

    check = (n * (n + 1)) / 2;

    System.out.println(" the missing number is: " + (check - sum));

    sc.close();
  }
}