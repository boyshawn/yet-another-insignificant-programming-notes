/*
 * Exercise TestPalindromicWord: A word that reads the same backward as forward
 * is called a palindrome, e.g., "mom", "dad", "racecar", "madam", and "Radar" 
 * (case-insensitive). Write a program called TestPalindromicWord, that prompts 
 * user for a word and prints ""xxx" is|is not a palindrome".
 *
 * Hints: Read in a word and convert to 
 * lowercase via in.next().toLowercase().
 *
 * A phrase that reads the same backward as forward is also called a 
 * palindrome, e.g., "Madam, I'm Adam", "A man, a plan, a canal - Panama!"
 * (ignoring punctuation and capitalization). Modify your program (called 
 * TestPalindromicPhrase) to test palindromic phrase.
 *
 * Hints: Read in the lowercase phrase via in.nextLine().toLowercase(). 
 * Maintain two indexes, forwardIndex and backwardIndex, used to scan the 
 * phrase forward and backward.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;

public class TestPalindromicWord{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String input;
        boolean isPalindrome = true;

        //Getting user input
        System.out.print("Enter a string: ");
        input = keyboard.next().toLowerCase();

        //Process the input
        /*
         * Instead of using 2 indexes, the program loop through the word till 
         * the mid point, and compare inwards each character of the word from 
         * both ends. Once a mismatch is found, the Palindrome indicator will 
         * be set as 'false', and the program will exit the loop. 
         */
        for(int i = 0;i < (input.length() / 2);i++){
            if(input.charAt(i) != input.charAt(input.length() - i - 1)){
                isPalindrome = false;
                break;
            }
        }

        //Print the result
        System.out.print("\"" + input + "\"" + " is ");
        if(!isPalindrome) System.out.print("not ");
        System.out.print("a palindrome.");
    }
}
