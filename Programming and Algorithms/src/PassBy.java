
public class PassBy {
	public static void main(String [] args) {
		int q =3;
		int[] u= {3,4,5};
		ayy(q,u);
		System.out.println(q);
		System.out.println(u[0]);
		
	}
	public static void ayy(int x, int[] y) {
		x++;
		y[0]++;
	}
}
