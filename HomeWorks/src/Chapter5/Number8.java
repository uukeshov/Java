package Chapter5;

import java.util.*;

public class Number8 {

	public static void main(String[] args) {
		int[] ceil_numbers = { 1, 2, 3, 4, 5, 6, 7, 77, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
				61, 67, 71, 73, 79, 83, 89, 97, 101, 32323233, 103, 107, 323, 109, 113, 32, 7, 65, 5, 4, 127, 131, 137,
				139, 149, 151, 157 };
		String simpleNumbers = "";
		int temp, ceil = 0, control = 0;

		for (int i = 0; i < ceil_numbers.length; i++) {
			temp = ceil_numbers[i];
			ceil = 0;
			for (int j = 0; j <= temp; j++) {
				if (temp != j && j != 1 && j != 0) {
					ceil = temp % j;
					if (ceil == 0) {
						control = 1;
					}
				}
			}
			if (control == 0 && temp != 1 && temp != 0) {
				simpleNumbers = simpleNumbers + " " + String.valueOf(temp);
			} else {
				control = 0;
			}
		}
		System.out.println(simpleNumbers);
	}
}
