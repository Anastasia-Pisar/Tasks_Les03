package by.htp.les03t.main;

import java.util.Random;

public class Task9 {
	
	public static void main(String[] args) {

		int N = 5;
		int eNegative = 0;
		int ePositive = 0;
		int eNull = 0;

		double[] a = new double[N];

		Random rand = new Random();

		for (int i = 0; i < N; i++) {

			a[i] = rand.nextDouble();

			System.out.print(a[i] + ", ");
		}
		for (int i = 0; i < N; i++) {

			if (a[i] < 0)

				eNegative++;

			if (a[i] > 0)

				ePositive++;

			if (a[i] == 0)

				eNull++;
		}
		System.out.println();
		System.out.println("Отрицательных элементов = " + eNegative);
		System.out.println("Положительных элементов = " + ePositive);
		System.out.println("Нулевых элементов = " + eNull);
	}
}
