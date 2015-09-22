/*
 * Exercise TimeTable (nested-loop): Write a program called TimeTable to produce
 * the multiplication table of 1 to 9 as shown using two nested for-loops:
 * * |  1  2  3  4  5  6  7  8  9
 * -------------------------------
 * 1 |  1  2  3  4  5  6  7  8  9
 * 2 |  2  4  6  8 10 12 14 16 18
 * 3 |  3  6  9 12 15 18 21 24 27
 * 4 |  4  8 12 16 20 24 28 32 36
 * 5 |  5 10 15 20 25 30 35 40 45
 * 6 |  6 12 18 24 30 36 42 48 54
 * 7 |  7 14 21 28 35 42 49 56 63
 * 8 |  8 16 24 32 40 48 56 64 72
 * 9 |  9 18 27 36 45 54 63 72 81
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class TimeTable{
    public static void main(String[] args){
        int multiply = 0;
        int timeTableSize = 0;

        //Print TimeTable of 1 to 9
        timeTableSize = 9;
        System.out.println("Printing the 9x9 time table now");

        //Header
        System.out.print("* |");

        for(int i = 1; i <= timeTableSize; i++){
            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("------------------------------");

        //Main Time Table body
        for(int column = 1; column <= timeTableSize; column++){
            System.out.print(column + " |");
            for(int row = 1; row <= timeTableSize; row++){
                multiply = column * row;
                if(multiply < 10){
                    System.out.print("  " + multiply);
                }
                else{
                    System.out.print(" " + multiply);
                }
            }
            System.out.println();
        }

        //Print TimeTable of 1 to 12
        timeTableSize = 12;
        System.out.println();
        System.out.println("Printing the 12x12 time table now");

        //Header
        System.out.print("*  |");

        for(int i = 1; i <= timeTableSize; i++){
            if(i < 10){
                System.out.print("   " + i);
            }
            else{
                System.out.print("  " + i);
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

        //Main Time Table body
        for(int column = 1; column <= timeTableSize; column++){
            if(column < 10){
                System.out.print(column + "  |");
            }
            else{
                System.out.print(column + " |");
            }
            for(int row = 1; row <= timeTableSize; row++){
                multiply = column * row;
                if(multiply < 10){
                    System.out.print("   " + multiply);
                }
                else if(multiply < 100){
                    System.out.print("  " + multiply);
                }
                else{
                    System.out.print(" " + multiply);
                }
            }
            System.out.println();
        }
    }

}
