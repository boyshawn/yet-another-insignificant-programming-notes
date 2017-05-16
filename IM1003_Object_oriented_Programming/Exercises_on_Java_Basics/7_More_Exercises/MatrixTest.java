public class MatrixTest {

	public static void main(String args[]){
		testPrintOneByOneIntMatrix();
		testPrintTwoByTwoIntMatrix();
		testPrintOneByTwoIntMatrix();
		testPrintTwoByOneIntMatrix();
		testPrintOneByOneDoubleMatrix();
		testPrintTwoByTwoDoubleMatrix();
		testPrintOneByTwoDoubleMatrix();
		testPrintTwoByOneDoubleMatrix();
		testSameOneByOneIntMatrix();
		testSameOneByThreeIntMatrix();
		testSameFourByOneIntMatrix();
		testSameThreeByThreeIntMatrix();
		testDifferentOneByOneIntMatrix();
		testDifferentSizeFiveByOneIntMatrix();
		testDifferentSizeThreeByThreeIntMatrix();
		testSameOneByOneDoubleMatrix();
		testSameOneByThreeDoubleMatrix();
		testSameFourByOneDoubleMatrix();
		testSameThreeByThreeDoubleMatrix();
		testDifferentSizeOneByOneDoubleMatrix();
		testDifferentSizeFiveByOneDoubleMatrix();
		testAddPositiveIntMatrix();
		testAddZeroIntMatrix();
		testAddNegativeIntMatrix();
		testAddPositiveDoubleMatrix();
		testAddZeroDoubleMatrix();
		testAddNegativeDoubleMatrix();
	}

	/*
	 * printMatrix(int[][] m)
	 */
	public static void testPrintOneByOneIntMatrix() {
		int[][] oneByOneMatrix = {{1}};
		Matrix.printMatrix(oneByOneMatrix);
	}

	public static void testPrintTwoByTwoIntMatrix() {
		int[][] twoByTwoMatrix = {{1,2}, {3,4}};
		Matrix.printMatrix(twoByTwoMatrix);
	}

	public static void testPrintOneByTwoIntMatrix() {
		int[][] oneByTwoMatrix = {{1,2}};
		Matrix.printMatrix(oneByTwoMatrix);
	}

	public static void testPrintTwoByOneIntMatrix() {
		int[][] twoByOneMatrix = {{3}, {4}};
		Matrix.printMatrix(twoByOneMatrix);
	}

	/*
	 * printMatrix(double[][] m)
	 */
	public static void testPrintOneByOneDoubleMatrix() {
		double[][] oneByOneMatrix = {{1}};
		Matrix.printMatrix(oneByOneMatrix);
	}

	public static void testPrintTwoByTwoDoubleMatrix() {
		int[][] twoByTwoMatrix = {{1,2}, {3,4}};
		Matrix.printMatrix(twoByTwoMatrix);
	}

	public static void testPrintOneByTwoDoubleMatrix() {
		int[][] oneByTwoMatrix = {{1,2}};
		Matrix.printMatrix(oneByTwoMatrix);
	}

	public static void testPrintTwoByOneDoubleMatrix() {
		int[][] twoByOneMatrix = {{3}, {4}};
		Matrix.printMatrix(twoByOneMatrix);
	}

	/*
	 * haveSameDimension(int[][] m1, int[][] m2)
	 */
	public static void testSameOneByOneIntMatrix() {
		int[][] oneByOneMatrix = {{3}};
		if (!Matrix.haveSameDimension(oneByOneMatrix, oneByOneMatrix)) {
			System.out.println("testSameOneByOneIntMatrix has error.");
		}
	}

	public static void testSameOneByThreeIntMatrix() {
		int[][] oneByThreeMatrix1 = {{1,2,3}};
		int[][] oneByThreeMatrix2 = {{3,2,1}};

		if (!Matrix.haveSameDimension(oneByThreeMatrix1, oneByThreeMatrix2)) {
			System.out.println("testSameOneByThreeIntMatrix has error.");
		}
	}

	public static void testSameFourByOneIntMatrix() {
		int[][] fourByOneMatrix = {{5},{6},{7},{8}};

		if (!Matrix.haveSameDimension(fourByOneMatrix, fourByOneMatrix)) {
			System.out.println("testSameFourByOneIntMatrix has error.");
		}
	}

	public static void testSameThreeByThreeIntMatrix() {
		int[][] threeByThreeMatrix = {{1,4,7}, {2,5,8}, {3,6,9}};

		if (!Matrix.haveSameDimension(threeByThreeMatrix, threeByThreeMatrix)) {
			System.out.println("testSameThreeByThreeIntMatrix has error.");
		}
	}

	public static void testDifferentOneByOneIntMatrix() {
		int[][] oneByOneMatrix = {{1}};
		int[][] oneByTwoMatrix = {{2,1}};

		if (Matrix.haveSameDimension(oneByOneMatrix, oneByTwoMatrix)) {
			System.out.println("testDifferentOneByOneIntMatrix has error.");
		}
	}

	public static void testDifferentSizeFiveByOneIntMatrix() {
		int[][] fiveByOneMatrix = {{1,3,5,7,9}};
		int[][] oneByFiveMatrix = {{1},{3},{5},{7},{9}};

		if (Matrix.haveSameDimension(fiveByOneMatrix, oneByFiveMatrix)) {
			System.out.println("testDifferentSizeFiveByOneIntMatrix has " +
				"error.");
		}
	}

	public static void testDifferentSizeThreeByThreeIntMatrix() {
		int[][] threeByThreeMatrix = {{1,4,7}, {2,5,8}, {3,6,9}};
		int[][] threeByTwoMatrix = {{3,6,9}, {1,4,7}};

		if (Matrix.haveSameDimension(threeByThreeMatrix, threeByTwoMatrix)) {
			System.out.println("testDifferentSizeThreeByThreeIntMatrix has" +
				"error.");
		}
	}

	/*
	 * haveSameDimension(double[][] m1, double[][] m2)
	 */
	public static void testSameOneByOneDoubleMatrix() {
		double[][] oneByOneMatrix1 = {{1.0}};
		double[][] oneByOneMatrix2 = {{3.4}};

		if (!Matrix.haveSameDimension(oneByOneMatrix1, oneByOneMatrix2)) {
			System.out.println("testSameOneByOneDoubleMatrix has error.");
		}
	}

	public static void testSameOneByThreeDoubleMatrix() {
		double[][] oneByThreeMatrix1 = {{1.0}, {2.7}, {3.9}};
		double[][] oneByThreeMatrix2 = {{3.4}, {4.7}, {5.5}};

		if (!Matrix.haveSameDimension(oneByThreeMatrix1, oneByThreeMatrix2)) {
			System.out.println("testSameOneByThreeDoubleMatrix has error.");
		}
	}

	public static void testSameFourByOneDoubleMatrix() {
		double[][] fourByOneMatrix1 = {{1.0, 2.0, 3.1, 4.2}};
		double[][] fourByOneMatrix2 = {{8.7, 2.1111, 3.4, 1.1}};

		if (!Matrix.haveSameDimension(fourByOneMatrix1, fourByOneMatrix2)) {
			System.out.println("testSameFourByOneDoubleMatrix has error.");
		}
	}

	public static void testSameThreeByThreeDoubleMatrix() {
		double[][] threeByThreeMatrix1 = {{1.9, 2.8, 3.7}, {4.5, 5.6, 6.7}, {7.8, 8.9, 9.0}};
		double[][] threeByThreeMatrix2 = {{1.9, 2.8, 3.7}, {4.5, 5.6, 6.7}, {7.8, 8.9, 9.0}};

		if (!Matrix.haveSameDimension(threeByThreeMatrix1, threeByThreeMatrix2)) {
			System.out.println("testSameThreeByThreeDoubleMatrix has error.");
		}
	}

	public static void testDifferentSizeOneByOneDoubleMatrix() {
		double[][] oneByOneMatrix = {{1.5}};
		double[][] zeroMatrix = {{}};

		if (Matrix.haveSameDimension(oneByOneMatrix, zeroMatrix)) {
			System.out.println("testDifferentSizeOneByOneDoubleMatrix has " +
				"error.");
		}
	}

	public static void testDifferentSizeFiveByOneDoubleMatrix() {
		double[][] fiveByOneMatrix = {{1.1}, {2.2}, {3.3}, {4.4}, {5.5}};
		double[][] oneByOneMatrix = {{7.3}};

		if (Matrix.haveSameDimension(fiveByOneMatrix, oneByOneMatrix)) {
			System.out.println("testDifferentSizeFiveByOneDoubleMatrix has " +
				"error.");
		}
	}

	/*
	 * add(int[][] m1, int[][] m2)
	 */
	public static void testAddPositiveIntMatrix() {
		int[][] positiveMatrix1 = {{1}};
		int[][] positiveMatrix2 = {{67322},{123123}};

		Matrix.printMatrix(Matrix.add(positiveMatrix1, positiveMatrix2));
	}

	public static void testAddZeroIntMatrix() {
		int[][] zeroMatrix1 = {{}};
		int[][] zeroMatrix2 = {{}};

		Matrix.printMatrix(Matrix.add(zeroMatrix1, zeroMatrix2));
	}

	public static void testAddNegativeIntMatrix() {
		int[][] positiveMatrix = {{1}, {1}};
		int[][] negativeMatrix = {{4}, {27}};

		Matrix.printMatrix(Matrix.add(positiveMatrix, negativeMatrix));
	}

	/*
	 * add(double[][] m1, double[][] m2)
	 */
	public static void testAddPositiveDoubleMatrix() {
		double[][] positiveMatrix1 = {{1.75},{3.11}};
		double[][] positiveMatrix2 = {{2.79},{4.32}};

		Matrix.printMatrix(Matrix.add(positiveMatrix1, positiveMatrix2));
	}

	public static void testAddZeroDoubleMatrix() {
		double[][] zeroMatrix1 = {{0}};
		double[][] zeroMatrix2 = {{0}};

		Matrix.printMatrix(Matrix.add(zeroMatrix1,zeroMatrix2));
	}

	public static void testAddNegativeDoubleMatrix() {
		double[][] positiveMatrix = {{1.8,39.9}};
		double[][] negativeMatrix = {{-2.67,-4.01}};

		Matrix.printMatrix(Matrix.add(positiveMatrix,negativeMatrix));
	}

}
