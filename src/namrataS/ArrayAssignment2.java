package namrataS;

import java.util.Scanner;

public class ArrayAssignment2 {
	static void findDuplicateNumbers(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate number is " + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print integer numbers ");
		String allNumbers = sc.nextLine();
		String[] arr = allNumbers.split(" ");
		int[] num = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		findDuplicateNumbers(num);
	}
}
