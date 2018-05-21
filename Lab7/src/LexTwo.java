import java.util.*;

/**
 *
 * @author Patrick O'Brien
 * @version 1.0
 *
 * */

public class LexTwo {

        public static String lexLargest(String str)

        {
            String[] arr=str.split("\\s+");
            Arrays.sort(arr,Collections.reverseOrder());
            return arr[0];
        }

        public static String largestBy(String str)
        {
            String[] arr=str.split("\\s+");
            Arrays.sort(arr);
            int largest = arr[0].length();
            int arrindex = 0;

            for (int i=1; i<arr.length; i++){

                if(arr[i].length() > largest)
                {
                    largest = arr[i].length();
                    arrindex = i;
                }
            }
            return arr[arrindex];
        }



        public static String largestByAction(String str, int action)

        {

            if(action == 1)
                return largestBy(str);

            else if(action==2)
                return lexLargest(str);

            else
                return "";

        }

        public static void main(String a[]) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String:-"); // Input string from user

            String str = sc.nextLine();
            String largestlexstr = "";
            String largeststr = "";
            largestlexstr = lexLargest(str); //Call lexLargest method and return lexographic largest string

            System.out.printf("Largest Lexicographic word is : %s",
                    largestlexstr );//Display

            System.out.println();

            largeststr = largestBy(str); //Call lexLargest method and return string with largest length
            System.out.printf("Largest word is : %s",
                    largeststr);
            System.out.println();

            //Call Largest string by action 1 or 2

            String largestbyaction=largestByAction(str,1);
            System.out.printf("Largest word is : %s",largestbyaction);//Largest in length will be called
        }

}
