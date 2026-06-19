import java.util.Scanner;

public class MatricesSub {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the rows of the matrix ");
    int rows = sc.nextInt();
    System.out.println(" enter the column of the matrix ");
    int colm = sc.nextInt();

    if (rows <= 0 || colm <= 0) {
      System.out.println("Invalid matrix size");
      sc.close();
      return;
    }

    int[][] nums1 = new int[rows][colm];
    int[][] nums2 = new int[rows][colm];

    int[][] sub = new int[rows][colm];

    System.out.println(" enter the elements of the matrix 1 ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colm; j++) {
        nums1[i][j] = sc.nextInt();
      }
    }

    System.out.println(" enter the elements of the matrix 2 ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colm; j++) {
        nums2[i][j] = sc.nextInt();
      }
    }
    System.out.println(" the subtraction of the two matrix is :");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colm; j++) {
        sub[i][j] = nums1[i][j] - nums2[i][j];
        System.out.print(sub[i][j] + " ");
      }
      System.out.println();

    }
    sc.close();
  }
}