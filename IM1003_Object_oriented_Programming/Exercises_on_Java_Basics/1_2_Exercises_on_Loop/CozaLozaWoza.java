/*
 * Exercise CozaLozaWoza (Loop & Condition): Write a program called CozaLozaWoza
 * which prints the numbers 1 to 110, 11 numbers per line. The program shall 
 * print "Coza" in place of the numbers which are multiples of 3, "Loza" for 
 * multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and
 * 5, and so on.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 0.1
 */

public class CozaLozaWoza {   // saved as "CozaLozaWoza.java"
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 110;
        for (int number = lowerbound; number <= upperbound; ++number) {
            // Print "Coza" if number is divisible by 3
            if (number % 3 == 0) {   
                System.out.print("Coza");
            }
            // Print "Loza" if number is divisible by 5
            if (number % 5 == 0) {
                System.out.print("Loza");
            }
            // Print "Woza" if number is divisible by 7
            if (number % 7 == 0) {
                System.out.print("Woza");
            }
            // Print the number if it is not divisible by 3, 5 and 7
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                System.out.print(number);
            }
            // Print a newline if number is divisible by 11; else print a space
            if (number % 11 == 0){
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }

        /*
         * TRY: Modify the program to use nested-if (if ... else if ... 
         * else if ... else) instead.
         */
        
        for (int number = lowerbound; number <= upperbound; ++number) {
            // Print "Coza" if number is divisible by 3
            if (number % 3 == 0) {   
                System.out.print("Coza");
            }
            // Print "Loza" if number is divisible by 5
            else if (number % 5 == 0) {
                System.out.print("Loza");
            }
            // Print "Woza" if number is divisible by 7
            else if (number % 7 == 0) {
                System.out.print("Woza");
            }
            // Print the number if it is not divisible by 3, 5 and 7
            else{
                System.out.print(number);
            }
            // Print a newline if number is divisible by 11; else print a space
            if (number % 11 == 0){
                System.out.println();
            }
            else {
                System.out.print(" ");
            }
        }

    }
}
