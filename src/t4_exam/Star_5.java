package t4_exam;

public class Star_5 {
	public static void main(String[] args) {
		/*
		  *
		  **
		  ***
		  ****
		  *****
		 */
		
		for(int i=1; i<=5; i++) { // 바깥쪽 for 문이 행, 안쪽 for 문이 열
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
