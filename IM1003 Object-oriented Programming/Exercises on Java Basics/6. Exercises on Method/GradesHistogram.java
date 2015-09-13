/*
 * Exercise GradesHistogram (Method): Write a program called GradesHistogram, which reads in n grades (of int between 0 and 100, inclusive) from a text file called "grades.in" and displays the histogram horizontally and vertically. The file has the following format:
 *
 * numStduents:int
 * grade1:int grade2:int .... gradeN:int
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class GradesHistogram {
   public static int[] grades;
      // Declare an int array of grades, to be allocated later
   public static int[] bins = new int[10];
      // Declare and allocate an int array for histogram bins.
      // 10 bins for 0-9, 10-19,...., 90-100
   
   public static void main(String[] args) {
      readGrades("grades.in");
      computeHistogram();
      printHistogramHorizontal();
      printHistogramVertical();
   }
   
   // Read the grades from "filename", store in "grades" array.
   // Assume that the inputs are valid.
   public static void readGrades(String filename) { ...... }

   // Based on "grades" array, populate the "bins" array.
   public static void computeHistogram() { ....... }

   // Print histogram based on the "bins" array.
   public static void printHistogramHorizontal() { ...... }

   // Print histogram based on the "bins" array.
   public static void printHistogramVertical() { ...... }
}
