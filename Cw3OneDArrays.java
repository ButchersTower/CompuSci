package CompuSci;

import java.util.Scanner;

import org.xml.sax.InputSource;

public class Cw3OneDArrays {
	static Scanner scan = new Scanner(System.in);

	static int[] inputs = new int[6];

	public static void main(String[] args) {
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Enter element[" + i + "]: ");
			inputs[i] = inputInt();
		}
		sayAr(inputs);
		inputs = switchFirstAndLast(inputs);
		sayAr(inputs);
	}

	static int[] invertAr(int[] ar) {
		int[] temp = new int[ar.length];
		for (int a = 0; a < ar.length; a--) {
			temp[a] = ar[ar.length - 1 - a];
		}
		return temp;
	}

	static int[] switchFirstAndLast(int[] ar) {
		int tempFirst = ar[0];
		ar[0] = ar[ar.length - 1];
		ar[ar.length - 1] = tempFirst;
		return ar;
	}

	static void sayAr(int[] ar) {
		for (int a = 0; a < ar.length; a++) {
			System.out.print(ar[a] + " ");
		}
		System.out.println();
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
