import java.util.Scanner;

public class LinearSearch {
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
    System.out.println(" enter the element to be searched");
    int num = sc.nextInt();
    int foundindex = -1;
    for (int i = 0; i < size; i++) {
      if (arr[i] == num) {
        foundindex = i;
        break;
      }
    }
    if (foundindex == -1) {
      System.out.println(" element not found in the array");
    } else {
      System.out.println(" element found at index: " + foundindex);
    }

    sc.close();
  }
}