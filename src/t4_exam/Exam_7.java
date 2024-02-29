package t4_exam;

import java.util.Scanner;

public class Exam_7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			if(num == 1) {
				System.out.print("예금액> ");
			}
			else if(num == 2) {
				System.out.print("출금액> ");
				
			}
			else if(num == 3) {
				System.out.print("잔고> ");
				
			}
			
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
