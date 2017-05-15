/*
 * Exercise GradesAverage (Array): Write a program called GradesAverage, which
 * prompts user for the number of students, reads it from the keyboard, and 
 * saves it in an int variable called numStudents. It then prompts user for the
 * grades of each of the students and saves them in an int array called grades.
 * Your program shall check that the grade is between 0 and 100. A sample 
 * session is as follow:
 *
 * Enter the number of students: 3
 * Enter the grade for student 1: 55
 * Enter the grade for student 2: 108
 * Invalid grade, try again...
 * Enter the grade for student 2: 56
 * Enter the grade for student 3: 57
 * The average is 56.0
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;

public class GradesAverage{
    public static void main(String[] args){
        Scanner keyboardIn = new Scanner(System.in);
        int numberOfStudent;
        int[] studentGrades;
        int sumOfGrades = 0;

        //Ask for input
        System.out.print("Enter the number of students: ");
        numberOfStudent = keyboardIn.nextInt();

        studentGrades = new int[numberOfStudent];

        //Getting Grades
        for(int i =0; i < studentGrades.length; i++){
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            studentGrades[i] = keyboardIn.nextInt();

            while(studentGrades[i] < 0 || studentGrades[i] > 100){
                System.out.println("Invalid grade, try again...");
                System.out.print("Enter the grade for student " + (i + 1) + ": ");
                studentGrades[i] = keyboardIn.nextInt();
            }
            sumOfGrades += studentGrades[i];
        }

        System.out.print("The average is " + (sumOfGrades / numberOfStudent));
    }
}
