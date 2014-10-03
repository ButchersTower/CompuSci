package a1WeightedAverage;

import java.util.Scanner;

public class A1WeightedAverage {
	static Scanner scan = new Scanner(System.in);

	static double testWeight = .5;
	static double quizWeight = .3;
	static double homeworkWeight = .2;

	public static void main(String[] args) {
		// set number of tests and quizzes
		int[] tests = new int[2];
		int[] quizes = new int[3];
		// input test scores, quiz scores, and homework average.
		System.out.println("Please enter your test grades.");
		for (int t = 0; t < tests.length; t++) {
			System.out.println("Test " + (t + 1) + ": ");
			tests[t] = inputInt();
		}
		System.out.println("Please enter your quiz grades.");
		for (int q = 0; q < quizes.length; q++) {
			System.out.println("Quiz " + (q + 1) + ": ");
			quizes[q] = inputInt();
		}
		System.out.println("Please enter your homework average.\nHomework:");
		double homeworkAvg = inputDouble();
		// average and apply weights.
		double testAvg = 0;
		for (int t = 0; t < tests.length; t++) {
			testAvg += tests[t];
		}
		testAvg /= tests.length;
		System.out.println("Test Average: " + testAvg);
		double quizAvg = 0;
		for (int q = 0; q < quizes.length; q++) {
			quizAvg += quizes[q];
		}
		quizAvg /= quizes.length;
		System.out.println("Quiz Average: " + quizAvg);
		double finalGrade = (testAvg * testWeight) + (quizAvg * quizWeight)
				+ (homeworkAvg * homeworkWeight);
		System.out.println("Final Grade: " + finalGrade);
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

	static double inputDouble() {
		double temp = 0d;
		try {
			temp = scan.nextDouble();
		} catch (Exception ex) {
			System.out.println("Not a double, try again: ");
			scan.nextLine();
			temp = inputDouble();
		}
		return temp;
	}

	static int inputIntOld1() {
		int temp = -1;
		while (temp == -1) {
			if (scan.hasNextInt()) {
				temp = scan.nextInt();
			} else {
				System.out.println("not an int");
				scan.next();
			}
		}
		return temp;
	}
}
