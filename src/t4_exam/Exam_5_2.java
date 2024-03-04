package t4_exam;

public class Exam_5_2 {
	public static void main(String[] args) {
		
		// 2x + 3y = 25를 만족하는 x와 y의 값을 출력하시오. (x와 y는 10 이하의 자연수이다.)
		
		int x=0, y=0, cnt=0;
		
		for(x=1; x<=10; x++){
			for(y=1; y<=10; y++) {
				if(x*2+y*3 == 25) {
						cnt++;
						System.out.println("("+x+","+y+")");
				}
			}
		}
		System.out.println("조건을 만족하는 갯수는? "+cnt);
	}
}
