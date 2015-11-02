package Chapter3;

public class Number18 {
	public static int startrange = 100000, endrange = 200000, happy_ticket = 0, a1, b1;
	public static String S, firstrange, lastrange, b, a;

	public static void main(String[] args) {
		for (int i = startrange; i <= endrange; i++) {
			S = Integer.toString(i);
			firstrange = S.substring(0, 3);
			lastrange = S.substring(S.length() - 3, S.length());
			a1 = 0;
			b1 = 0;
			for (int j = 0; j < firstrange.length(); j++) {
				a = firstrange.substring(j, j + 1);
				a1 = Integer.valueOf(a) + a1;
			}

			for (int e = 0; e < lastrange.length(); e++) {
				b = lastrange.substring(e, e + 1);
				b1 = Integer.valueOf(b) + b1;
			}
			if (a1 == b1) {
				happy_ticket++;
			}
		}
		System.out.println(happy_ticket);

	}

}
