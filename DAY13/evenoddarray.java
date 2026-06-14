import java.util.Scanner;

public class EvenOddArray {
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
    int even = 0;
    int odd = 0;
    System.out.println(" enter the elements of the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println(" the number of even elements in the array is: " + even);
    System.out.println(" the number of odd elements in the array is: " + odd);
    sc.close();
  }
}
