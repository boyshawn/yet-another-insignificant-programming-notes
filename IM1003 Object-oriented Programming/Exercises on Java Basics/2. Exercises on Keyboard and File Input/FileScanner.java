/*
 * Exercise FileScanner (File Input): Write a program called FileScanner to read
 * an int, a double, and a String form a text file called "in.txt", and produce 
 * the following output:
 * The integer read is 12
 * The floating point number read is 33.44
 * The String read is "Peter"
 * Hi! Peter, the sum of 12 and 33.44 is 45.44
 * You need to create a text file called "in.txt" (in Eclipse, right-click on 
 * the "project" ⇒ "New" ⇒ "File") with the following contents:
 * 12
 * 33.44
 * Peter
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;              // Needed to use Scanner for input
import java.io.File;                   // Needed to use File
import java.io.FileNotFoundException;  // Needed for file operation
   
public class FileScanner { 
   public static void main(String[] args) 
         throws FileNotFoundException {  // Needed for file operation
      int num1;
      double num2;
      String name;
      double sum;
   
      // Setup a Scanner to read from a text file
      Scanner in = new Scanner(new File("in.txt"));
      num1 = in.nextInt();      // use nextInt() to read int
      num2 = in.nextDouble();   // use nextDouble() to read double
      name = in.next();         // use next() to read String
   
      // Display
      System.out.println("Hi! " + name + ", the sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
   }
}
