package by.htp.les03t.main;

public class Task6 {

	public static void main(String[] args) {
		
		double z = 5.0;
		int x = 0;
		
		double [] a = new double [] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > z) {
				
				a[i] = z;
				x++;
			}
			System.out.print(a[i] + ", ");
		}
		System.out.println();
		System.out.println("Количество замен = " + x);
	}
}
