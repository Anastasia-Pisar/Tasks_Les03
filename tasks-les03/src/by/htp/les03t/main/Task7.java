package by.htp.les03t.main;

public class Task7 {

	public static void main(String[] args) {
		
		double max;
		double min;
		int maxE = 0;
		int minE = 0;
		
		
		double [] a = new double [] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
		
		max = a[0];
		min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (max < a[i]) {
				
				max = a[i];
				maxE = i;
			}
			if (min > a[i]) {
				
				max = a[i];
				maxE = i;
			}
		}
		a[maxE] = min;
		a[minE] = max;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + ", ");
		}
	}
}
