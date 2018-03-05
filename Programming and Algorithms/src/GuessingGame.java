 /**
 * Program allows a user to play a guessing game
 * Computer logically guesses numbers within a user's range until it finds their number (binary search)
 * @author Chris Kontomaris
 * @version 11/10/17
 */

import java.util.Scanner;

public class GuessingGame {
    // research+ eclipse guide: static vars in the class belong to the whole class
    // so I can use a method to change the range of numbers
    static int low;
    static int high;
    /**
     * Gives user instructions and refines guesses by checking with user 
     * Prints winning statement
     * @param passes command line arguments array into the program
     * @return prints instructions and win statements
     */
    public static void main(String[] args) {
        System.out.println("Think of a range of numbers");
        Scanner range = new Scanner(System.in);
        System.out.println("Type in the lowest number in your range");
        low = range.nextInt();
        System.out.println("Type in the highest number in your range");
        high = range.nextInt();
        System.out.println("Alright, now think of a number in your range and I'll (eventually) get it.");
        int round = 0;
        int mid=0;
        while (true) {
            // keep track of how many attempts it took
            round++;
            // find middle number
            int oldmid = mid;
            mid= findMid(low, high);
            //check if a mid had been already been user checked
            //was a problem because the division gets truncated in findMid when you are at the number before the high point
            //so it can never get to the final number
            if (oldmid==mid){
                mid++;
            }
            // check if that's it
            if (doneCheck(mid)) {
                break;
            }
            // new range to try again
            newRange(mid);
        }
        System.out.println("That's all folks!");
        //i'm a tryhard for conditionals
        if (round==1){
            System.out.println("And it only took " + round + " try!");
        } else {
            System.out.println("And it only took " + round + " tries!");
        }
    }
    /**
     * Finds the midpoint of a range of numbers
     * @param low    the lower point of the range
     * @param high   the high point of the range
     * @return       an integer midpoint of the user's range
     */
    public static int findMid(int low, int high) {
        // determine halfway number
        int mid = low + ((high - low) / 2);
        return mid;
    }

    /**
     * Checks if the midpoint of the range is the user's guess
     * Reprompts the user if they input non-expected answers
     * @param mid  the mid point of the range, used for binary search
     * @return     win condition, true for game end or false for continue playing
     */
    public static boolean doneCheck(int mid) {
        while (true) {
            System.out.println("Is " + mid + " your number? (yes/no)");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.equals("yes") || input.equals("Yes")) {
                return true;
            } else if (input.equals("no") || input.equals("No")) {
                if (high-low==1) {
                    System.out.println("This has to be your number or you have been BS'ing me!");
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Sorry, I didn't understand what you typed, try again");
            }
        }
    }
    
    /**
     * Changes the endpoints of the range according to whether the midpoint is
     * above or below the user's number.
     * @param mid   the midpoint of the range
     * @return      sets the endpoints of the range based on user feedback
     */
    public static void newRange(int mid) {
        System.out.println(
            "If " + mid + " is lower than your number, enter 'lower'. If " + mid + " is higher, enter 'higher'.");
        Scanner scan = new Scanner(System.in);
        while(true){
            String check = scan.nextLine();
            if (check.equals("lower")) {
                low = mid;
                return;
            } else if (check.equals("higher")) {
                high = mid;
                return;
            } else {
                System.out.println("Sorry, I can't understand that, try again");
            }
        }
    }
}