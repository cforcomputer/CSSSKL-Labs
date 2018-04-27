import java.util.Scanner; //necessary for reading keyboard input
/**
 * Conversions related to temperatures and times
 * 
 * @author Patrick O'Brien
 * @version 1.0
 */
public class Lab2a {   
    public static void main(String[] args) {
        //Part 1 variables should be typed below this line:
        
		int result1 = (7 * 3) % 4 - (2 * 6) / 5 + 10 / (3 / 2);

		int result2 = 2 / (4 - 3) + ((5 * 4 % 3 * 5 - 6) * 2) - 5;
		
		int i = 10, j = 20, k; k = ++i - j--;
		
        //make sure to print them!
        System.out.println(result1 + " " + result2 + " " + k);
		
        //Tests for Part 2:
        double f1 = 32;
        double k1 = kelvins(f1);
		temperaturePrinter(f1, k1);
        
        //make some more declarations and tests 
        //print for temperaturePrinter
		temperaturePrinter(31, kelvins(31));
		temperaturePrinter(42, kelvins(42));
		temperaturePrinter(100, kelvins(100));
		temperaturePrinter(10, kelvins(10));
		temperaturePrinter(55, kelvins(55));
		
		
        //Tests for Part 3 (c) - using Scanner:
        Scanner in = new Scanner(System.in);
		secondTime(3662);
		inSeconds(1, 2, 2);
		System.out.println("And, using the return value " + inSeconds(1, 1, 1));
        //prompt the user: "Please enter a total number of seconds"
		System.out.print("Please enter a total number of seconds: ");
        //use the keyboard input in your secondTime method
        secondTime(in.nextInt());
        
    }
    /**
     * Part 2 - kelvins method  - takes as argument a double corresponding to
     * degrees Fahrenheit, then returns a double corresponding to the
     * same input temperature in degrees Kelvin.
     */
    public static double kelvins(double fah) {
        //Your code here:
        
        return (5.0 / 9.0) * (fah - 32.0) + 273.15;
    }
    
    /**
     * Part 2 - temperaturePrinter method - takes as arguments two doubles. The
     * first is a temperature in degrees Fahrenheit and the second is the
     * same temperature in degrees Kelvin. This method is void and it 
     * prints to the screen:
     * 
     * <arg1> F corresponds to <arg2> K
     */
    
    public static void temperaturePrinter(double fah, double kel) {
        System.out.printf("%.2f F corresponds to %.2f K%n", fah, kel);
    }
	
    /**
     * Part 3 - secondTime method - convert total number of seconds into hours,
	 * minutes and seconds, and print them out.
     */
    public static void secondTime(int inputseconds) {
        //Your code here:
	int seconds = inputseconds;
        int minutes = seconds / 60;
        seconds %= 60;
        int hours = minutes / 60;
        minutes %= 60;
        System.out.printf("%d seconds corresponds to:%n", inputseconds);
        System.out.printf("%d hours, %d minutes and %d seconds%n", hours, minutes, seconds);
        System.out.println();
    }
    
    /**
     * Part 3 - inSeconds method - takes as arguments three integers: hours, 
     * minutes and seconds, computes the exact time in seconds, then returns 
     * the total number of seconds and prints a message to the screen.
     */
    
    //This method's signature (and code) is all on you!
    public static int inSeconds(int hours, int minutes, int seconds) {
        int totalseconds = hours * 3600 + minutes * 60 + seconds;
        System.out.printf("%d hours, %d minutes and %d seconds corresponds to:%n", hours, minutes, seconds);
        System.out.println(totalseconds + " seconds");
        return totalseconds;
    }
}