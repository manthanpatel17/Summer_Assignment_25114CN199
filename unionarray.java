import java.util.Scanner;

public class UnionArray 
{

  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the array 1 ");
    int size1 = sc.nextInt();
    System.out.println(" enter the size of the array 2");
    int size2 = sc.nextInt();

    if (size1 < 0 || size2 < 0)
         {
      System.out.println("Invalid array size");
      sc.close();
      return;
    }

    int[] nums1 = new int[size1];
    int[] nums2 = new int[size2];
    int size3 = size1 + size2;
    int[] union = new int[size3];

    System.out.println(" enter the elements of the array 1 ");
    for (int i = 0; i < size1; i++) {
      nums1[i] = sc.nextInt();
    }

    System.out.println(" enter the elements of the array 2 ");
    for (int i = 0; i < size2; i++) {
      nums2[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < size1; i++) {
      boolean found = false;
      for (int j = 0; j < count; j++) {
        if (nums1[i] == union[j]) {
          found = true;

          break;
        }
      }
      if (!found) {
        union[count] = nums1[i];
        count++;
      }

    }
    for (int i = 0; i < size2; i++) {
      boolean found = false;
      for (int j = 0; j < count; j++) {
        if (nums2[i] == union[j]) {
          found = true;
          break;
        }
      }
      if (!found) {
        union[count] = nums2[i];
        count++;
      }

    }

    System.out.println(" the union array is :");
    for (int i = 0; i < count; i++) {
      System.out.print(union[i] + " ");
    }
    sc.close();
  }
}