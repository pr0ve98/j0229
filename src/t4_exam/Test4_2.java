package t4_exam;

import java.util.Scanner;

public class Test4_2 {
	public static void main(String[] args) {

		// 1개의 주사위를 던졌을 때 나오는 숫자 맞추기 게임

		Scanner sc = new Scanner(System.in);
		int res, rand;

		while (true) {
			System.out.print("주사위의 눈이 무엇이 나올까요? (1~6) : ");
			res = sc.nextInt();
			/*
			 * if(res > 6 || res < 1) { 
			 * 	System.out.println("1~6까지의 수를 입력하세요");
			 * } else break;
			 */
			if (res >= 1 && res <= 6) break;
			System.out.println("1~6까지의 수를 입력하세요");
		}

		rand = (int) (Math.random() * 6) + 1;

		if (res == rand) System.out.println("정답입니다!");
		else System.out.println("정답이 아닙니다 정답은:" + rand + "였습니다.");

		sc.close();

	}
}
