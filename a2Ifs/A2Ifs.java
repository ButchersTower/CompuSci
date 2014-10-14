package CompuSci.a2Ifs;

import java.util.Scanner;

public class A2Ifs {
	Scanner scan = new Scanner(System.in);

	String[] month = { "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December" };

	String[] number = { "First", "Second", "Third", "Fourth", "Fifth", "Sizth",
			"Seventh", "Eighth", "Nineth", "Tenth", "Eleventh", "Twelth",
			"Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth",
			"Seventeenth", "Eigthteenth", "Nineteenth", "Twentyth",
			"Twentfirst", "Twentsecond", "Twentthird", "Twentfourth",
			"Twentfifth", "Twentsixth", "Twentseventh", "Twenteigth",
			"Twentnineth", "Thirtyth", "Thirtyfirst" };

	String[] sign = { "Aquarious", "Pisces", "Aries", "Taurus", "Gemini",
			"Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius",
			"Capricorn" };
	int[] startingBound = { 20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22 };

	// February's max length is 29 because I'm all right with diversity.
	// but mainly because I don't now what year they were born during.
	int[] monthLength = { 31, 29, 21, 20, 21, 20, 21, 21, 20, 21, 20, 21 };

	String[] predictions = { "Aquarious prediction", "Pisces prediction",
			"Aries prediction", "Taurus prediction", "Gemini prediction",
			"Cancer prediction", "Leo prediction", "Virgo prediction",
			"Libra prediction", "Scorpio prediction", "Sagittarius prediction",
			"Capricorn prediction" };

	int birthMonth;
	int birthDay;

	public A2Ifs() {
		System.out.println("Enter the number of your birth month:");
		// birthMonth = inputInt() - 1;
		while ((birthMonth = inputInt()) > 12 || birthMonth < 1) {
			System.out
					.println("You must have forgotten your birthmonth, ask your mum then try again:");
		}
		birthMonth--;

		System.out.println("Enter the number of your birth day");

		// birthDay = inputInt() - 1;
		while ((birthDay = inputInt()) > monthLength[birthMonth]
				|| birthDay < 1) {
			System.out
					.println("You must have forgotten your birthday, ask your mum then try again:");
		}
		birthDay--;

		System.out.println("Your birthday is: " + month[birthMonth] + " the "
				+ number[birthDay]);
		int yourSign;
		// if(birthDay >= startingBound[birthMonth])
		yourSign = birthDay < startingBound[birthMonth] ? birthMonth
				: birthMonth + 1;
		yourSign = yourSign == 12 ? 0 : yourSign;
		System.out.println(sign[yourSign] + ": " + predictions[yourSign]);
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
		new A2Ifs();
	}
}
