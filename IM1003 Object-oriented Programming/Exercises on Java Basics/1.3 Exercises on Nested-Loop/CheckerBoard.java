/*
 * Exercise CheckerBoard (nested-loop): Write a program called CheckerBoard 
 * that displays the following n×n (n=7) checkerboard pattern using two nested 
 * for-loops.
 * # # # # # # #
 *  # # # # # # #
 * # # # # # # #
 *  # # # # # # #
 * # # # # # # #
 *  # # # # # # #
 * # # # # # # #
 *@author Francis Pang
 *@since  %I% %G%
 *@version 1.0
 */
 

public class CheckerBoard {   // saved as "CheckerBoard.java"
   public static void main (String[] args) {
      int size = 7;    // size of the board

      for (int row = 1; row <= size; row++) {
         // Use modulus 2 to find alternate lines
         if ((row % 2) == 0) {   // row 2, 4, 6, 8
             System.out.print(" ");    // print a space, without newline
         }
         for (int col = 1; col <= size; col++) {
            System.out.print("# ");   // print # and a space, without newline
         }
         System.out.println();     // print a newline
      }
   }
}
