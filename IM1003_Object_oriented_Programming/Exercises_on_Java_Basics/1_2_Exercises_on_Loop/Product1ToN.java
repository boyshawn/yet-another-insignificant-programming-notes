/*
 * Exercise Product1ToN (Loop): Write a program called Product1ToN to compute 
 * the product of integers 1 to 10 (i.e., 1×2×3×...×10). Try computing the 
 * product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. Write down the product 
 * obtained and explain the results.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class Product1ToN{
    public static void main(String[] args){
        int product = 1;
        
        // Calculate product from 1 to 10
        for(int i = 1; i <= 10; i++){
            product *= i;
        }

        System.out.println("The product from 1 to 10 is " + product);

        // Calculate product from 1 to 11
        product = 1;
        for(int i = 1; i <= 11; i++){
            product *= i;
        }

        System.out.println("The product from 1 to 11 is " + product);
        
        // Calculate product from 1 to 12
        product = 1;
        for(int i = 1; i <= 12; i++){
            product *= i;
        }

        System.out.println("The product from 1 to 12 is " + product);
        
        // Calculate product from 1 to 13
        product = 1;
        for(int i = 1; i <= 13; i++){
            product *= i;
        }

        System.out.println("The product from 1 to 13 is " + product);
        
        // Calculate product from 1 to 14
        product = 1;
        for(int i = 1; i <= 14; i++){
            product *= i;
        }

        System.out.println("The product from 1 to 14 is " + product);
    }
}
