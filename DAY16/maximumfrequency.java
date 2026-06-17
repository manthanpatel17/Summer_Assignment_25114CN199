import java.util.Scanner;

public class MaximumFrequency {
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
    int max = 0;
    int frequency = 0;
    int num = 0;
    for (int i = 0; i < size; i++) {
      frequency = 0;
      for (int j = 0; j < size; j++) {
        if (arr[i] == arr[j]) {
          frequency++;
          if (frequency > max) {
            max = frequency;
            num = arr[i];

          }
        }
      }

    }

    System.out.println("the maximum frequency is of element " + num + " and it occured " + max + " times");
    sc.close();
  }
}