import java.util.Scanner;

public class RotateArrayRight {
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
    System.out.println(" enter the no. of rotation");
    int num = sc.nextInt();
    num = num % size;

    for (int i = 0; i < size; i++) {
      arr2[(i + num) % size] = arr1[i];
    }

    System.out.println(" the rotated array is :");
    for (int i = 0; i < size; i++) {
      System.out.print(arr2[i] + " ");
    }

    sc.close();
  }
}