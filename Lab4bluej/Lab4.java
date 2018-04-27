
/**
 * Lab4 All
 * 
 * @Patrick O'Brien
 * @1.0
 */
import java.util.Scanner;
import java.lang.*;

public class Lab4 {

    /**
     * main method (driver) to execute all the method calls properly
     *
     * @param args
     */
    /* sorry i didn't have time to assemble the main.
    public static void main(String[] args) {
           countGrains();
           System.out.printf(countGrains());
           
           
        } /**
         * Calculates the number of grains and prints out the result per lab instructions
         */
        

        public static void countGrains () {
            // declare and initialize your variables first, if any     
            /*
            int j;
            int sum;
            for (j = 1; j <= 64; j += j) { //additional grains calculation
                
                System.out.printf(" and you got %d grain(s)", j);
            }
            for (sum = 1; sum <= 64; sum += j) { //sum of grains calculation
                System.out.printf(" of rice for a total of %d grain(s).", sum);
            }
            */
           double total = 0, add = 1;
           for (double day = 1; day <= 64; day++)
           {
               total += add;
               System.out.println("Day " + day + " and you got " + add + "grain(s) of rice for a total of " + total + "grain(s).");
               add *= 2;
           }           
        }
        /**
         * Determines if a number is power of 2 and displays result per lab instructions
         * @param numberInput
         */
        /*(More Single Loop Exercises)
         * (a) Write a method powerOfTwo that takes an integer argument and prints to the console what power of 2
         * the given number is. If the number is not a power of 2, then simply print a message that says so. For
         * example,
         * powerOfTwo(64); //should print: "64 is 2 to the power of 6"
         * powerOfTwo(73); //should print: "73 is not a power of 2" 
         * Note:
         * you are not allowed to use any library functions!*/
        public static void powerOfTwo ( int numberInput){

            
            // declare and initialize your variables first, if any then start writing your code
            // use what we learned in branching exercise if/else statements
            //Scanner keyInput = new Scanner(System.in);
            //int powers = keyInput.nextInt();
            int powers = numberInput;
            int j, count = 0;
            for (j = 1; j < powers; j *= 2)
            {
                count++;
            }
            if (j == powers)
            {
                System.out.println(powers + " is 2 to the power of " + count);
            }
            
            else if ((powers & (powers - 1)) != 0)
            {
                  System.out.printf("%d is not a power of 2.", powers);
            }
            /*if ((powers & (powers - 1)) == 0)
            {
                System.out.printf("%d is a power of 2.", powers);  
            }
            */
        }

        /**
         * Reverses the digits of a given integer, i.e. 12345 would become 54321 per lab instructions
         *
         * @param number
         */
        public static void numBackward ( int number){

            // declare and initialize your variables first, if any then start writing your code
            int rev_number = 0;
            while (number > 0)
            {
                rev_number = rev_number*10 + number%10;
                number = number/10;
                System.out.println(rev_number);
            }
}
            

        

        /**
         * Produces and displays a straight line using asterisks per lab instructions
         */

        public static void straightLine () {

            // declare and initialize your variables first, if any then start writing your code
            //Scanner keyInput = new Scanner(System.in);
            //keyInput.nextInt();
           /* //iteration 1
            for (int three = 0; three < 3; three++)
            {       
                System.out.print("*");
                for (int threeTimes = three; threeTimes < 3; threeTimes++)
                System.out.print("");
            }
            */
            /* //iteration 2
             *
            while (three == 3)
            {
                System.out.println("***");
                while (five == 5);
                {
                    System.out.println("******");
                }
            }
            */
           //interation 3
           // declare and initialize your variables first, if any then start writing your code
            // x == 4
            // inner body " ": x - numLids ("*" on each side) == x - 2
            Scanner keyInput = new Scanner(System.in);
            int checkNumber = keyInput.nextInt();
            
            //while ()
            for(int row = 0; row < checkNumber; row++)
            { //for each row
                for(int col = 0; col < checkNumber; col++) 
                { //for every column

                    System.out.print("* "); //print row

                }

                System.out.println(); //new row

            }
            
        }

        /**
         * void method that asks the user for an integer x (using Scanner), and prints box using asterisks
         * refer to detailed instructions in lab description part 6
         */

        public static void boxMaker () {

            // declare and initialize your variables first, if any then start writing your code
            // x == 4
            // inner body " ": x - numLids ("*" on each side) == x - 2
            /*Scanner keyInput = new Scanner(System.in);
            int checkNumber = keyInput.nextInt();
            
            //while ()
            for(int row = 0; row < checkNumber; row++)
            { //for each row
                for(int col = 0; col < checkNumber; col++) 
                { //for every column

                    System.out.print("* "); //print row

                }

                System.out.println(); //new row

            }
               */
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Please enter an integer");
            int size = keyboard.nextInt();
            
            for (int i = 1; i <= size; i++)
            {
                if ((i == 1) || ( i == size))
                {
                    for (int j = 0; j < size; j++)
                    {
                        System.out.print("* ");
                    }   
                }   
                else
                {
                    System.out.print("* ");
                    for (int k = size - 2; k > 0; k--)
                    {
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
            
                System.out.println();
            }
        }
        

        /**
         *  void mathod to print a shape that is a triangular pattern with sides of 6 asterisks
         *  refer to detailed instructions in lab description part 7a
         */

        public static void shape7a ( int number){

            // declare and initialize your variables first, if any then start writing your code
            int asterisk = number, pointCount = 0;
            for (int i = number; i > 0; i--)
            {
                for (int point = 0; point < pointCount; point++)
                {
                    System.out.print(". ");
                }
                for (int asteriskBright = asterisk; 0 < asteriskBright; asteriskBright--)
                {
                    System.out.print("* ");
                }
                System.out.println();
                asterisk--;
                pointCount++;
            }


        }


        /**
         * void method to print a shape that is an "X" pattern with arms of 3 asterisks each.
         * refer to detailed instructions in lab description part 7b
         */

        public static void shape7b ( int number){

            // declare and initialize your variables first, if any then start writing your code
            
            for (int rev_number = number; rev_number > 0; rev_number--)
            {
                for (int tertiary = 0; (number - rev_number) > tertiary; tertiary++)
                {
                    System.out.print(". ");
                }       
                
                System.out.print("* ");
                for (int tertiary = (rev_number * 2) -1; tertiary > 0; tertiary--)
                {
                    System.out. print(". ");
                }            
                System.out.print("* ");
            
            
                for (int tertiary = 0; (number - rev_number) > tertiary; tertiary++)
                {
                    System.out.print(". ");
                }
                System.out.println();
            }
            
            
            for (int rev_number = 0; rev_number < number; rev_number++)
            {
                System.out.print(". ");
            }
            
            System.out.print("* ");
            
            for (int rev_number = 0; rev_number < number; rev_number++)
            {
                System.out.print(". ");
            }            
            System.out.println();
            for (int rev_number = 0; rev_number < number; rev_number++)
            {
                for (int tertiary = 0; ((number - rev_number) - 1) > tertiary; tertiary++)
                {
                    System.out.print(". ");
                }
                
                System.out. print("* ");
                
                for (int tertiary = 0; tertiary < ((rev_number * 2) + 1); tertiary++)
                {
                    System.out.print(". ");
                }
                System.out.print("* ");
                
                for (int tertiary = 0; ((number - rev_number) - 1) > tertiary; tertiary++)
                {
                    System.out.print(". ");
                }
                
                System.out.println();
            }
        }

    } // end class Lab4
