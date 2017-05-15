/* The method accepts an int array, and reverses its orders. For example, if     
 * the input array is {12, 56, 34, 79, 26}, the reversal is {26, 79, 34, 56,
 * 12}. You MUST NOT use another array in your method (but you need a temporary 
 * variable to do the swap). Also write a test class called ReverseArrayTest to
 * test this method. Take note that the array passed into the method can be
 * modified by the method (this is called "pass by reference"). On the other
 * hand, primitives passed into a method cannot be modified. This is because a
 * clone is created and passed into the method instead of the original copy
 * (this is called "pass by value").
 */

public class ReverseArrayTest{
    public static void main(String[] args){
        int[] arrayTest = {12, 56, 34, 79, 26};
        
        //Display the original
        System.out.print("The original Array is ");
        displayArray(arrayTest);
        System.out.println();

        reverseArray(arrayTest);
        System.out.print("The reverse Array is ");
        displayArray(arrayTest);
        System.out.println();
    }

    public static void reverseArray(int[] intArray){
        for(int i = 0; i < intArray.length / 2; i++){
            int temp;

            temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }
    }

    public static void displayArray(int[] intArray){
        System.out.print(intArray[0]);

        for(int i = 1; i < intArray.length; i++){
            System.out.print(", " + intArray[i]);
        }
    }
}
