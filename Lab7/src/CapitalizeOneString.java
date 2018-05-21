import java.util.*;
/**
 * This program will get a line of input from the user
 * and will print a copy of the line in which the first
 * character of each word has been changed to upper case.
 * 
 * @author Patrick O'Brien
 * @version 1.0
 */
 public class CapitalizeOneString {
      
    
       public static void main(String[] args) {
	   
	   // Implement the user input processing here, before calling 
	   //  public static void printCapitalized(String str)
          Scanner keyInput = new Scanner(System.in);
          String inputLine = keyInput.next();

          //String a = capitalizeFirstLetter(inputLine);
          initials(inputLine);
          //letterCount(inputLine);

       }  // end main()
	   
       
	   // Print a copy of str to standard output, with the
       // first letter of each word in upper case
       static void printCapitalized( String str ) {

	   // Your logic goes here
	   }

	   //For Capitalizing first letter
    public static void capitalizeFirstLetter(String sstr){

        StringBuffer res = new StringBuffer();

        String[] strArr = sstr.split(" ");

        for (String str : strArr) {

            char[] stringArray = str.trim().toCharArray();

            stringArray[0] = Character.toUpperCase(stringArray[0]);

            str = new String(stringArray);

            res.append(str).append(" ");

        }

        System.out.print(res);

    }

    //for implementing the initials.
    public static String initials(String sstr){

        String[] strArr = sstr.split(" ");

        String str="";

        for(int i=0;i<strArr.length;i++){

            str=str+(strArr[i].charAt(0))+".";

        }

        return str.toUpperCase();

    }

    //for the letter count
    public static int letterCount(String str,char letter){

        int count=0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==letter){

                count++;

            }

        }

        return count;

    }
    }  // end class
