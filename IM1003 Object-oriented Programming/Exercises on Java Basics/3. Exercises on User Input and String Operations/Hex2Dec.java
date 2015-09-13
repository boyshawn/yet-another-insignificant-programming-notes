/*
 * Exercise Hex2Dec: Write a program called Hex2Dec to convert an input hexadecimal string into its equivalent decimal number. Your output shall look like:
 *
 * Enter a Hexadecimal string: <b>1a</b>
 * The equivalent decimal number for hexadecimal "1a" is 26
 *    
 * Enter a Hexadecimal string: <b>1y3</b>
 * Error: Invalid Hexadecimal String "1y3"
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class Hex2Dec{
String hexStr;
char hexChar;
......
hexChar = hexStr.charAt(i);
......
if (hexChar >= '0' && hexChar <= '9') {
   ... (hexChar-'0') ...
   ...
} else if (hexChar >= 'a' && hexChar <= 'f') {   // lowercase
   ... (hexChar-'a'+10) ...
   ...
} else if (hexChar >= 'A' && hexChar <= 'F') {   // uppercase
   ... (hexChar-'A'+10) ...
   ...
} else {
   System.out.println("Error: Invalid hexadecimal string");
   System.exit(1);    // quit the program
}
}
