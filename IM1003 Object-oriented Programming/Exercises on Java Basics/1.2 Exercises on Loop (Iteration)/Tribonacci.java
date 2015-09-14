/*
 * Tribonacci numbers are a sequence of numbers T(n) similar to Fibonacci 
 * numbers, except that a number is formed by adding the three previous numbers,
 * i.e., T(n)=T(n-1)+T(n-2)+T(n-3), T(1)=T(2)=1, and T(3)=2. Write a program 
 * called Tribonacci to produce the first twenty Tribonacci numbers.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class Tribonacci {
    public static void main (String args[]) {
        int n = 4;          // the index n for F(n), starting from n=4
        int fn;             // F(n) to be computed
        int fnMinus1 = 2;   // F(n-1), init to F(3)
        int fnMinus2 = 1;   // F(n-2), init to F(2)
        int fnMinus3 = 1;   // F(n-3), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2 + fnMinus3;
        double average;

        System.out.println("The first " + nMax + " Tribonacci numbers are:");
        System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1);

        while (n <= nMax) {
            // Compute F(n), print it and add to sum
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            sum += fn;
            System.out.print(" " + fn);
            
            // Adjust the index n and shift the numbers
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            n++;
        }

        // Compute and display the average (=sum/nMax)
        System.out.println(); //Print a line break
        average = (double) sum / nMax;
        System.out.println("The average is " + average);
    }
}
