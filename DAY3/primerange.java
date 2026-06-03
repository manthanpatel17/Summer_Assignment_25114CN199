import java.util.*;
class PrimeRange
{
   public static void main (String args[])
   {		
       int i=0;
       int n=0;

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the range");
       int range = sc.nextInt();

       String  primeNumbers = "";

       for (i = 1; i<=range; i++)         
       { 		  	  
          int c=0; 	  
          for(n =i; n>=1; n--)
	  {
             if(i%n==0)
	     {
 		c = c + 1;
	     }
	  }
	  if (c ==2)
	  {
	   
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}