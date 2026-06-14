import java.util.Scanner;

public class InputArray {
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
    System.out.println(" the elements of the array are");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    sc.close();

  }
}