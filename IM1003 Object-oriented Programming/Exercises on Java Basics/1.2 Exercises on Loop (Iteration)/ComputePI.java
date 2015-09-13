/*
 * Exercise ComputePI (Loop & Condition): Write a program called ComputePI to 
 * compute the value of π, using the following series expansion. You have to 
 * decide on the termination criterion used in the computation (such as the 
 * number of terms used or the magnitude of an additional term). Is this series
 * suitable for computing π?
 */

public class ComputePI{
    public static void main(String[] args){
        double sum = 0;
        int maxDenom = 10000000;
        for (int denom = 1; denom <= maxDenom; denom = denom + 2) {
            if (denom % 4 == 1) {
                sum += (double) 1 / denom;
            } else if (denom % 4 == 3) {
                sum -= (double) 1 / denom; 
            } else {
                System.out.println("The computer has gone crazy?!");
            }
        }
        
        sum *= 4;

        System.out.println("Self-calculated PI is " + sum);
        System.out.println("Math.PI is " + Math.PI);
        System.out.println("The difference between Math.PI and self-calculated PI is " + (Math.PI - sum));
    }

    /*
     * I will say that yes, this series is sufficient to calculate PI, since 
     * that the difference between the series result and the system stored PI 
     * is minor. They can be used in normal application.
     */
}
