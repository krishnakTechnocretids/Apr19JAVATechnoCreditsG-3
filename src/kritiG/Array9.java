package kritiG;
//Find all differ index from given arrays 

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Input first array
		System.out.println("Enter an array of numbers seperated by comma");
		String num = sc.nextLine();
		String[] numbers = num.split(",");
		int[] first = new int[numbers.length];

		for (int i = 0; i < first.length; i++) {
			first[i] = Integer.parseInt(numbers[i]);

		}
		// input second array

		System.out.println("Enter another array of numbers seperated by comma ");
		String num1 = sc.nextLine();
		String[] numbers1 = num1.split(",");
		int[] second = new int[numbers1.length];

		for (int i = 0; i < second.length; i++) {
			second[i] = Integer.parseInt(numbers1[i]);
		}

		allDiffer(first, second);
		sc.close();
	}

	static void allDiffer(int[] one, int[] two) {
		if (one.length == two.length) {
			for (int i = 0; i < one.length; i++) {
				if (one[i] == two[i])
					System.out.println("Values match at index " + i);

				else
					System.out.println("Values differ at index " + i);

			}

		} else
			System.out.println("Enter arrays of same length");

	}

}
