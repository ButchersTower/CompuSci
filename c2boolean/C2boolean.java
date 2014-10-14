package CompuSci.c2boolean;

public class C2boolean {
	void a1(int p1, int p2) {
		boolean invite = false;
		if (p1 + p2 > 120 || p1 + p2 < 15 || p1 > 85 || p2 > 85) {
			invite = true;
		}
	}

	void a2(int rating, boolean wealthy) {
		boolean secondDate = false;
		if (rating >= 8 || (rating == 7 && wealthy)) {
			secondDate = true;
		}
	}

	void a3(boolean raining, boolean floodWarning) {
		boolean gateOpen = false;
		if (raining && floodWarning) {
			gateOpen = true;
		}
	}
}
