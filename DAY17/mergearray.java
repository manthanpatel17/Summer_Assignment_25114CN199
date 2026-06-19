import java.util.Scanner;

public class MergeArray 
{

  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array 1 ");
    int size1 = sc.nextInt();
    System.out.println(" enter the size of the array 2");
    int size2 = sc.nextInt();

    if (size1 < 0 || size2 < 0) {
      System.out.println("Invalid array size");
      sc.close();
      return;
    }

    int[] nums1 = new int[size1];
    int[] nums2 = new int[size2];
    int size3 = size1 + size2;
    int[] merge = new int[size3];

    System.out.println(" enter the elements of the array 1 ");
    for (int i = 0; i < size1; i++) {
      nums1[i] = sc.nextInt();
    }

    System.out.println(" enter the elements of the array 2 ");
    for (int i = 0; i < size2; i++) {
      nums2[i] = sc.nextInt();
    }
    for (int i = 0; i < size3; i++) {
      if (i < size1) {
        merge[i] = nums1[i];
      } else {
        merge[i] = nums2[i - size1];
      }
    }

    System.out.println(" the merged array is: ");
    for (int i = 0; i < size3; i++) {
      System.out.print(merge[i] + " ");
    }
    sc.close();
  }

}