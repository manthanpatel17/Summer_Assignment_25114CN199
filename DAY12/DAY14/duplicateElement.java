import java.util.Scanner;

public class DuplicateElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array");
    int size = sc.nextInt();

    if (size < 2) {
      System.out.println(" Array should take 2 elements");
      sc.close();
      return;
    }
    int[] arr = new int[size];
    int duplicate = -1;
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
      for (int j = 0; j < i; j++) {
        if (arr[j] == arr[i]) {
          duplicate = arr[j];
          break;
        }
      }
      if (duplicate != -1) {
        break;
      }
    }
    if (duplicate == -1) {
      System.out.println(" no duplicate element is present");
    } else {
      System.out.println(" the duplicate element is " + duplicate);
    }

    sc.close();
  }
}
