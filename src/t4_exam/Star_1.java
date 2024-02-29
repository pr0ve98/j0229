package t4_exam;

public class Star_1 {
	public static void main(String[] args) {
		/*
		  1 2 3
		  4 5 6
		  7 8 9
		 */
		
		int su = 0;
		
		for(int i=1; i<=3; i++) { // 바깥쪽 for 문이 행, 안쪽 for 문이 열
			for(int j=1; j<=3; j++) {
				su++;
				System.out.print(su + " ");
			}
			System.out.println();
		}
		
		
	}
}
