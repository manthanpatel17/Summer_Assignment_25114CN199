import java.util.Scanner;

public class DescendingArray {

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
    System.out.println(" enter the elements");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println(" the sorted array is: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();

  }
}