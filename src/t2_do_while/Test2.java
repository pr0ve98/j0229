package t2_do_while;

public class Test2 {
	public static void main(String[] args) {
		
		/*
		do {
			수행할 내용
		} while(조건식);
		*/
		
		int i = 10;
		
		do {
			i++;
			System.out.println(i);
		} while(i < 10);
		
		// 조건을 만족하지 않았는데도 무조건 1번은 실행한다 while문과 do while문의 차이!
		
	}
}
