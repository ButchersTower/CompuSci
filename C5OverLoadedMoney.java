package CompuSci;

public class C5OverLoadedMoney {
	public C5OverLoadedMoney() {
		System.out.println(money(2.5));
		System.out.println(money(6));
		System.out.println(money("6.125"));
	}

	String money(int n) {
		return "$" + n + ".00";
	}

	String money(double d) {
		int n = (int) (d * 100 + .5);
		int dollars = n / 100;
		int cents = n % 100;
		if (cents < 10) {
			return "$" + dollars + ".0" + cents;
		}
		return "$" + dollars + "." + cents;
	}

	String money(String s) {
		double n = Double.parseDouble(s);
		return money(n);
	}

	public static void main(String[] args) {
		new C5OverLoadedMoney();
	}
}
