/*
 * Extracting Digits: Write a program to extract each digit from an int, in the 
 * reverse order. For example, if the int is 1542, the output shall be "2, 4, 5,
 * 1", with a comma separating the digits.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class ExtractingDigits{
    public static void main(String[] args){
        int n = 1542;
        while (n > 0) {
            int digit = n % 10;  // Extract the last digit
            System.out.print(digit + ",");
            n = n / 10;          // Drop last digit and repeat the loop
        }
    }
}
