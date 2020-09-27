package by.htp.les03t.main;

public class Task5 { 
	
	// Дана последовательность чисел а1 ,а2 ,..., ап.
	// Указать наименьшую длину числовой оси, содержащую все эти числа.


	public static void main(String[] args) {
		
		int max;
		int min;
		int x;

		int[] a = new int[] { 1, -6, 3, -3, 5, 6, -1 };

		max = a[0];
		min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				max = a[i];
			}

			if (a[i] < min) {

				min = a[i];
			}
		}
		
		x = max - min;

		System.out.println("Длина = " + x);
	}
}
