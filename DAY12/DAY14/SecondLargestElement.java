import java.util.Scanner;

public class SecondLargestElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array");
    int size = sc.nextInt();

    if (size < 2) {
      System.out.println("Array must consider 2 elements!!");
      sc.close();
      return;
    }
    int[] arr = new int[size];
    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] > largest) {
        secondlargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondlargest && arr[i] != largest) {
        // this else if is evaluated when if is "false" else if both condition are
        // "true" then else if condition is ignored
        secondlargest = arr[i];
      }
    }

    if (secondlargest == Integer.MIN_VALUE) {
      System.out.println(" there is no second largest element in the array");
    } else {
      System.out.println(" the second largest element in the array is: " + secondlargest);
    }

    sc.close();
  }
}