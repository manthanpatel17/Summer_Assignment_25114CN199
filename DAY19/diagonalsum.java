import java.util.Scanner;

public class DiagonalSum {
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
    int sum = 0;

    System.out.println(" enter the elements of the matrix  ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colm; j++) {
        nums1[i][j] = sc.nextInt();
        if (i == j) {
          sum = sum + nums1[i][j];
        }
      }
    }

    System.out.println(" the diagonal sum is:" + sum);
    sc.close();
  }
}
