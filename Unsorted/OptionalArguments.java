package Class;

public class OptionalArguments {
	public static void main(String[] args) {
		// System.out.println("wd: " + writeDate(2008, 3, 26, 9, 2, 45));
		// System.out.println("wd: " + writeDate(2010, 11, -1, 0, 0, 17));
		// System.out.println("wd: " + writeDate(2005, 6, 1, 16, 3, -1));
		System.out.println("wd: " + writeDate(2009, 6, -1, -1, -1, -1));
	}

	static String writeDate(int year, int month, int day, int hour, int minute,
			int second) {
		String retu = "";
		if (day > 0) {
			retu += month + "/" + day + "/" + year;
		} else {
			retu += month + "/" + year;
		}
		String h = "", m = "", s = "";
		if (hour >= 0) {
			if (hour < 10) {
				h = "0" + hour;
			} else {
				h += hour;
			}
		}
		if (minute >= 0) {
			if (minute < 10) {
				m = "0" + minute;
			} else {
				m += minute;
			}
		}
		if (second >= 0) {
			if (second < 10) {
				s = "0" + second;
			} else {
				s += second;
			}
		}
		if (m.length() != 0) {
			h += ":";
		}
		if (s.length() != 0) {
			m += ":";
		}
		return retu + " " + h + "" + m + "" + s;
	}
}
