/*
 * Exercise CheckerBoard (nested-loop): Write a program called CheckerBoard that displays the following n×n (n=7) checkerboard pattern using two nested for-loops.
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

      for (int row = 1; ......; ......) {
         // Use modulus 2 to find alternate lines
         if ((row % 2) == 0) {   // row 2, 4, 6, 8
            ......
         }
         for (int col = 1; ......; ......) {
            ......
         }
         ......
      }
   }
}
