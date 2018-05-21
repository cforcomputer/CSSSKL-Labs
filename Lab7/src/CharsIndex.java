 import java.util.Scanner;
/**
 *3.1 Write a Java program named CharsIndex to get the index of all the characters of the alphabet. Ask
 * user to input a string. The sample output was produced by this string: "The quick brown fox jumps
 * over the lazy dog."
 *
 * @author Patrick O'Brien
 * @version 1.0
 * */

public class CharsIndex {

     public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the string: ");

            String s = scan.nextLine();

            char ch[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

            for(int i=0;i<ch.length;i++) {

                if(s.indexOf(ch[i]) != -1) {

                    System.out.println(ch[i]+": "+s.indexOf(ch[i]));

                } else {

                    System.out.println(ch[i]+": --");

                }

            }

        }

    }

