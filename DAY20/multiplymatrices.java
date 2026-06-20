import java.util.Scanner;

public class MultiplyMatrices {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the rows of the matrix 1 ");
    int rows1 = sc.nextInt();
    System.out.println(" enter the column of the matrix 1 ");
    int colm1 = sc.nextInt();

    System.out.println(" enter the rows of the matrix 2 ");
    int rows2 = sc.nextInt();
    System.out.println(" enter the column of the matrix 2 ");
    int colm2 = sc.nextInt();

    if (rows2 != colm1) {
      System.out.println("Multiplication cannot be performed");
      sc.close();
      return;
    }

    int[][] nums1 = new int[rows1][colm1];
    int[][] nums2 = new int[rows2][colm2];

    int[][] multiply = new int[rows1][colm2];

    System.out.println(" enter the elements of the matrix 1 ");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < colm1; j++) {
        nums1[i][j] = sc.nextInt();
      }
    }

    System.out.println(" enter the elements of the matrix 2 ");
    for (int i = 0; i < rows2; i++) {
      for (int j = 0; j < colm2; j++) {
        nums2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < colm2; j++) {
        for (int k = 0; k < colm1; k++) {
          multiply[i][j] += nums1[i][k] * nums2[k][j];
        }
      }
    }
    System.out.println(" the multiplication of the two matrix is");
    for (int i = 0; i < rows1; i++) {
      for (int j = 0; j < colm2; j++) {
        System.out.print(multiply[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}