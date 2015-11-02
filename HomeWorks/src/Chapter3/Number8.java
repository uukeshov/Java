package Chapter3;

public class Number8 {
	public static int x1 = 1023134, j = 4, x;
	public static String c, b;

	public static void main(String[] args) {

		c = Integer.toString(x1);

		for (int i = 0; i < 1; i++) {
			b = c.substring(0, j);

			for (int e = 0; e < b.length(); e++) {
				c = b.substring(e, e + 1);
				x = x + Integer.valueOf(c);
			}
		}
		System.out.println(x);

	}

}
