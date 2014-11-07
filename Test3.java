package CompuSci;

public class Test3 {
	public static void main(String[] args) {
		new Test3();
	}

	public Test3() {
		q13();
	}

	int x = 5;

	void q13() {
		System.out.println("** q13 **");
		if (x > 0) {
			int x;
			x = 10;
		} else {
			int y;
			y = 9;
			x += y;
		}
		System.out.println("x: " + x);
	}

	void q19() {
		String s = "pizza";
		if ("pepperoni".compareTo(s) < 0) {
			if ("pineapple".compareTo(s) < 0) {
				if ("vegetarian".compareTo(s) < 0) {
					String x = "veggie" + s;
				}
			}
		}
	}
}
