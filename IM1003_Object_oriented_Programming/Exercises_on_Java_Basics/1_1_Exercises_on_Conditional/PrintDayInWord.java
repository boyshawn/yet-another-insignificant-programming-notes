/*
 * a program called PrintDayInWord, which prints “Sunday”, “Monday”, 
 * ... “Saturday” if the int variable "day" is 0, 1, ..., 6, respectively.
 * Otherwise, it shall print “Not a valid day”.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */

public class PrintDayInWord {   // saved as "PrintDayInWord.java"
   public static void main(String[] args) {
      int number = 5;
 
      // Using nested-if
      if (number == 1) {
         System.out.println("Monday");
      } else if (number == 2){
         System.out.println("Tuesday");
      } else if (number == 3){
         System.out.println("Wednesday");
      } else if (number == 4){
         System.out.println("Thursday");
      } else if (number == 5){
         System.out.println("Friday");
      } else if (number == 6){
         System.out.println("Saturday");
      } else if (number == 7){
         System.out.println("Sunday");
      } else {
         System.out.println("Not a valid day");
      }
 
      // Using switch-case
      switch(number) {
         case 1: System.out.println("Monday"); break;
         case 2: System.out.println("Tuesday"); break;
         case 3: System.out.println("Wednesday"); break;
         case 4: System.out.println("Thursday"); break;
         case 5: System.out.println("Friday"); break;
         case 6: System.out.println("Saturday"); break;
         case 7: System.out.println("Sunday"); break;
         default: System.out.println("Not a valid day"); 
      }
   }
}
