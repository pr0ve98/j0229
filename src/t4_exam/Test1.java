package t4_exam;

public class Test1 {
	public static void main(String[] args) {
		
		// 난수(랜덤수) 생성
		
		double rand = Math.random(); // 0이상 ~ 1미만의 실수형난수
		// double 타입이라 실수로 나오므로 변환해 정수로 사용해야 함
		System.out.println("0rand : " + rand);
		
		for(int i =1; i<=5; i++) {
			System.out.println(i+"rand : " + Math.random());
			
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.println(i+". rand : " + Math.random() * 10); // 0이상 ~ 10미만의 실수형난수
		}
			System.out.println();
			
		for(int i=1; i<=5; i++) {
			System.out.println(i+". rand : " + (int)(Math.random() * 10)); // 0이상 ~ 10미만의 정수형난수
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.println(i+". rand : " + ((int)(Math.random() * 10) + 1)); // 1이상 ~ 10이하의 정수형난수
			}
		System.out.println();
	
		for(int i=1; i<=5; i++) {
			System.out.println(i+". rand : " + ((int)(Math.random() * 45) + 1)); // 1이상 ~ 45이하의 실수형난수
			
			//System.out.println(i+". rand : " + ((int)(Math.random() * 끝수) + 시작수));
		}
	}
}
