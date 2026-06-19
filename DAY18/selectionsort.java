import java.util.Scanner;

public class SelectionSort {

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
      int index = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] < arr[index]) {
          index = j;

        }
      }

      int temp = arr[i];
      arr[i] = arr[index];
      arr[index] = temp;
    }
    System.out.println(" the sorted array is: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();

  }
}