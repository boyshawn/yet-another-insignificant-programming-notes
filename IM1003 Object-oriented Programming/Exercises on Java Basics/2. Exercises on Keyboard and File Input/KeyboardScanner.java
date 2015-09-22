/*
 * Exercise KeyboardScanner (Keyboard Input): Write a program called 
 * KeyboardScanner to prompt user for an int, a double, and a String. The output
 * shall look like (the inputs are shown in bold):
 * Enter an integer: <b>12</b>
 * Enter a floating point number: <b>33.44</b>
 * Enter your name: <b>Peter</b>
 * Hi! Peter, the sum of 12 and 33.44 is 45.44
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;    // needed to use Scanner for input
public class KeyboardScanner {
    public static void main(String[] args) {
        int num1;
        double num2;
        String name;
        double sum;

        // Setup a Scanner called in to scan the keyboard (System.in)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num1 = in.nextInt();     // use nextInt() to read int
        System.out.print("Enter a floating point number: ");
        num2 = in.nextDouble();  // use nextDouble() to read double
        System.out.print("Enter your name: ");
        name = in.next();        // use next() to read String

        // Display
        System.out.println("Hi! " + name + ", the sum of " + num1 + " and " +num2 + " is " + (num1 + num2));
    }
}
