/*
 * Exercise Hex2Dec: Write a program called Hex2Dec to convert an input 
 * hexadecimal string into its equivalent decimal number. Your output shall look
 * like:
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

import java.util.Scanner;

public class Hex2Dec{
    public static void main(String[] args){
        String hexStr;
        char hexChar;
        int decimalNumber = 0;
        Scanner keyboardIn = new Scanner(System.in);

        //Getting input from user
        System.out.print("Enter a Hexadecimal string: ");
        hexStr = keyboardIn.next();

        for(int i = 0;i < hexStr.length();i++){
            hexChar = hexStr.charAt(i);

            if (hexChar >= '0' && hexChar <= '9') {
                decimalNumber += Math.pow(16, hexStr.length() - i - 1) * 
                    (int) (hexChar - '0');
            } else if (hexChar >= 'a' && hexChar <= 'f') {   // lowercase
                decimalNumber += Math.pow(16, hexStr.length() - i - 1) * 
                    (int) (hexChar-'a'+10);
            } else if (hexChar >= 'A' && hexChar <= 'F') {   // uppercase
                decimalNumber += Math.pow(16, hexStr.length() - i - 1) * 
                    (int) (hexChar-'A'+10);
            } else {
                System.out.println("Error: Invalid hexadecimal string");
                System.exit(1);    // quit the program
            }
        }

        System.out.println("The equivalent decimal number for hexadecimal \"" + 
                hexStr + "\" is " + decimalNumber);
    }
}
