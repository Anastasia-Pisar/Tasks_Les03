package by.htp.les03t.main;

public class Task1 {
	
	public static void main(String[] args) {
		
		int K = 3;
		int S = 0;
					
		int[] A = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for ( int i = 0; i < A.length; i++ ) {
			
			if (A[i] % K == 0) {
				
				S = S + A[i];
			}
		}
		System.out.println(S);
	}
}
