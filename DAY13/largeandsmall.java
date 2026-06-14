import java.util.Scanner;

public class LargeAndSmall {
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
    int large = Integer.MIN_VALUE;
    int small = Integer.MAX_VALUE;

    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] > large) {
        large = arr[i];
      }
      if (arr[i] < small) {
        small = arr[i];
      }
    }
    System.out.println(" the largest element of the array is: " + large);
    System.out.println(" the smallest element of the array is: " + small);

    sc.close();
  }
}