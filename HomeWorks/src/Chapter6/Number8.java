package Chapter6;

public class Number8 {
	public static int[] array1 = { 2, 3, 4 }, array2 = { 2, 3, 4 };
	public static int result = 0;

	public static void main(String[] args) {

		for (int i = 0; i < array1.length; i++) {
			result = result+array1[i] * array2[i];
		}
		System.out.println(result);
	}
}
