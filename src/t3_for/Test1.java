package t3_for;

public class Test1 {
	public static void main(String[] args) {
		
		/*
			for(int i=초기값; 조건식; 증감치) {
			조건을 만족할 때 수행처리할 내용
			}
		*/
		
		// 조건을 만족하면 해당 조건만큼만 처리할 내용을 수행한다.
		
		for(int i=1; i==10; i++) { // 초기값이 조건에 만족하지 않음
			System.out.println(i);
		}
		System.out.println("작업끝..");
		
	}
}