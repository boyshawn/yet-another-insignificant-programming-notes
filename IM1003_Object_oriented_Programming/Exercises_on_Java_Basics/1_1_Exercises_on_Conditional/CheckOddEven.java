/*
 * Exercise CheckOddEven (if-else): Write a program called CheckOddEven which
 * prints "Odd Number" if the int variable “number” is odd, or “Even Number”
 * otherwise.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class CheckOddEven {   // saved as "CheckOddEven.java"
   public static void main(String[] args) {
      int number = 49;       // set the value of number here!
      System.out.println("The number is " + number);
      if (number % 2 == 0) {
         System.out.println("Even Number");
      } else {
         System.out.println("Odd Number");
      }
   }
}
