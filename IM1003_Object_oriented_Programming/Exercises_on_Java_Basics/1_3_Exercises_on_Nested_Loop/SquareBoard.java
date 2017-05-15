/*
 * Exercise SquareBoard (nested-loop): Write a program called SquareBoard that 
 * displays the following n×n (n=5) pattern using two nested for-loops.
 * # # # # #
 * # # # # #
 * # # # # #
 * # # # # #
 * # # # # #
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class SquareBoard {   // saved as "SquareBoard.java"
    public static void main (String[] args) {
        int size = 5;    // size of the board
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");  // print # and a space, without newline
            }
            System.out.println();     // print a newline
        }
    }
}
