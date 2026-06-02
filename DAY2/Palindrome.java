import java.util.Scanner;

public class Palindrome 
{
    public static void main(String args[]) 
    {
        // Use the Scanner class to read input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int reversedNum = 0;

        // Logic to reverse the number mathematically
        while (num != 0) {
            int digit = num % 10;          // Extract the last digit
            reversedNum = (reversedNum * 10) + digit; // Build reversed number
            num /= 10;                    // Remove the last digit
        }

        // Compare the original and reversed numbers
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
        
        scanner.close();
    }
}