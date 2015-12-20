/*
 * gle java style
 * Exercise GradesStatistics (Method): Write a program called 
 * GradesStatistics, which reads in n grades (of int between 0 and 100, 
 * inclusive) and displays the average, minimum, maximum, and standard 
 * deviation. Your program shall check for valid input. You should keep the 
 * grades in an int[] and use a method for each of the computations. Your 
 * output shall look like:
 *
 * Enter the number of students: <b>4</b>
 * Enter the grade for student 1: <b>50</b>
 * Enter the grade for student 2: <b>51</b>
 * Enter the grade for student 3: <b>56</b>
 * Enter the grade for student 4: <b>53</b>
 * The average is 52.5
 * The minimum is 50
 * The maximum is 56
 * The standard deviation is 2.29128784747792
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;  // Declare an int[], to be allocated later

    // main() method
    public static void main(String[] args) {
        readGrades();
        System.out.println("The average is " + average());
        System.out.println("The minimum is " + min());
        System.out.println("The maximum is " + max());
        System.out.println("The standard deviation is " + stdDev());
    }

    // Prompt user for the number of students and allocate the "grades" array.
    // Then, prompt user for grade, check for valid grade, and store in 
    // "grades".
    public static void readGrades() { 
        Scanner keyboardIn = new Scanner(System.in);
        int numberOfStudents;

        System.out.print("Enter the number of students: ");
        numberOfStudents = keyboardIn.nextInt();

        grades = new int[numberOfStudents];

        for(int i = 0;i < numberOfStudents; i++){
            System.out.print("Enter the grade for student " + 
                    (i + 1) + ": ");

            grades[i] = keyboardIn.nextInt();
        }
    }

    // Return the average value of int[] grades
    public static double average() { 
        int total = 0;

        for(int i = 0;i < grades.length; i++){
            total += grades[i];
        }

        return (double) (total / grades.length);
    }

    // Return the maximum value of int[] grades
    public static int max() { 
        int max = 0;

        for(int grade: grades){
            if(max < grade){
                max = grade;
            }
        }

        return max;
    }

    // Return the minimum value of int[] grades
    public static int min() { 
        int min = 100;

        for(int grade: grades){
            if(min > grade){
                min = grade;
            }
        }

        return min;
    }

    // Return the standard deviation of the int[] grades
    public static double stdDev() { 
        double average = average();
        double variance = 0;

        for(int grade : grades){
            variance += (Math.pow(grade, 2) - Math.pow(average, 2));
        }
        
        variance /= grades.length;

        return (Math.sqrt(variance));
    }
}
