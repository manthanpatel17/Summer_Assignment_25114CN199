import java.util.Scanner;

public class SumAndAverage {
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
    int sum = 0;
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
      sum += arr[i];
    }
    double average = (double) sum / size;
    System.out.println(" the sum of the array elements is: " + sum);
    System.out.println(" the average of the array elements is: " + average);

    sc.close();

  }
}