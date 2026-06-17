import java.util.Scanner;

public class GivenSumPairs {
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
    System.out.println(" enter the given sum ");
    int sum = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] + arr[j] == sum) {
          System.out.println(arr[i] + " and " + arr[j]);
          found = true;
        }
      }
    }
    if (!found) {
      System.out.println(" no pair found");
    }
    sc.close();
  }
}
