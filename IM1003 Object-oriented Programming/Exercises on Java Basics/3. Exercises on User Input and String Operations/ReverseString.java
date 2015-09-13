/*
 * Exercise ReverseString: Write a program called ReverseString, which prompts user for a String, and prints the reverse of the String. The output shall look like:
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
      ......
   }
}
