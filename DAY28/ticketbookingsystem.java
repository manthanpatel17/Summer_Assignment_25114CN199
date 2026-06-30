import java.util.Scanner;

public class TicketBookingSystem 
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);

    int availableTickets = 100;

    System.out.println("Available Tickets: " + availableTickets);
    System.out.print("Enter number of tickets to book: ");
    int tickets = sc.nextInt();

    if (tickets <= availableTickets) {
      availableTickets = availableTickets - tickets;
      System.out.println("Booking Successful!");
      System.out.println("Remaining Tickets: " + availableTickets);
    } else {
      System.out.println("Tickets not available.");
    }

    sc.close();
  }
}