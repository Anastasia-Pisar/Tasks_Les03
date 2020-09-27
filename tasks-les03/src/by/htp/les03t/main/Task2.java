package by.htp.les03t.main;

public class Task2 {
	
	public static void main(String[] args) {
		
		int[] a =  new int[] { 0, 2, 0, 7, 5, 0, 4, 0, 2, 5, 0 };
		int[] b =  new int[a.length];
		
		for (int i = 0; i < a.length; i++ ) {
			
			if (a[i] == 0) {
									
				b[i] = i;
				
				System.out.print(b[i] + " ");	
			}	
		}
	}
}
