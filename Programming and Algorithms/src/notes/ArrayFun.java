package notes;

public class ArrayFun {
	public static void main(String[] args) {

		/**
		 * The word new tells java to set aside some memory for the array. The [5] tells
		 * java that the array has 5 elements. Otherwise, arrays are declared like
		 * variables.
		 */
		String[] lines = new String[5];

		lines[0] = "Hark!";
		lines[1] = "What light oer yonder window breaks";
		lines[2] = "Parting is such sweet sorrow";
		lines[3] = "I bite my thumb at thee sir";
		lines[4] = "YEEEEEEEEEEEAAAAAAAAHHHH";

		/**
		 * Often, we use i as the looping variable, because it stands for index. When we
		 * loop through every element of an array, that is called traversing the array
		 * (or an array traversal) lines.length will give us 5. You can put .length
		 * after the name of any array to return the number of elements in the array.
		 * Notice we have to use < (not <=) because the last index number is 4, not 5.
		 */
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}

		/**
		 * Practice program (show me in class): Write a program that creates an array of
		 * 10 integers, then use a loop to populate the array with multiples of 7. Then
		 * traverse the array to print them out. At the end, your program should print:
		 * 7 14 21 etc
		 */

		int[] nums = new int[10];

		// "Populating" the array
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 7;
		}

		// Printing out the numbers
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
}