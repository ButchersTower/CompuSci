package Class;

public class IterationsActivity {

	double[] data = { 7, 6, 5, 9 };
	double sum = 0, product = 1, max = data[0], min = data[0], average = 0;

	public static void main(String[] args) {
		new IterationsActivity();
	}

	public IterationsActivity() {
		System.out.print("The array is: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
			sum += data[i];
			product *= data[i];
			max = data[i] > max ? data[i] : max;
			min = data[i] < min ? data[i] : min;
		}
		average = sum / data.length;

		System.out.println("\nThe sum of the numbers is: " + sum);
		System.out.println("The product of the nubers is: " + product);
		System.out.println("The max of the numbers is: " + max);
		System.out.println("The min of the numbers is: " + min);
		stD();
	}

	void stD() {
		double avg = 0;
		for (int i = 0; i < data.length; i++) {
			avg += Math.pow(average - data[i], 2) / data.length;
		}
		avg = Math.sqrt(avg);
		System.out.println("The standard deviation is: " + avg);
	}
}
