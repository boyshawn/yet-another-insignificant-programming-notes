/*
 * Print the area and circumference of a circle, given its radius.
 * @author    Francis Pang
 * @since     %I% %G%
 * @version   1.0
 */
public class CylinderComputation {  // Saved as "CylinderComputation.java"
   public static void main(String[] args) {
      // Declare variables
      double radius, height, surfaceArea, volume;
      final double PI = 3.14159265;
      
      // Assign a value to radius
      radius = 1.2;
      height = 1.7;
      
      // Compute area and circumference
      surfaceArea = (2 * radius * height) + (2 * radius * radius * PI);
      volume = 2.0 * radius * PI * height;
      
      // Print results
      System.out.print("The radius is ");  // Print description
      System.out.println(radius);          // Print the value stored in the variable
      System.out.print("The height is ");
      System.out.println(height);
      System.out.print("The surface area is ");
      System.out.println(surfaceArea);
      System.out.print("The volume is ");
      System.out.println(volume);
   }
}
