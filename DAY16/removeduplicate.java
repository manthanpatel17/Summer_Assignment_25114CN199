import java.util.Scanner;

public class RemoveDuplicate {
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
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr1[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < size; i++) {
      boolean found = false;
      for (int j = 0; j < count; j++) {
        if (arr1[i] == arr2[j]) {
          found = true;
          break;
        }
      }

      if (!found) {
        arr2[count] = arr1[i];
        count++;
      }
    }

    System.out.println(" the new array is: ");
    for (int i = 0; i < count; i++) {
      System.out.print(arr2[i] + " ");

    }
    sc.close();
  }
}