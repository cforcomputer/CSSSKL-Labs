//what imports do you need?:
import java.util.Scanner;
/**
 * Min and max exploration
 * 
 * @Patrick O'Brien 
 * @1.0
 */
public class Lab2b {
   //Part 4a 
   public static double maxNumber1 = Math.max(22.3, 34.5);
   public static double minNumber1 = Math.min(3.6/7.2, 3.8/6.9);
   public static double maxNumber2 = Math.max(2/3, 0.1);
   public static double minNumber2 = Math.min(13.5555, 13.5556); 
   
   public static String name;   
   public static double num1, num2, num3, x, y, z;
   
   public static void main(String[] args) {
       //Part 4a here:
       //Decided to declare outside the main method
       //Don't forget to print the given variables!
       System.out.println(maxNumber1);
       System.out.println(minNumber1);
       System.out.println(maxNumber2);
       System.out.println(minNumber2);
       System.out.println();
       //output is what I thought it would be 
       //OUTPUTS are: 34.5, 0.5, 0.1, 13.5555
       
       //Part 4b here:
       //I will declare some variables for you:
       Scanner keyInput = new Scanner(System.in);
       
       
       //take over!
       System.out.println("Please enter your name followed by three numbers (space separated): \n");
       name = keyInput.nextLine();
       
       System.out.println("Please enter the first number");
       num1 = keyInput.nextDouble();
       
       System.out.println("Please enter the second number");
       num2 = keyInput.nextDouble();
       
       System.out.println("Please enter the last number");
       num3 = keyInput.nextDouble();
      
       System.out.println("Here are your numbers %name from smallest to largest \n");
       //System.out.println("Numbers: (" + x + "," + y + "," + z + " ");
       
       x = //(Math.max(num1, num2));
       y = //(Math.max(num1, num3));
       z = //(Math.min(x,y));
       
       System.out.println("Your numbers: " + z);
    }
}
