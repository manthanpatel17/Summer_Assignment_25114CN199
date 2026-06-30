import java.util.Scanner;

public class MenuDrivenArrayOperation
 {
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = sc.nextInt();

    int[] arr = new int[size];

    System.out.println("enter array elements:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("1. Display Array");
    System.out.println("2. Find Sum");
    System.out.println("3. Find Maximum Element");
    System.out.print("Enter your choice: ");
    int choice = sc.nextInt();

    switch (choice) {
      case 1:
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        break;

      case 2:
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        break;

      case 3:
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
            max = arr[i];
          }
        }
        System.out.println("Maximum Element = " + max);
        break;

      default:
        System.out.println("Invalid Choice");
    }

    sc.close();
  }

}