import java.util.Scanner;

public class BinarySearch {

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
    System.out.println(" enter the elements [array should be sorted]");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(" enter the element to be searched");
    int num = sc.nextInt();
    int foundindex = -1;
    int start = 0;
    int end = size - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (num == arr[mid]) {
        foundindex = mid;
        break;
      } else if (num < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    if (foundindex == -1) {
      System.out.println("searched number not found");
    } else {
      System.out.println("number found at index " + foundindex);
    }
    sc.close();
  }
}
