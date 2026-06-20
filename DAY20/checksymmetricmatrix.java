import java.util.Scanner;

public class CheckSymmetricMatrix {
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
    if (rows != colm) {
      System.out.println("The matrix is not symmetric");
      sc.close();
      return;
    }

    int[][] nums1 = new int[rows][colm];

    System.out.println(" enter the elements of the matrix  ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < colm; j++) {
        nums1[i][j] = sc.nextInt();
      }
    }
    boolean found = false;

    for (int i = 0; i < rows; i++) {
      for (int j = i + 1; j < colm; j++) {

        if (nums1[i][j] != nums1[j][i]) {
          found = true;
          break;
        }
      }
      if (found) {
        System.out.println(" the given matrix is not symmetric");
        break;
      }
    }

    if (!found) {
      System.out.println(" the given matrix is symmetric");
    }
    sc.close();
  }
}
