/*
 * Exercise CheckPassFail (if-else): Write a program called CheckPassFail which
 * prints "PASS" if the int variable "mark" is more than or equal to 50; or
 * prints "FAIL" otherwise.
 * @author  Francis Pang
 * @since   %I% %G%
 * @version 1.0
 */
public class CheckPassFail { // saved as "CheckPassFail.java"
    public static void main(String[] args) {
        final int PASSING_MARK = 50;
        final String PASS_STR = "PASS";
        final String FAIL_STR = "FAIL";

        int mark = 49;         // set the value of mark here!
        System.out.println("The mark is " + mark);

        if (mark < PASSING_MARK ) {
            System.out.println(PASS_STR);
        } else {
            System.out.println(FAIL_STR);
        }
    }
}
