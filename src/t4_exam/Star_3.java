package t4_exam;

public class Star_3 {
	public static void main(String[] args) {
		/*
		  1 4 7
		  2 5 8
		  3 6 9
		 */
		
		int su = -2;
		
		for(int i=1; i<=3; i++) { // 바깥쪽 for 문이 행, 안쪽 for 문이 열
			for(int j=1; j<=3; j++) {
				su += 3;
				System.out.print(su + " ");
			}
			su -= 8;
			System.out.println();
		}
		
		
	}
}
