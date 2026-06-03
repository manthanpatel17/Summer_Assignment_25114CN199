import java.util.*;
class LCM
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Checking for the largest
        // Number between them
        int ans = (a > b) ? a : b;

        // Checking for a smallest number that
        // can be divided by both numbers
        while (true) 
            {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }

        // Printing the Result
        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
    }
}