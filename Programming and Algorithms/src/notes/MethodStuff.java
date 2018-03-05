package notes;

import java.util.Scanner;

public class MethodStuff {
	/**
	 * Methods are reusable bits of code. You've actually been using a method called
	 * main every time you write a program. Methods have some different parts:
	 * HEADER: public static int nameOfMethod(int param...) BODY: Everything in the
	 * curly braces (the actual code)
	 * 
	 * The Header has 2 important things: the RETURN TYPE (int, double, String,
	 * void...) goes before the name of the method and determines what type of value
	 * is RETURNED Between the parentheses are the PARAMETERS. You can have as many
	 * as you want, seperated by commas. Parameters are like variables that go into
	 * the method from outside. Another name for parameters: ARGUMENTS
	 */
	public static double myMethod(int param, double blah) {
		return param * blah;
	}

	/**
	 * CALLING a method. CALLING is the word we use for when we actually use the
	 * method. To call a method, just type its name and fill in the parameters
	 * properly (order matters). You are allowed to call a method anywhere its
	 * return type 'fits'.
	 */
	public static void main(String[] args) {

		double myNumber = myMethod(5, 7.5);
		System.out.println(myMethod(5, 2.3));
		System.out.println(myNumber);

		int x = getInt("Hello! Type an integer");
		int y = getInt("Another integer please");
		System.out.println("I multiplied them: " + x * y);

	}

	/**
	 * a Method that does something more interesting: Packages scanning an integer
	 * into one method. Methods are usually used to make it easier to repeat
	 * something multiple times in different places.
	 */
	public static int getInt(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextInt();
	}
}
