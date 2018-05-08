import java.io.*;
import java.util.*;
import java.lang.*;
/**
 * @author Patrick O'Brien
 * @version 1.0
 * */

public class Diary {

    public static void main(String[] args) throws Exception {
        String date; //initialize variable date as a string
        Scanner keyInput = new Scanner(System.in);
        //get date
        System.out.println("Enter the date as three integers separated by spaces:");
        date = keyInput.nextLine();
        //split string to get month, date, year

        String[] t = date.split(" ");
        int month = Integer.parseInt(t[0]);
        int dateTime = Integer.parseInt(t[1]);
        int year = Integer.parseInt(t[2]);
        //parse verify int

        //format date as mm/dd/yyyy
        String newDate = month + "/" + dateTime + "/" + year;
        //start bufferedWriter to write to the output file
        //open the file to append at the end of the file

        BufferedWriter buffer = new BufferedWriter(new FileWriter("diaryLog.txt", true));
        buffer.newLine();
        //write date

        buffer.write("Date: " + newDate);
        buffer.newLine();
        System.out.println("enter as many lines of prose you wish (for their to-do's list or diary entry)");
        System.out.println("enter quit to stop ");
        String wishLine;
        //get diary entry until user enters quit

        while (!(wishLine = keyInput.nextLine()).equalsIgnoreCase("quit"))

        {
            buffer.write(wishLine); //write diary entry to file
            buffer.newLine();
        }

        buffer.close(); //once writing over close the file
    }
}