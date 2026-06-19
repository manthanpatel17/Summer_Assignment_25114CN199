import java.util.Scanner;

public class IntersectionArray 
{
  public static void main(String[] args) {
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
    int size3 = size1 + size2;
    int[] intersect = new int[size3];

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
      for (int j = 0; j < size2; j++) {
        if (nums1[i] == nums2[j]) {
          boolean found = false;

          for (int k = 0; k < count; k++) {
            if (intersect[k] == nums1[i]) {
              found = true;
              break;
            }
          }

          if (!found) {
            intersect[count++] = nums1[i];
          }
          break;
        }
      }
    }

    System.out.println(" the intersection of the arrays is :");
    for (int i = 0; i < count; i++) {
      System.out.print(intersect[i] + " ");
    }
    sc.close();
  }
}