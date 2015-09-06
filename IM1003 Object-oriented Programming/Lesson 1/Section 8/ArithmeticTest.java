/**
 * Test Arithmetic Operations
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */
public class ArithmeticTest {     // Save as "ArithmeticTest.java"
    public static void main(String[] args) {

        int number1 = 98;     // Declare an int variable number1 and initialize it to 98
        int number2 = 5;      // Declare an int variable number2 and initialize it to 5
        int number3 = 77;
        int sum, difference, product, quotient, remainder;  // Declare five int variables to hold results

        // Perform arithmetic Operations
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;

        // Print results
        System.out.println("The sum, difference, product, quotient and remainder of " + number1 + " and " + number2 + " are " + sum + ", " + difference + ", " + product + ", " + quotient + ", and " + remainder);  // Print description

        ++number1;  // Increment the value stored in the variable "number1" by 1
        // Same as "number1 = number1 + 1"
        --number2;  // Decrement the value stored in the variable "number2" by 1
        // Same as "number2 = number2 - 1"
        System.out.println("number1 after increment is " + number1);  // Print description and variable
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2; 
        System.out.println("The new quotient of " + number1 + " and " + number2 
                + " is " + quotient);

        //Calculate second set of Arithmetic Operations
        sum = number1 + number2 + number3;
        product = number1 * number2 + number3;

        //Print second set of results
        System.out.println("The sum and product of " + number1 + ", " + number2 + ", " + number3 + "are " + sum + " and " + product);
        
        //Print the sum of 31 times of number1 and 17 times of number2 and 87 time of number3
        System.out.println("The sum of 31 times of number 1 and 17 times of number2 and 87 time of number3 are " + (31 * number1) + ", " + (17 * number2) + " and " + (87 * number3) );
    }
}
