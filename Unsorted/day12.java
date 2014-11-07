package CompuSci.Unsorted;

public class day12 {
	public static void main(String[] args) {
		new day12();
	}

	public day12() {
		String[] stAr = { "meat", "fat", "flukes" };
		stAr = guillotine(stAr);
		for (int i = 0; i < stAr.length; i++) {
			System.out.println("stAr[" + i + "]: " + stAr[i]);
		}
	}

	String[] guillotine(String[] stAr) {
		for (int i = 0; i < stAr.length; i++) {
			stAr[i] = stAr[i].substring(1);
		}
		return stAr;
	}
}
