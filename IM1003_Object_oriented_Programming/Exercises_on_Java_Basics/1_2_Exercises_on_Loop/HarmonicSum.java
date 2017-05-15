/* Exercise HarmonicSum (Loop): Write a program called HarmonicSum to compute 
 * the sum of a harmonic series, as shown below, where n=50000. The program 
 * shall compute the sum from left-to-right as well as from the right-to-left. 
 * Obtain the difference between these two sums and explain the difference. 
 * Which sum is more accurate?
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class HarmonicSum {   // saved as "HarmonicSum.java"
    public static void main (String[] args) {
        int maxDenominator = 50000;
        double sumL2R = 0.0;    // sum from left-to-right
        double sumR2L = 0.0;    // sum from right-to-left

        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            // Beware that int/int gives int.
            sumL2R += (double) 1 / denominator;
        }
        // for-loop for summing from right-to-left
        for (int denominator = maxDenominator; denominator >= 1; --denominator) {
            // Beware that int/int gives int.
            sumR2L += (double) 1 / denominator;
        }
        // Find the difference and display
        System.out.println("The differences between sum from left-to-right and right-to-left is " + (sumL2R - sumR2L));
    }

    /*
     * The reason why there is a difference between the two number is due to the
     * inaccurate representation of some number in floating point when we 
     * declare the number as double. As quoted in Wikipedia, "The fact that 
     * floating-point numbers cannot precisely represent all real numbers, and
     * that floating-point operations cannot precisely represent true 
     * arithmetic operations...". There is no sum which is defined to be more
     * accurate. Both result are accurate in their own way. 
     */
}
