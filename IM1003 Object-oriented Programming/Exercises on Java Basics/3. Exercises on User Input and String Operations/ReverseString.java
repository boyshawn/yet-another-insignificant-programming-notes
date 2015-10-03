/*
 * Exercise ReverseString: Write a program called ReverseString, which prompts 
 * user for a String, and prints the reverse of the String. The output shall 
 * look like:
 * Enter a String: <b>abcdef</b>
 * The reverse of String "abcdef" is "fedcba".
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String inStr;        // input String
        int inStrLen;        // length of the input String

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();   // use next() to read String
        inStrLen = inStr.length();

        // Use inStr.charAt(index) to extract character at 'index' from inStr
        System.out.print("The reverse of String \"" + inStr + "\" is \"");
        for(int i = inStrLen - 1; i >= 0; i--){
            System.out.print(inStr.charAt(i));
        }
        System.out.println("\".");
    }
}
