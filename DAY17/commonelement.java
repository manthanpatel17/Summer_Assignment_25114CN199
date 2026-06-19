import java.util.Scanner;

public class CommonElement 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array 1 ");
    int size1 = sc.nextInt();
    System.out.println(" enter the size of the array 2");
    int size2 = sc.nextInt();

    if (size1 <= 0 || size2 <= 0) {
      System.out.println("Invalid array size");
      sc.close();
      return;
    }

    int[] nums1 = new int[size1];
    int[] nums2 = new int[size2];

    System.out.println(" enter the elements of the array 1 ");
    for (int i = 0; i < size1; i++) {
      nums1[i] = sc.nextInt();
    }

    System.out.println(" enter the elements of the array 2 ");
    for (int i = 0; i < size2; i++) {
      nums2[i] = sc.nextInt();
    }
    System.out.println(" the common elements are ");
    for (int i = 0; i < size1; i++) {
      for (int j = 0; j < size2; j++) {
        if (nums1[i] == nums2[j]) {
          System.out.print(nums1[i] + " ");
        }
      }
    }
    sc.close();

  }
}
