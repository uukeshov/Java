package Chapter2;

public class Number38 {
	public static int a = 323232323, counter, len, newa, i = 0, k, len1;
	public static String b;
	public static char d;

	public static void main(String[] args) {
		b = Integer.toString(a);
		len = b.length();
		len1 = len;

		while (i < len) {

			d = b.charAt(len1 - 1);
			//System.out.println(d);
			if (d == '1') {
				b = b.substring(0, len1 - 1);
				break;
			}
			i++;
			len1--;
		}

		System.out.print(b);

	}

}
