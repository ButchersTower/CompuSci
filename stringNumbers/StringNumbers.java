package CompuSci.stringNumbers;

import java.util.Scanner;

public class StringNumbers {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		double num = -1;
		String in = scan.nextLine();
		// parse in by spaces and go through and find the first string that
		// parsesDouble to a double, if it errors then try next.
		boolean foundNum = false;
		String[] splitBySpace = in.split(" ");
		for (int sb = 0; sb < splitBySpace.length; sb++) {
			try {
				num = Double.parseDouble(splitBySpace[sb]);
				foundNum = true;
			} catch (Exception ex) {
			}
		}
		if (foundNum) {
			System.out.println("Your number is: " + num);
		} else {
			System.out.println("Cant find number");
		}
	}
}
