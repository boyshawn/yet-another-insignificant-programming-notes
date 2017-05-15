/*
 * Exercise SumAndAverage (Loop): Write a program called SumAndAverage to 
 * produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 100). Also compute
 * and display the average. 
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class SumAndAverage {   // saved as "SumAndAverage.java"
    public static void main (String[] args) {
        int sum = 0;          // store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // the lower bound to sum
        int upperbound = 100; // the upper bound to sum

        // Using for loop
        for (int number = lowerbound; number <= upperbound; ++number) { // for loop
            sum += number;     // same as "sum = sum + number"
        }

        //1. Modify the program to use a "while-do" loop instead of "for" loop.
        int number = lowerbound;
        sum = 0;
        while (number <= upperbound){
            sum += number;
            number++;
        }

        //2. Modify the program to use a "do-while" loop. 
        number = lowerbound;
        sum = 0;
        do{
            sum += number;
            number++;
        } while (number <= upperbound);

        // Compute average in double. Beware that int/int produces int.
        average = (double) sum / upperbound;

        /* 
         * Answer for Question 3
         * What is the difference between "for" and "while-do" loops? 
         * Answer: There is no much difference between these 2 conditional 
         * loops. The only difference is that when using for loop, you are 
         * allowed to have a local variable in the for loop, while the for loop
         * exit condition is dependent on it. In case of while-do loop, you have
         * to explicitly declare a variable outside the scope of the while-do 
         * loop. This decrease readability of the program, as depicted in 
         * <a href="http://stackoverflow.com/questions/8803674/declaring-variables-inside-or-outside-of-a-loop">Stack Overflow</a>.
         *
         * What is the difference between "while-do" and "do-while" loops?
         * Answer: The differences between these 2 loops are in the way the 
         * program executes the loop. In while-do loop, the program checks for 
         * the validity of the looping condition before executing the statements
         * inside the loop. In do-while loop, the program executes the 
         * statements inside the loop first, and then it checks the validity of
         * looping condition. In this aspect, do-while loop will always execute 
         * the statements inside the loop at least once more than the while-do 
         * loop.
         */

        /* 
         * 4. Modify the program to sum from 111 to 8899, and compute the
         * average. Introduce an int variable called count to count the numbers
         * in the specified range. 
         */

        int count = 0;
        for (int i = 111; i <= 8899; i++) {
            sum += count;
            count++;
        }

        /*
         * 5. Modify the program to sum only the odd numbers from 1 to 100, and
         * compute the average. 
         */

        count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0){
                sum += i;
                count++;
            }
        }

        /*
         * 6. Modify the program to sum those numbers from 1 to 100 that is
         * divisible by 7, and compute the average. 
         */

        count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0){
                sum += i;
                count++;
            }
        }

        average = (double) sum / count;

        /*
         * 7. Modify the program to find the "sum of the squares" of all the
         * numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100. 
         */

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        // Print sum and average.
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
