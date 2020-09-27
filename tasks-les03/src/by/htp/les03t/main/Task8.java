package by.htp.les03t.main;

public class Task8 {

	public static void main(String[] args) {
		
		int[] a = new int[] { 1, 2, -8, 7, 3, 8, -9 };
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > i) {
			
			System.out.print(a[i] + ", ");
			}
		}
	}
}
