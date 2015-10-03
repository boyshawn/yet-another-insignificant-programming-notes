/*
 * Exercise Bin2Dec: Write a program called Bin2Dec to convert an input binary 
 * string into its equivalent decimal number. Your output shall look like:
 *
 * Enter a Binary string: <b>1011</b>
 * The equivalent decimal number for binary "1011" is 11
 *  
 *  Enter a Binary string: <b>1234</b>
 *  Error: Invalid Binary String "1234"
 *  @author   Francis Pang
 *  @since    %I% %G%
 *  @version  1.0
 */

import java.util.Scanner;
public class Bin2Dec {
   public static void main(String[] args) {
      String binStr;    // input binary string
      int binStrLen;    // length of the input string
      int dec = 0;      // equivalent decimal number
      char binChar;     // each individual char in the binary string
    
      Scanner in = new Scanner(System.in);
   
      // Read input binary string
      System.out.print("Enter a Binary string: ");
      binStr = in.next();
   
      // Convert binary string into Decimal
      binStrLen = binStr.length();

      for(int i=0;i < binStrLen; i++){
          switch(binStr.charAt(i)){
              case '0':
                  break;
              case '1':
                  dec += (int) Math.pow(2,(binStrLen - i - 1));
                  break;
              default:
                  System.out.println("Error: Invalid Binary String \"" +
                          binStr + "\"");

                  System.exit(0);
                  break;
          }
      }

      //Print the result
      System.out.print("The equivalent decimal number for binary \"" + binStr +
              "\" is " + dec);
   }
}
