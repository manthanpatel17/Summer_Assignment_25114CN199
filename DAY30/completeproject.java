import java.util.Scanner;

public class CompleteProject {
  static String[] movieNames = new String[50];
  static String[] genres = new String[50];
  static int[] years = new int[50];
  static int count = 0;

  static void addMovie(Scanner sc) {
    System.out.print("Enter Movie Name: ");
    movieNames[count] = sc.nextLine();

    System.out.print("Enter Genre: ");
    genres[count] = sc.nextLine();

    System.out.print("Enter Release Year: ");
    years[count] = sc.nextInt();
    sc.nextLine();

    count++;
    System.out.println("Movie Added Successfully!");
  }

  static void displayMovies() {
    if (count == 0) {
      System.out.println("No Movies Found.");
      return;
    }

    System.out.println("\nMovie Records:");
    for (int i = 0; i < count; i++) {
      System.out.println((i + 1) + ". " + movieNames[i]);
      System.out.println(genres[i]);
      System.out.println(years[i]);
    }
  }

  static void searchMovie(Scanner sc) {
    System.out.print("Enter Movie Name: ");
    String search = sc.nextLine();

    boolean found = false;

    for (int i = 0; i < count; i++) {
      if (movieNames[i].equalsIgnoreCase(search)) {
        System.out.println("Movie Found:");
        System.out.println((i + 1) + ". " + movieNames[i]);
        System.out.println(genres[i]);
        System.out.println(years[i]);
        found = true;
      }
    }

    if (!found) {
      System.out.println("Movie Not Found.");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\n===== MOVIE RECORD SYSTEM =====");
      System.out.println("1. Add Movie");
      System.out.println("2. Display Movies");
      System.out.println("3. Search Movie");
      System.out.println("4. Exit");
      System.out.print("Enter Choice: ");

      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          addMovie(sc);
          break;
        case 2:
          displayMovies();
          break;
        case 3:
          searchMovie(sc);
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid Choice");
      }

    } while (choice != 4);

    sc.close();
  }
}
