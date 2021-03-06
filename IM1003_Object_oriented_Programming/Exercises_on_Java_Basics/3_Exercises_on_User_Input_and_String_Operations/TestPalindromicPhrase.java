/*
 * Exercise TestPalindromicWord: A word that reads the same backward as forward
 * is called a palindrome, e.g., "mom", "dad", "racecar", "madam", and "Radar"
 * (case-insensitive). Write a program called TestPalindromicWord, that prompts
 * user for a word and prints ""xxx" is|is not a palindrome".
 *
 * Hints: Read in a word and convert to lowercase via in.next().toLowercase().
 *
 * A phrase that reads the same backward as forward is also called a 
 * palindrome, e.g., "Madam, I'm Adam", "A man, a plan, a canal - Panama!" 
 * (ignoring punctuation and capitalization). Modify your program (called 
 * TestPalindromicPhrase) to test palindromic phrase.
 *
 * Hints: Read in the lowercase phrase via in.nextLine().toLowercase(). Maintain
 * two indexes, forwardIndex and backwardIndex, used to scan the phrase forward 
 * and backward.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;

public class TestPalindromicPhrase{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String input;
        String trimInput = new String();
        boolean isPalindrome = true;

        //Getting user input
        System.out.print("Enter a string: ");
        input = keyboard.nextLine();

        //Process the input
/*
 * This program use a different approach from the Word Palindrome program. The 
 * program do the following:
 * 1. Loop through the input and remove all the non-alphanumeric characters.
 * 2. Remove all spaces.
 * 3. Making use of StringBuilder class, create a new String and then reverse it.
 * 4. Compare the string with the string in original order, ignoring case. 
 */
        for(int i =0; i < input.length();i++){
            if(Character.isLetterOrDigit(input.charAt(i))){
                trimInput = trimInput.concat(
                        Character.toString(input.charAt(i))); 
            }
        }

        trimInput = trimInput.replace(' ','\0');
        
        isPalindrome = trimInput.equalsIgnoreCase(new 
                StringBuilder(trimInput).reverse().toString());

        //Print the result
        System.out.print("\"" + input + "\"" + " is ");
        if(!isPalindrome) System.out.print("not ");
        System.out.print("a palindrome.");
    }
}
