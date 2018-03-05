/** This program allows 2 players to play one full round of the game "Tic Tac Toe" before the program terminates.
 * A two-dimensional array of Strings is used to hold the board.
 * The program uses methods to facilitate and check user input, print the board and check for wins.
 * @author Chris Kontomaris
 * @version 9/30/2017
 */

import java.util.Scanner;

public class TicTacToe {
    /** 
     * Declares and initializes board, gives intial instructions to players.
     * Loops through user input method, board print method and win check method.
     * Once a win condition is met, the loop breaks and the winner is congratulated.
     * @param passes command line arguments array into the program
     * @return prints instructions, board and win statements
     */
        public static void main(String[] args) {
        System.out.println("Hey kid, come play some tic tac toe.");
        // NOTE: the length of the array is different than its index
        //declare a 3x3 array for the board and populate it with blank strings
        String[][] board = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = " ";
            }
        }

        System.out.println("OK, so there are two players in Tic Tac Toe. They will be called player 1 and player 2.");
        System.out.println("Each player will choose a row and column to insert their letter on their turn.");
        System.out.println("Player one's letter is X and player 2's letter is O.");
        System.out.println("If a player gets 3 of their letter in a row, column or diagonal, then they win!");
        System.out.println();
        //turnNumber is used to keep track of the number of turns
        int turnNumber = 1;
        int conditionCheck;
        printBoard(board);
        //a loop that breaks after one of the game ending conditions from conditionCheck is met
        //asks for input, prints and then checks for win
        while (true) {
            inputCheck(board, turnNumber);
            printBoard(board);
            conditionCheck = winCheck(board, turnNumber);
            if (conditionCheck == 4) {
                System.out.println("There is a tie! GG");
                break;
            } else if (conditionCheck == 1) {
                System.out.println("Good job player 1, you won! Is that a pun?");
                break;
            } else if (conditionCheck == 2) {
                System.out.println("Good job player 2, you won!");
                break;
            } else if (conditionCheck == 0) {

            }
            turnNumber++;
        }

    }
    /**
     * This method checks whether the game has reached the maximum number of turns (a tie).
     * Also checks whether there are 3 of the same letter in a row, column or diagonally.
     * If there is a game ending condition, the method checks for the player whose letters created it.
     * It returns a number based on the game ending condition.
     * 
     * @param board         the game board array
     * @param turnNumber    the total number of turns that have occured
     * @return  an integer from 1-4 which represents a designated game ending condition 
     */
    public static int winCheck(String[][] board, int turnNumber) {
        
        //checks each row from left to right before moving to the row below
        //increments areEqual to count the number of values in the row which equal the reference
        for (int r = 0; r < 3; r++) {
            String referenceLetter = board[r][0];
            int areEqual = 0;
            for (int c = 0; c < 3; c++) {
                if (referenceLetter.equals(board[r][c])) {
                    areEqual = areEqual + 1;
                }
            }
            if (areEqual == 3) {
                //if a row is filled with the same letter, it checks for the letter and returns whose it was
                if (referenceLetter.equals("X")) {
                    return 1;
                } else if (referenceLetter.equals("O")) {
                    return 2;
                }
            }
        }
        //checks a column from top to bottom before moving to the column to the right
        //same structure as row checker
        for (int c = 0; c < 3; c++) {
            String referenceLetter = board[0][c];
            int areEqual = 0;
            for (int r = 0; r < 3; r++) {
                if (referenceLetter.equals(board[r][c])) {
                    areEqual = areEqual + 1;
                }
                if (areEqual == 3) {
                    if (referenceLetter.equals("X")) {
                        return 1;
                    } else if (referenceLetter.equals("O")) {
                        return 2;
                    }
                }
            }
        }
        //diagonals check, written manually not a loop 
        String startLetter = board[0][0];
        if ((startLetter.equals(board[1][1])) && (startLetter.equals(board[2][2]))) {
            if (startLetter.equals("X")) {
                return 1;
            }
            if (startLetter.equals("O")) {
                return 2;
            }
        }
        startLetter = board[2][0];
        if ((startLetter.equals(board[1][1])) && (startLetter.equals(board[0][2]))) {
            if (startLetter.equals("X")) {
                return 1;
            }
            if (startLetter.equals("O")) {
                return 2;
            }
        }
        //put the tie counter last because it is possible to win on the last turn
        if (turnNumber == 9) {
            return 4;
        }
        //if none of the previous conditions are met, there has not been a game ending condition
        return 0;
    }
    
    /**
     * This method takes a 2D array and systematically prints the value in each row and column.
     * It creates dividers between each letter from left to right
     * and dividers above each row and below the last row.
     * 
     * @param board the array to print
     * @return prints gameboard to console
     */    
    public static void printBoard(String[][] board) {
        //create the top and bottom "walls"

        //iterate through each row and column of the array systematically, and print each value with a | divider afterwards and a horizontal "ceiling" above each row
        for (int row = 0; row < 3; row++) {
            System.out.println(" ");
            System.out.println("-----------");
            for (int column = 0; column < 3; column++) {
                if (column < 2) {
                    System.out.print(board[row][column] + " | ");
                } else {
                    System.out.print(board[row][column]);
                }
            }
        }
        System.out.println("");
        System.out.print("-----------");
        System.out.println(" ");
        //close the printed board with a bottom "floor"
    }

    /**
     * Creates instructions and Scanner for user input into game board array. 
     * Determines which player is having a turn and asks them for a row and column on the board to input their letter.
     * Verifies that the inputted location is a true location on the array.
     * confirms that the location that the user specifies is available.
     * Allows user to revise their selected location unlimited times.
     * @param board The 2D array of String which is the game board
     * @param turnnumber the number of turns completed in the game so far
     * @return inputs appropriate letter into position designated by player
     */
    public static void inputCheck(String[][] board, int turnNumber) {
        Scanner input = new Scanner(System.in);
        int column;
        int row;
        //checks which players turn it is
        if (turnNumber % 2 == 1) {
            while (true) {
                System.out.println("Player 1, enter a row number between 1 and 3");
                row = input.nextInt();
                while (row > 3 || row < 1) {
                    //continually asks for a new row number until it is between 1 and 3
                    System.out.println("That's not between 1 and 3, please re enter the row number");
                    row = input.nextInt();
                }
                System.out.println("Player 1, enter a column number between 1 and 3");
                column = input.nextInt();
                while (column > 3 || column < 1) {
                    System.out.println("That's not between 1 and 3, please re enter the column number");
                    column = input.nextInt();
                }
                if (((board[row - 1][column - 1]).equals("X")) || ((board[row - 1][column - 1]).equals("O"))) {
                    System.out.println("Sorry mate, that spot is TAKEN. Try again!");
                } else {
                    //breaks the loop when the location is not taken and puts the players letter in the location
                    board[row - 1][column - 1] = "X";
                    break;
                }
            }
        }
        //for player 2, same as for player 1, could have used a method but didn't
        if (turnNumber % 2 == 0) {
            while (true) {
                System.out.println("Player 2, enter a row number between 1 and 3");
                row = input.nextInt();
                while (row > 3 || row < 1) {
                    System.out.println("That's not between 1 and 3, please re enter the row number");
                    row = input.nextInt();
                }
                System.out.println("Player 2, enter a column number between 1 and 3");
                column = input.nextInt();
                while (column > 3 || column < 1) {
                    System.out.println("That's not between 1 and 3, please re enter the column number");
                    column = input.nextInt();
                }
                if (((board[row - 1][column - 1]).equals("X")) || ((board[row - 1][column - 1]).equals("O"))) {
                    System.out.println("Sorry mate, that spot is TAKEN. Try again!");
                } else {
                    board[row - 1][column - 1] = "O";
                    break;
                }
            }
        }
    }
}

