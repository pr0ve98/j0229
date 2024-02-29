package t1_while;

public class Test4_2 {
	public static void main(String[] args) {
		
		// 반복문 제어(continue : 반복문의 처음으로 돌려보낸다)
		
		int i = 0;
		
		while(i < 10) {
			i++;
			
			// i값이 짝수인 경우만 출력하시오. (단, 홀수인 경우는 출력하지 않고 다시 조건을 비교하도록 하시오)
			if(i % 2 != 0) continue; 
			
			System.out.println(i);
		}
		
	}
}
