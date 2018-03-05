import java.util.Scanner;

public class ConnectFour {
	public static void main(String[] args) {
		System.out.println("Welcome to a game of Connect 4, the most fun 2 player game!");
		System.out.println("Player one's checker will be an X, player two's will be a O");
		System.out.println(
				"Everytime it is your turn, just input a column number and your checker will be put in the lowest spot in that column");

		// declaring and initializing the board
		String[][] board = new String[6][7];
		// not <= board.length because .length gives the total number of elements
		// row will be 1 less than .length
		// we only want the loop to run on the last index before the end, not once more
		// when it has reached it
		// so its < not <=
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = " ";
			}
		}
		// could put turnNumber in the loop condition, but I like it in the method
		int turnNumber = 1;
		printBoard(board);
		while (true) {
			inputCheck(board, turnNumber);
			printBoard(board);
			int winCondition = winCheck(board, turnNumber);
			if (winCondition == 0) {

			} else if (winCondition == 1) {
				System.out.println("Player 1 won! (that's a pun)");
				break;
			} else if (winCondition == 2) {
				System.out.println("Player 2 won! Good job!");
				break;
			} else if (winCondition == 3) {
				System.out.println("There was a tie, better luck (skill) next time");
				break;
			}

			turnNumber++;

		}

	}

	public static void inputCheck(String[][] board, int turnNumber) {
		// we are going to check if there is a win in a row, column or any of the
		// possible diagonals and then check who's letter it is
		Scanner input = new Scanner(System.in);
		int player;
		// determine whos turn it is
		if (turnNumber % 2 == 1) {
			player = 1;
		} else {
			player = 2;
		}
		int colArray;
		while (true) {
			System.out.println("Player " + player + ". Choose a column between 1 and 7 to put your checker");
			int columnInput = input.nextInt();

			while (columnInput < 1 || columnInput > 7) {
				System.out.println("Sorry, that column number is not between 1 and 7, try again!");
				columnInput = input.nextInt();
			}
			// convert the user input into a array index by subtracting 1
			colArray = columnInput - 1;

			int columnSame = 0;
			boolean columnFull = false;
			// check if the column is full
			for (int row = 0; row <= 5; row = (row + 1)) {
				if (!(board[row][colArray].equals(" "))) {
					columnSame = columnSame + 1;
				}
			}

			if (columnSame == 6) {
				columnFull = true;
			}
			// if the column is not full, break this whole loop and proceed to input their
			// letter
			if (columnFull == false) {
				break;
			}
			// if the column was full, then restart the whole process
			while (columnFull == true) {
				System.out.println("That column is full! Choose another!");
				break;
			}
		}

		// actually putting their mark on the board
		int row = 5;
		while (row >= 0) {
			if (board[row][colArray].equals("X") || board[row][colArray].equals("O")) {

			} else {
				if (player == 1) {
					board[row][colArray] = "X";
					break;
				} else if (player == 2) {
					board[row][colArray] = "O";
					break;
				}
			}
			row = row - 1;
		}
	}

	public static void printBoard(String[][] board) {
		for (int row = 0; row < board.length; row++) {
			System.out.println();
			System.out.println("---------------------------");
			for (int col = 0; col < board[0].length; col++) {
				System.out.printf(board[row][col] + " | ");
			}
		}
		System.out.println();
		System.out.println("---------------------------");
	}

	/**
	 * Checks if there has been a tie, or a win condition for either player
	 * 
	 * @param board
	 *            the connect four "board" array
	 * @param turnNumber
	 *            the number of turns played so far in the game
	 */
	public static int winCheck(String[][] board, int turnNumber) {
		// board.length gives first number (Rows)
		// board[0].length gives 2nd number (columns)

		int rowSame = 0;
		int col = 0;
		String winLetter = "";
		// make sure it checks each column for vertical win
		for (col = 0; col <= 6; col++) {
			// has to check 4 possible starting positions, from the bottom 3 spots
			for (int row = 0; row <= 2; row++) {
				if ((board[row][col].equals(board[row + 1][col]) && (board[row][col].equals(board[row + 2][col]))
						&& board[row][col].equals(board[row + 3][col]))) {
					winLetter = board[row][col];
					rowSame = 1;
				}
			}
			if (rowSame == 1) {
				if (winLetter.equals("X")) {
					return 1;
				} else if (winLetter.equals("O")) {
					return 2;
				}
			}
		}
		// checks horizontally
		int col2 = 0;
		int row = 0;
		int colSame = 0;
		for (row = 0; row <= 5; row++) {
			// has to check 4 possible starting positions, from the bottom 3 spots
			for (col2 = 0; col2 <= 3; col2++) {
				if ((board[row][col2].equals(board[row][col2 + 1]) && (board[row][col2].equals(board[row][col2 + 2]))
						&& board[row][col2].equals(board[row][col2 + 3]))) {
					winLetter = board[row][col2];
					colSame = 1;
				}
			}
			if (colSame == 1) {
				if (winLetter.equals("X")) {
					return 1;
				} else if (winLetter.equals("O")) {
					return 2;
				}
			}
		}

		// diagonal check

		// checks for diagonals going downwards
		for (row = 0; row <= 5; row++) {
			for (col = 0; col <= 6; col++) {
				// if the diagonal (3 down and to the right) of a point is in bounds, it checks
				// whether those are the same
				if (((row + 3) <= (board.length - 1)) && ((col + 3) <= (board[0].length - 1))) {
					// only check the consecutive diaglonals IF it won't go out of bounds
					if ((board[row][col].equals(board[row + 1][col + 1])
							&& (board[row][col].equals(board[row + 2][col + 2])
									&& (board[row][col].equals(board[row + 3][col + 3]))))) {
						if (board[row][col].equals("X")) {
							return 1;
						} else if (board[row][col].equals("O")) {
							return 2;
						}
					}
				}
			}
		}

		// notice the differences between the two diagonal checkers
		// had to change first if statement so that the row-3 is between the possible
		// values, otherwise it lets through negative array positions
		for (row = 0; row <= 5; row++) {
			for (col = 0; col <= 6; col++) {
				// if the diagonal (3 up and to the right) of a point is in bounds, it checks
				// whether those are the same
				if (((row - 3) >= 0) && ((row - 3) <= 5) && ((col + 3) <= (board[0].length - 1))) {
					if ((board[row][col].equals(board[row - 1][col + 1])
							&& (board[row][col].equals(board[row - 2][col + 2])
									&& (board[row][col].equals(board[row - 3][col + 3]))))) {
						if (board[row][col].equals("X")) {
							return 1;
						} else if (board[row][col].equals("O")) {
							return 2;
						}
					}
				}
			}
		}

		// tie check comes last in case someone wins on the last turn
		if (turnNumber == 42) {
			return 3;
		}
		return 0;
	}
}
