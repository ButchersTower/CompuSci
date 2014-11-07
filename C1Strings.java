package CompuSci;

public class C1Strings {

	public static void main(String[] args) {
		activity1();
		activity2();
		activity3();
	}

	static void activity1() {
		System.out.println("**a1**");
		String a = "5.0";
		Double b;
		double a1 = Double.parseDouble(a);
		a1 += .001;
		b = a1;
		System.out.println(b);
	}

	static void activity2() {
		System.out.println("**a2**");
		int a;
		String x = "flex";
		String y = "blex";
		String z = "chex";
		a = x.length() + y.length() + z.length();
		System.out.println(a);
	}

	static void activity3() {
		System.out.println("**a3**");
		String m = "furVor";
		String p;
		int d = m.indexOf("V");
		p = m.substring(d);
		System.out.println(p);
	}

	static void a2Rev() {
		// untested
		String[] stAr = { "flex", "blex", "chex" };
		int length = 0;
		for (int s = 0; s < stAr.length; s++) {
			System.out.println("String[" + s + "]: " + stAr[s]);
			length += stAr[s].length();
		}
		System.out.println("totalLength: " + length);

	}
}
