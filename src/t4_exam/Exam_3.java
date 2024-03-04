package t4_exam;

public class Exam_3 {
	public static void main(String[] args) {
		
		// for 문을 이용해 1부터 100까지의 정수 중에서 3의 배수 총합을 구하는 코드를 작성하시오.
		
		int i = 0, tot = 0;
		
		for(i=1; i<=100; i++) {
			if(i % 3 == 0) {
				tot += i;
			}
		}
		System.out.println("3의 배수의 합: "+tot);
	}
}
