package t1_while;

public class Test3_3 {
	public static void main(String[] args) {
		
		// 무한 루프

		int i = 0;
		
		while(true) {
			i++;
			System.out.println(i + "안녕");
			
			if(i == 10) break;
		}
		
	}
}
