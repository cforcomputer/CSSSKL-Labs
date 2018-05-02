/**
 * Palindrome class
 *
 * @author Patrick O'Brien
 * @version 1.0
 */
public class GetRich
{
    public static void main(String args[]) {       
        getRichQuick();
    }
    public static void getRichQuick() {
        double moneyTotal = 1;
        int day = 1;
        
        while (moneyTotal < 1000000)
        {   
            {
                day++;
                moneyTotal += 1 + (moneyTotal/2);
                System.out.println("Day " + day + ": ($1 + " + moneyTotal/5 + ") >= $" + moneyTotal);
            }          
        }
    }
}
