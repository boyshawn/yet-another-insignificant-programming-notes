/*
 * Product from a lowerbound to an upperbound using a while-loop
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */
public class RunningNumberProduct {  // Save as "RunningNumberProduct.java"
    public static void main(String[] args) {
        //to compute the product of all the numbers from 1 to 10
        int lowerbound = 1;      // Store the lowerbound
        int upperbound = 10;   // Store the upperbound
        int product = 1;   // Declare an int variable "sum" to accumulate the numbers
        // Set the initial sum to 0
        // Use a while-loop to repeatitively sum from the lowerbound to the upperbound
        int number = lowerbound;
        while (number <= upperbound) {
            product = product * number;  // Accumulate number into sum
            ++number;            // Next number
        }
        // Print the result
        System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
    }
}
