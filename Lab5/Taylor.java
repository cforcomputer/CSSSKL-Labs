/**
 * Palindrome class
 *
 * @author Patrick O'Brien
 * @version 1.0
 */
import java.util.Scanner;

public class Taylor
{
   public static double getNext(double thisTerm, double x, int count)
   {
       return (thisTerm * x) / count; // multiply by x and divide by count
   }
  
   public static double eTaylor (double x)
   {
       int count = 1;
       double sum = 0;
       double nextTerm = 1;
       for (; nextTerm > 10e-16; count++) { //check to see if nextTerm is
           sum += nextTerm;
           nextTerm = getNext(nextTerm, x, count); 
       }
       return sum;
   }
   public static void main (String[] args) throws java.lang.Exception
   {
       Scanner s = new Scanner(System.in);
       double x = s.nextDouble();
       System.out.println("e^" + x + " = " + eTaylor(x)); // call eTaylor and print the output
   }
}
