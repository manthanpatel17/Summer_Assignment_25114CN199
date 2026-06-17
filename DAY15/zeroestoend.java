import java.util.Scanner;

public class ZeroesToEnd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array");
    int size = sc.nextInt();

    if (size <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }

    int[] arr1 = new int[size];
    int[] arr2 = new int[size];
    int count = 0;
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr1[i] = sc.nextInt();
      if (arr1[i] == 0) {
        arr2[size - 1 - count] = arr1[i];
        count++;
      } else {
        arr2[i - count] = arr1[i];
      }
    }
    System.out.println(" the new array is: ");
    for (int j = 0; j < size; j++) {
      System.out.println(arr2[j] + " ");

    }

    sc.close();
  }
}