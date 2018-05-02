import java.util.Scanner;
import java.io.*;
/**
 * Lab 5 main class
 * @author Patrick O'Brien
 * @version 1.0
 */


public class Lab5 {
    //note: java lang exception required for Palindrome and Taylor class calls.
    public static void main(String[] args) throws java.lang.Exception {
        //Display different options to users 
        Scanner sc = new Scanner(System.in);
        while(true) //repeat options until option 0 is selected
        {
            System.out.println("Welcome to Lab5! ");
            System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin. ");
            System.out.println("Enter 2 to calculate e^x for any real x. ");
            System.out.println("Enter 3 to identify how many palindromes are present in the words you enter. ");
            System.out.println("Enter 4 to re-print the menu. ");
            System.out.println("Enter 0 to exit. ");
            System.out.println("What is your choice? ");
            int choice = sc.nextInt();
            //activate different functionalities from independent classes
            switch(choice)
            {
                case 0: System.out.println("Hasta la vista, baby."); System.exit(0);
                case 1: GetRich.main(args); break; //call GetRich class methods
                case 2: System.out.print("Enter an x: ");
                Taylor.main(args); //call Taylor class methods
                break;
                case 3: System.out.print("Type in your Palindrome");
                Palindrome.main(args); //call Palindrome class methods
                case 4:   break;
                default: System.out.println("Invalid menu option. ");
            }
        }
    }
}
