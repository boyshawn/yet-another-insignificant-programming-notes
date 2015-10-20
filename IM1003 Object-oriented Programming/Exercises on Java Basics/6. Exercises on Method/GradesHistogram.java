/*
 * Exercise GradesHistogram (Method): Write a program called GradesHistogram, which reads in n grades (of int between 0 and 100, inclusive) from a text file called "grades.in" and displays the histogram horizontally and vertically. The file has the following format:
 *
 * numStduents:int
 * grade1:int grade2:int .... gradeN:int
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

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
	public static void readGrades(String filename) {
		Scanner fileInput;
		int numberOfStudent;

		try {
			fileInput = new Scanner(new File(filename));

			//Getting user input
			numberOfStudent = fileInput.nextInt();
			grades = new int[numberOfStudent];

			for(int i =0; i < numberOfStudent; i++){
				grades[i] = fileInput.nextInt();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (InputMismatchException e){
			// TODO Auto-generated catch block
			System.out.println("There is a non-numeric word in the file.");
		}
	}

	// Based on "grades" array, populate the "bins" array.
	public static void computeHistogram() { 
		//Initialise the array
		for(int bin : bins){
			bin = 0;
		}
		for(int grade : grades){
			if(grade == 100){	//To handle the exception of 100 marks
				bins[9]++;
			}
			else{
				bins[(grade / 10)]++;
			}
		}
	}

	// Print histogram based on the "bins" array.
	public static void printHistogramHorizontal() { 
		for(int i = 0; i < bins.length; i++){
			if(i == 0){	//Add in the extra space for the 0 - 9 
				System.out.print(" " + i * 10 + " -   " + (((i + 1)* 10) - 1) 
						+ ": ");
			}
			else if (i == bins.length){
				System.out.print(i * 10 + " - " + ((i + 1)* 10) + ": "); 
			}
			else{
				System.out.print(i * 10 + " -  " + (((i + 1)* 10) - 1) + ": ");				
			}

			int j = bins[i];
			while(j >= 0){
				System.out.print("*");
				j--;
			}

			System.out.println();
		}
	}

	// Print histogram based on the "bins" array.
	public static void printHistogramVertical() { 
		
	}
}
