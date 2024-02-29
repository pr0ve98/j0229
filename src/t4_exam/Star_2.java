package t4_exam;

public class Star_2 {
	public static void main(String[] args) {
		/*
		  9 8 7
		  6 5 4
		  3 2 1
		 */
		
		int su = 10;
		
		for(int i=1; i<=3; i++) { // 바깥쪽 for 문이 행, 안쪽 for 문이 열
			for(int j=1; j<=3; j++) {
				su--;
				System.out.print(su + " ");
			}
			System.out.println();
		}
		
		
	}
}
