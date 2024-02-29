package t4_exam;

public class Test2 {
	public static void main(String[] args) {
		int lotto;
		String str = "";
		
		for(int i=1; i <=6; i++) {
			lotto = (int)(Math.random()*45) + 1; // 1~45 정수형 난수
			str += lotto + " ";  // str = str + lotto; = 누적
		}
		System.out.println("금주의 로또 번호는? " + str);
		
		// 중복 숫자 거르는 것은 후에 배울 예정
	}
}
