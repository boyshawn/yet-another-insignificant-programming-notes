/*
 * Exercise Hex2Bin (Array and Table Lookup): Write a program called Hex2Bin to
 * convert a hexadecimal string into its equivalent binary string. The output 
 * shall look like:
 *
 * Enter a Hexadecimal string: <b>1abc</b>
 * The equivalent binary for hexadecimal "1abc" is 0001 1010 1011 1100
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;

public class Hex2Bin{
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        String[] hexBits = {"0000", "0001", "0010", "0011",
                            "0100", "0101", "0110", "0111",
                            "1000", "1001", "1010", "1011",
                            "1100", "1101", "1110", "1111"};
        String hexStr;
        char hexChar;

        //Getting information
        System.out.print("Enter a Hexadecimal string: ");
        hexStr = keyboardIn.next();

        //Output
        System.out.print("The equivalent binary for hexadecimal \"" + hexStr + 
                "\" is ");
        
        for(int i = 0;i < hexStr.length();i++){
            hexChar = hexStr.charAt(i);

            if(hexChar >= '0' && hexChar <= '9'){
                System.out.print(hexBits[(int) (hexChar - '0')] + " ");
            }
            else if(hexChar >= 'a' && hexChar <= 'f'){
                System.out.print(hexBits[(int) (hexChar - 'a' + 10)] + " ");
            }
            else if(hexChar >= 'A' && hexChar <= 'F'){
                System.out.print(hexBits[(int) (hexChar - 'A' + 10)] + " ");
            }
            else{
                System.out.println("Error: Invalid hexdecimal string");
                System.exit(1);
            }
        }
    }
}
