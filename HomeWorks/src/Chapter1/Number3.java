package Chapter1;

public class Number3 {
	public static double a = 1, b = -22, c = 121, x1, x2, d;

	// D=b^2 - 4ac.
	public static void main(String[] args) {

		d = Math.pow(b, 2) - 4 * a * c;

		if (d > 0) {
			x1 = (-(b) + (Math.sqrt(d))) / (2 * a);
			x2 = (-(b) - (Math.sqrt(d))) / (2 * a);

			System.out.println(x1);
			System.out.println(x2);
		} else if (d == 0) {

			x1 = (-(b) + (Math.sqrt(d))) / (2 * a);
			System.out.println(x1);

		} else if (d < 0) {
			System.out.println("No roots");
		}

	}

}
