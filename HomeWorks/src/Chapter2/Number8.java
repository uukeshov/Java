package Chapter2;

public class Number8 {

	public static void main(String[] args) {
		int fact = 6, i = 0, res=1;
		i = fact;
		res=fact;

		while (i > 1) {
			res = res * --fact;
			i--;
		}
		System.out.println(res);
	}

}
