import java.io.*;
import java.util.*;
/**
 * @author Patrick O'Brien
 * @version 1.0
 * */
public class Advice{

    public static void main(String[] args){

        try {

            Scanner keyInput = new Scanner(System.in);
            int count = 0;
            String line;
            FileInputStream fileInputRead = null; //check if nothing exists
            int exist;
            try {
                fileInputRead = new FileInputStream("advice.txt");
                exist = 1; //if it exists, generate fileInputStreamer "Advice.txt"
            }
            catch (Exception e) {
                exist = 0; //catch if Advice.txt does not exist
            }

            FileOutputStream fileOutputZero = new FileOutputStream("adviceLog.txt",true);
            PrintWriter writeToPrintWriter = new PrintWriter(fileOutputZero);
            //start write to Buffer and check if "AdviceLog.txt exists.
            if (exist == 1) { //if adviceLog exists, initialize new Scanner class.
                Scanner fileScan = new Scanner(fileInputRead);
                //while the scan detects a new line, move to the line after and read
                while (fileScan.hasNextLine()) {
                    line = fileScan.nextLine();
                    //if there is no next, count ++ and print the line.
                    if (!line.equals("")) {
                        count++;
                        System.out.println(line);
                    }
                }
                //continue until all lines are read, then close
                fileInputRead.close();
                fileScan.close();
            }
            //if no text is detected, prompt the user to enter advice
            if (count == 0) {
                System.out.println("Enter advice:");
                System.out.println("Press use the 'return' key twice to submit your advice! Oh what an incredible price my dear Brice.");
            }
            //if text is already present, prompt the user with a different message
            else {
                System.out.println("Enter different advice (you've previously entered advice):");
            }
            //use Printwriter to generate the 'Advice.txt' file.
            FileOutputStream fileOutputOne = new FileOutputStream("Advice.txt");
            PrintWriter writeToPrintWriterSecond = new PrintWriter(fileOutputOne);
            line = " ";
            //if text is detected, next line
            while (!line.equals("")) {
                line = keyInput.nextLine();
                //continue until text is not detected, then print the next text.
                if (!line.equals("")) {
                    writeToPrintWriterSecond.println(line);
                    writeToPrintWriter.println(line);
                }
            }
            //once text has been printed, close all.
            writeToPrintWriter.close();
            writeToPrintWriterSecond.close();
            fileOutputZero.close();
            fileOutputOne.close();
        } //catch any exceptions during this process.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}