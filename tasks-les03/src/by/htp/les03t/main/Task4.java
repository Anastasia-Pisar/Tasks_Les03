package by.htp.les03t.main;

public class Task4 {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, -8, 7, 14, 8, -9 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0 && a[i] != 0) {

				System.out.println(a[i]);

			} else {

				if (a[i] % 2 != 0 && a[i] == 0) {

					System.out.println("В массиве нет четных элементов");
				}
			}
		}
	}
}
