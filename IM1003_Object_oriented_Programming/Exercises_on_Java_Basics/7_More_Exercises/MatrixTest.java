public class MatrixTest {

	public static void main(String args[]){
		testPrintOneByOneIntMatrix();
		testPrintTwoByTwoIntMatrix();
		testPrintOneByTwoIntMatrix();
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
		//TODO
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

		if (Matrix.haveSameDimension(threeByThreeMatrix , threeByTwoMatrix)) {
			System.out.println("testDifferentSizeThreeByThreeIntMatrix has" +
				"error.");
		}
	}

	/*
	 * haveSameDimension(double[][] m1, double[][] m2)
	 */
	public static void testSameOneByOneDoubleMatrix() {
		// TODO
	}

	public static void testSameOneByThreeDoubleMatrix() {
		//TODO
	}

	public static void testSameFourByOneDoubleMatrix() {
		//TODO
	}

	public static void testSameThreeByThreeDoubleMatrix() {
		//TODO
	}

	public static void testDifferentSizeOneByOneDoubleMatrix() {
		//TODO
	}

	public static void testDifferentSizeFiveByOneDoubleMatrix() {
		//TODO
	}

	/*
	 * add(int[][] m1, int[][] m2)
	 */
	public static void testAddPositiveIntMatrix() {
		//TODO
	}

	public static void testAddZeroIntMatrix() {
		//TODO
	}

	public static void testAddNegativeIntMatrix() {
		//TODO
	}

	/*
	 * add(double[][] m1, double[][] m2)
	 */
	public static void testAddPositiveDoubleMatrix() {
		//TODO
		double[][] positiveMatrix1 = {{1},{3}};
		double[][] positiveMatrix2 = {{2},{4}};


	}

	public static void testAddZeroDoubleMatrix() {
		double[][] zeroMatrix1 = {{0}};
		double[][] zeroMatrix2 = {{0}};

		Matrix.printMatrix(Matrix.add(zeroMatrix1,zeroMatrix2));
	}

	public static void testAddNegativeDoubleMatrix() {
		double[][] positiveMatrix = {{1,3}};
		double[][] negativeMatrix = {{-2,-4}};

		Matrix.printMatrix(Matrix.add(positiveMatrix,negativeMatrix));
	}

}
