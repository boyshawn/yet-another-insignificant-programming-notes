/*
 * Sum from a lowerbound to an upperbound using a while-loop
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */
public class RunningNumberSum {  // Save as "RunningNumberSum.java"
    public static void main(String[] args) {
        int lowerbound = 1;      // Store the lowerbound
        int upperbound = 1000;   // Store the upperbound
        int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
        // Set the initial sum to 0
        // Use a while-loop to repeatitively sum from the lowerbound to the upperbound
        int number = lowerbound;
        while (number <= upperbound) {
            sum = sum + number;  // Accumulate number into sum
            ++number;            // Next number
        }
        // Print the result
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);

        //1. Modify the above program to sum all the numbers from 9 to 888. 
        lowerbound = 9;
        number = 0;
        upperbound = 888;
        sum = 0;
        while(number <= upperbound){
            sum += number;
            number++;
        }

        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
       
        //2. Modify the above program to sum all the odd numbers between 1 to 1000. (Hint: Change the post-processing statement to "number = number + 2". Ans: 250000)
        
        lowerbound = 1;
        number = 1;
        upperbound = 1000;
        sum = 0;
        while(number <= upperbound){
            sum += number;
            number = number + 2;
        }
        
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
        
        //3. Modify the above program to sum all the numbers between 1 to 1000 that are divisible by 7. (Hint: Modify the initialization and post-processing statements. Ans: 71071.)

        number = 7;
        upperbound = 1000;
        sum = 0;
        while(number <= upperbound){
            sum += number;
            number = number + 7;
        }
        
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);

        //4. Modify the above program to find the sum of the square of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 +...

        number = 1;
        upperbound = 100;
        sum = 0;
        while(number <= upperbound){
            sum = sum + (number * number);
            number++;
        }
        
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
