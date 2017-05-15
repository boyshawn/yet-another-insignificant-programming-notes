/*
 * A Class to calculate the sum of Geometric series from 1 to 1000.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class GeometricSeriesSum{
    public static void main(String[] args){
        int numTerms = 1000;
        double sum = 0.0;   //For accumlating sum in double
        int denominator = 1;

        while (denominator <= numTerms){
            //Beware that int/int gives int
            sum = sum + 1 / (double) denominator;

            denominator *= 2;  //next
        }

        //Print the sum
        System.out.println("The sum of the geometric series from 1 to 1000 is " + sum);

    }
}
