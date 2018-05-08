import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Patrick O'Brien
 * @version 1.0
 * */

public class Stats {

    public static void main(String[] args) throws IOException {
        //scan the file for the list, generate a basic array (chapter 6 is useful)
        //use scanner class to read the file and generate the list
        Scanner fileInput = new Scanner(new File("/home/anon/Desktop/CSSSKL-Labs/Lab6/src/fileIn.txt")); //change this depending on where it is being run
        List<Double> data = new ArrayList<>();
        //while the scanner detects a new line, add a new line and go to next double in the dataset.
        while(fileInput.hasNext()){
            data.add(fileInput.nextDouble());
            }
            //call on BufferedWriter class and assign to bufferWrite, write everything in the buffer to fileOut.txt
        BufferedWriter bufferWrite = new BufferedWriter(new FileWriter("fileOut.txt"));
        //initialize the temperature variables
        double average = 0, temperature;
        int minInd = 0, maxInd = 0;
        int negativeCount = 0, inRangeCount = 0, greaterCount = 0;
        //negativeCount = amount of negative numbers
        //inRangeCount = numbers between 0 and 100
        //greaterCount = numbers greater than or equal to 100

        for(int i = 0; i < data.size(); ++i){
            temperature = data.get(i); //set temperature = to i
            average += temperature; //add the average to the temperature
            if(temperature > data.get(maxInd)) //if the temperature is greater than the value of maxInd, set maxInd = i
                maxInd = i;
            if(temperature < data.get(minInd)) //if the temperature is less than the value of maxInd, set maxInd = i
                minInd = i;
            if(temperature < 0) //if temperature is negative, negCount ++
                ++negativeCount;
            else if(temperature < 100) //if temperature is less than 100 degrees, inRangeCount ++
                ++inRangeCount;
            else
                ++greaterCount; //otherwise, increase the greaterCount++
        }
        bufferWrite.write("Statistics for the numbers in fileIn.txt:\n");
        bufferWrite.write("average: " + average / data.size() + "\n"); //print average divided by data size
        bufferWrite.write("max: " + data.get(maxInd) + "\n");
        bufferWrite.write("min: " + data.get(minInd) + "\n");
        bufferWrite.write(String.format("There are %d negative numbers, %d numbers between 0 (inclusive) and 100 (exclusive)," +
                " and %d numbers that are greater than or equal to 100.\n", negativeCount, inRangeCount, greaterCount));
        bufferWrite.close();
        fileInput.close(); //close the buffer and the fileInput read ---> print to fileOut.txt
    }
}