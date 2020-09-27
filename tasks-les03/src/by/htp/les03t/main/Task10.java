package by.htp.les03t.main;

public class Task10 {

	public static void main(String[] args) {

		double[] a = new double[] { 1.0, 5.0, 9.0, 6.0, 5.0, 3.0, 2.0, 8.0 };

		int n = a.length / 2;

		double[] newA = new double[n];

		for (int i = 0; i < newA.length; i++) {

			newA[i] = a[i] + a[2 * n - (i + 1)];
			
			if (i == n - 1)
				newA[i] = a[i] + a[i + 1];
			
			System.out.print(newA[i] + ", ");
		}
		System.out.println();
		
		double max = newA[0];
		
		for (int i = 0; i < newA.length; i++) {	
			
			if (max < newA[i]) {
				
				max = newA[i];
				
				System.out.print("max = " + max);
			}
		}
	}
}
