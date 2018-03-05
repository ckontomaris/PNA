package notes;

public class StringCompareTo {
	public static void main(String[] args) {
		String a = "blah";
		String b = "b";

		if (a.compareTo(b) < 0) {
			// This will happen if a is less than b
			// HOWEVER, compareTo thinks all upper case characters
			// are less than ALL lower case characters
			// so a.compareTo(b) will actually give a positive number
		}

		if (a.compareToIgnoreCase(b) < 0) {
			// This will work as expected
		}

	}
}