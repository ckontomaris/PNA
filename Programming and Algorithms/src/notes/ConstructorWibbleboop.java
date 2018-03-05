package notes;

public class ConstructorWibbleboop {
	public static void main(String[] args) {
		/**
		 * This creates a wibbleboop using the constructor with parameters, so this
		 * wibbleboop is different from the default
		 */
		Wibbleboop hey = new Wibbleboop(12, 5.7, "Frank");

		hey.poke();
		hey.growhair(3.2);

		/**
		 * You are allowed to refer directly to variables in the class
		 */
		System.out.println(hey.eyes);
	}
}

class Wibbleboop {
	int eyes;
	double hairlen;
	String name;

	public Wibbleboop() {
		/**
		 * You can set default values in the constructor instead of with the variables
		 * if you want.
		 */
		eyes = 10;
		hairlen = 2.3;
		name = "Splangy";
	}

	public Wibbleboop(int e, double h, String n) {
		/**
		 * This constructor is more useful because it lets you set some member variables
		 * in the parameters
		 */
		eyes = e;
		hairlen = h;
		name = n;
	}

	public void poke() {
		if (eyes > 0)
			eyes--;
	}

	public void haircut() {
		hairlen = 0;
	}

	public void growhair(double x) {
		hairlen = hairlen + x;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}
