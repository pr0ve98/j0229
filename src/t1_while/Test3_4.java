package t1_while;

public class Test3_4 {
	public static void main(String[] args) {
		
		// 무한 루프

		int i = 0;
		boolean run = true;
		
		while(run) {
			i++;
			System.out.println(i + "안녕");
			
			// if(i == 10) break;
			if(i == 10) run = false;
		}
		
	}
}
