package notes;

public class RecursionStackOverflow {

	public static void main(String[] args) {
		thing();
	}

	public static void thing() {
		thing();
	}
}
