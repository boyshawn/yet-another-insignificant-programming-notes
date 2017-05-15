/*
 * Multiply five numbers and print the result
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class FiveNumberProduct {  //Save as "FiveNumberProduct.java"
    public static void main(String[] args){
        int number1 = 11; //Declare 5 int variables to hold 5 integers
        int number2 = 22;
        int number3 = 33;
        int number4 = 44;
        int number5 = 55;
        int product;      //Declare an int variable called product to hold the product
        product = number1 * number2 * number3 * number4 * number5;
        System.out.print("The sum is ");  //Print a descriptive string
        System.out.println(product);      //Print the value stored in product
    }
}
