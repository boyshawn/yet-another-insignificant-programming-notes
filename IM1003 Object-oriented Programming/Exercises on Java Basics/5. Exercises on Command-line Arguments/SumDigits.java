/*
 * Exercise SumDigits (Command-line arguments): Write a program called SumDigits
 * to sum up the individual digits of a positive integer, given in the command 
 * line. The output shall look like:
 *
 * > java SumDigits 12345
 * The sum of digits = 1 + 2 + 3 + 4 + 5 = 15
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class SumDigits{
    public static void main(String[] args){
        int sum = 0;

        System.out.print("The sum of digits = ");

        for(int i = 0;i < args[0].length() - 1;i++){
            System.out.print( args[0].charAt(i) + " + ");
            sum += (int) (args[0].charAt(i) - '0');
        }
        System.out.print( args[0].charAt(args[0].length() - 1) + " ");
        sum += (int) (args[0].charAt(args[0].length() - 1) - '0');

        System.out.print("= " + sum);
    }
}
