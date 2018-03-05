
public class BlergRecursion {
	public static void blerg(int x) {
		if (x==5) return;
		blerg(x+1);
		System.out.println(x);
	}
	public static void main(String [] args) {
		blerg(2);
	}
}
