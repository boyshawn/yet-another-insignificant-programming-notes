/*
 * Exercise PhoneKeyPad: On your phone keypad, the alphabets are mapped to 
 * digits as follows: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), 
 * WXYZ(9).
 *
 * Write a program called PhoneKeyPad, which prompts user for a String (case 
 * insensitive), and converts to a sequence of Keypad digits. Use a nested-if 
 * (or switch-case) in this exercise. Modify your program to use an array for 
 * table look-up later.
 *
 * Hints: You can use in.next().toLowerCase() to read a string and convert it 
 * to lowercase to reduce your cases.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

import java.util.Scanner;

public class PhoneKeyPad{
    public static void main(String[] args){
        Scanner keyboardInput = new Scanner(System.in);
        String keypadSequence;
        String digitSequence = new String();

        //Asking for input
        System.out.print("Enter a string: ");
        keypadSequence = keyboardInput.next().toLowerCase();

        //Using Switch Case to determine output
        for(int i = 0;i < keypadSequence.length(); i++){
            switch(keypadSequence.charAt(i)){
                case 'a': case 'b': case 'c':
                    digitSequence = digitSequence.concat("2");
                    break;
                case 'd': case 'e': case 'f':
                    digitSequence = digitSequence.concat("3");
                    break;
                case 'g': case 'h': case 'i':
                    digitSequence = digitSequence.concat("4");
                    break;
                case 'j': case 'k': case 'l':
                    digitSequence = digitSequence.concat("5");
                    break;
                case 'm': case 'n': case 'o':
                    digitSequence = digitSequence.concat("6");
                    break;
                case 'p': case 'q': case 'r': case 's':
                    digitSequence = digitSequence.concat("7");
                    break;
                case 't': case 'u': case 'v':
                    digitSequence = digitSequence.concat("8");
                    break;
                case 'w': case 'x': case 'y': case 'z':
                    digitSequence = digitSequence.concat("9");
                    break;
            }
        }

        //Printing result
        System.out.print("[Switch Case] The phone number you have key in ");
        System.out.println("is " + digitSequence);

        //Using Array lookup table to determine output
        digitSequence = new String();
        char[][]phonePad = { 
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'},
            {'2', '2', '2', '3', '3', '3', '4', '4', '4', '5', '5', '5', '6', '6', '6', '7', '7', '7', '7', '8', '8', '8', '9', '9', '9', '9'}
        };

        for(int j = 0; j < keypadSequence.length();j++){
            for(int i = 0;i < phonePad[0].length; i++){
                if(keypadSequence.charAt(j) == phonePad[0][i]){
                    digitSequence = digitSequence.concat(Character.toString(phonePad[1][i])); //Type cast Character to string
                }
            }
        }
        //Printing result
        System.out.print("[Switch Case] The phone number you have key in ");
        System.out.println("is " + digitSequence);
    }
}
