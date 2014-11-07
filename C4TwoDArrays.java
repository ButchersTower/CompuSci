package CompuSci;

import java.util.Scanner;

public class C4TwoDArrays {
	Scanner scan;

	String[][] info = { { "Male", "Female" },
			{ "21-35", "26,30", "31-35", "other" } };

	public C4TwoDArrays() {
		scan = new Scanner(System.in);
		System.out.print("Enter your gender");
		for (int i = 0; i < info[0].length; i++) {
			System.out.print(" - " + i + " - for " + info[0][i]);
		}
		System.out.println();

		int gender;

		while ((gender = inputInt()) > info[0].length - 1 || gender < 0) {
			System.out.println("Sorry, that is not an option, try again: ");
		}

		System.out.print("Enter your age -");
		for (int i = 0; i < info[1].length; i++) {
			System.out.print(" " + i + " - for " + info[1][i]);
		}
		System.out.println();
		int age;
		while ((age = inputInt()) > info[1].length - 1 || age < 0) {
			System.out.println("Sorry, that is not an option, try again: ");
		}
		System.out.println("Your gender is " + info[0][gender]);
		System.out.println("Your gender is " + info[1][age]);
	}

	int inputInt() {
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

	public static void main(String[] args) {
		new C4TwoDArrays();
	}
}
