package t1_while;

public class Test3_2 {
	public static void main(String[] args) {
		
		// 무한 루프
		// byte -128~127 뫼비우스의 띠가 되어버림
		
		byte i = 0;
		
		while(true) {
			i++;
			System.out.println(i + "안녕");
		}
		
	}
}
