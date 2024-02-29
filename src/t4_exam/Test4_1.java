package t4_exam;

import java.util.Scanner;

public class Test4_1 {
	public static void main(String[] args) {
		
		// 1개의 주사위를 던졌을 때 나오는 숫자 맞추기 게임
		
		Scanner sc = new Scanner(System.in);
		
		int rand = (int)(Math.random()*6) + 1;
		
		System.out.print("주사위의 눈이 무엇이 나올까요? (1~6) : ");
		int res = sc.nextInt();
	
			if(res == rand) {
				System.out.println("정답입니다!");
			}
			else System.out.println("정답이 아닙니다 정답은:" + rand + "였습니다." );
		
		sc.close();

	}
}
