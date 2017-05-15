/*
 * Exercise Matrix: Similar to Math class, write a Matrix library that supports matrix operations (such as addition, subtraction, multiplication) via 2D arrays. The operations shall support both doubles and ints. Also write a test class to exercise all the operations programmed.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class Matrix {
	public static void printMatrix(int[][] m) {
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printMatrix(double[][] m) {
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++){
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimension(int[][] m1, int[][] m2) {
		/*
		 * To check for same dimension, need to check for same length at every
		 * row
		 */

		//Checking for same number column for every rows
		for(int i = 0; i < m1.length; i++){
			if(m1[i].length != m2[i].length){
				return false;
			}
		}

		//Checking for number of rows
		if(m1.length == m2.length){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean haveSameDimension(double[][] m1, double[][] m2) {
		//Checking for same number column for every rows
		for(int i = 0; i < m1.length; i++){
			if(m1[i].length != m2[i].length){
				return false;
			}
		}

		//Checking for number of rows
		if(m1.length == m2.length){
			return true;
		}
		else{
			return false;
		}
	}

	public static int[][] add(int[][] m1, int[][] m2) {
		/*
		 * Use another 2D array to store the resulting matrix so that both
		 * original matrixes are not altered.
		 */
		if (!haveSameDimension(m1, m2)) {
			return new int[][] {{0}};
		}

		int[][] result = m1;

		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}

	public static double[][] add(double[][] m1, double[][] m2) {
		if (!haveSameDimension(m1, m2)) {
			return new double[][] {{0}};
		}

		double[][] result = m1;

		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;
	}
}
