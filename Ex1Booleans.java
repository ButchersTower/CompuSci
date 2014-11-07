package CompuSci;

import java.util.Scanner;

public class Ex1Booleans {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter two integers: ");
		int a = inputInt();
		int b = inputInt();
		if (a >= 0 && b >= 0) {
			System.out.println("Both are positive or zero.");
		} else {
			System.out.println("One or both are negative.");
		}
	}

	static int inputInt() {
		int temp = 0;
		try {
			temp = scan.nextInt();
		} catch (Exception ex) {
			System.out.println("Not an integer, try again.");
			scan.nextLine();
			temp = inputInt();
		}
		return temp;
	}
}
