import java.util.Scanner;

public class Productdigits 
{
    public static void main(String args[]3) 
    {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Handle negative numbers by taking the absolute value
        int temp = Math.abs(num);
        int product = 1;

        // Special case: If the input is 0, the product is 0
        if (temp == 0) {
            product = 0;
        } else {
            // Extract and multiply digits
            while (temp > 0) {
                int digit = temp % 10; // Get the last digit
                product *= digit;      // Multiply into running total
                temp /= 10;            // Remove the last digit
            }
        }

        System.out.println("The product of the digits is: " + product);
        
        // Close the scanner
        sc.close();
    }
}