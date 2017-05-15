/*
 * 
 * @author  Chua Hock-Chuan
 * @since   %I% %G%
 * @version 1.0
 */

public class RelationalLogicalOpTest {
   public static void main(String[] args) {
      int age = 18;
      double weight = 71.23;
      int height = 191;
      boolean married = false;
      boolean attached = false;
      char gender = 'm';
      
      System.out.println(!married && !attached && (gender == 'm'));           //This line will print out true, because the logical expression is true && true && true.
      System.out.println(married && (gender == 'f'));                         //This line will print out false, because the logical expression is false && false
      System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));//This line will print out true because the logical expression is true && true && true.
      System.out.println((height >= 180) || (weight >= 90));                  //This line will print out false becausr the logical expression is true && false
   }
}
