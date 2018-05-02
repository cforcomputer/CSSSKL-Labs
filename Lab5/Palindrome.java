/**
 * Palindrome class
 *
 * @author Patrick O'Brien
 * @version 1.0
 */
import java.io.*;
import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String str){
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void palindromeCheck() {
        String someWord = ""; //Stores words read from user input
        int count = 0; //keeps track of Palindrome words
        int total = 0; //Counts the total number of lines read from the given text file
        System.out.println(" Enter some words separated by white space");
        Scanner keyboard = new Scanner(System.in);
       
        int pal = 0;
        String line = keyboard.nextLine().trim();
        keyboard = new Scanner(line);
        while (keyboard.hasNext()) {
            someWord = keyboard.next(); // store each word in a String variable then operate
            if(isPalindrome(someWord)){
                System.out.println(someWord);
                pal++;
            }
            total++; 
        }
        //if encountered ENTER then close scanner stream and terminate
        keyboard.close();
    
        System.out.println("There are "+pal+" palindromes out of the "+total+" provided.");
    }

    public static void main(String args[]) throws IOException {
        
        palindromeCheck();
    }
}