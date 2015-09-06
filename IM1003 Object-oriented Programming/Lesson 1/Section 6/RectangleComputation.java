/*
 * Print the area and permimeter of a rectangle, given its length and width in doubles
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */
public class RectangleComputation{
    public static void main(String[] args){
        //Declare variables
        double length, width, area, perimeter;

        //Assign values to length and width
        length = 3.14;
        width = 1.2;

        //Compute area and perimeter
        area = length * width;
        perimeter = 2 * (length + width);

        //Print results
        System.out.print("The length is ");     //Print the description
        System.out.println(length);             //Print the value stored in the variable
        System.out.print("The width is ");
        System.out.println(width);
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The perimeter is ");
        System.out.println(perimeter);
    }
}
