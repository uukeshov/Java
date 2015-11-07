package Lesson9;

public class ClassLineConstructor {
	public static int x = 0, begin, tilt, c;

	private static int getX() {
		return x;
	}

	private static void setX(int x) {
		ClassLineConstructor.x = x;
	}

	private static String getXString() {
		return Integer.toString(x);
	}

	private static double getXdouble() {
		return (int) x;
	}

	public static int getSpeed(int x, int c) {
		if (x != 0) {
			return c;
		}
		return 0;

	}

	public static int getBegin(int x) {
		if (x != 0) {
			return c;
		}
		return 0;

	}

}
