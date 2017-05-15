/*
 * Exercise CircleComputation (User Input): Write a program called 
 * CircleComputation, which prompts user for a radius (of double) and compute 
 * the area and perimeter of a circle. The output shall look like:
 * Enter the radius: 1.2
 * The area is 4.5239
 * The perimeter is 7.5398223686155035
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;
import java.lang.Math;

public class CircleComputation{
    public static void main (String[] args){
        Scanner keyScanner = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius:");
        radius = keyScanner.nextDouble();

        System.out.println("The area is " + (Math.PI * radius * radius));
        System.out.println("The perimeter is " + (2 * Math.PI * radius));
    }
}
