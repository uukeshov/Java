package Chapter2;

public class Number24 {

	public static void main(String[] args) {
		int first = 1, second = 1,temp,counter=0;
		
		//0709 40-44-94

		for (int i = 0; i < 20; i++) {

			if (first == 1 && second == 1 && counter==0) {
				System.out.print(first);
				System.out.print(" ");
				System.out.print(second);
				counter=1;

			} else {
				System.out.print(" ");
				System.out.print(second + first);
				temp=second;
				second = first + second;
				first = temp;
			}

		}
	}
}
