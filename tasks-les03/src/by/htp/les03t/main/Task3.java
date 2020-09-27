package by.htp.les03t.main;

public class Task3 {

	public static void main(String[] args) {

		boolean n;

		double[] a = new double[] { 1.0, 3.0, 5.0, 7.0, 9.0, 11.0 };

		for (int i = 1; i < a.length - 1; i++) {

			if (a[i] < a[i + 1]) {

				n = true;

			} else {

				n = false;
			}
		}
		if (n = true) {

			System.out.println("Последовательность возрастающая");

		} else {

			System.out.println("Последовательность убывающая");
		}
	}
}
