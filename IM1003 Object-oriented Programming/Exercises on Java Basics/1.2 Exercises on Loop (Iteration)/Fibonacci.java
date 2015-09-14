/*
 * Exercise Fibonacci (Loop): Write a program called Fibonacci to display the 
 * first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and 
 * F(1)=F(2)=1. Also compute their average.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class Fibonacci {
    public static void main (String args[]) {
        int n = 3;          // the index n for F(n), starting from n=3
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus1 + " " + fnMinus2);

        while (n <= nMax) {
            // Compute F(n), print it and add to sum
            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.print(" " + fn);
            
            // Adjust the index n and shift the numbers
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
