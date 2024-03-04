package t4_exam;

import java.util.Scanner;

public class Exam_7_2 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0, num = 0, dep, wd;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택> ");
			num = sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.print("예금액> ");
					dep = sc.nextInt();
					balance += dep;
					System.out.println(dep + "원 예금되었습니다.\n");
					break;
				
				case 2:
					System.out.print("출금액> ");
					wd = sc.nextInt();
						if(wd > balance) {
							System.out.println("잔고가 부족합니다!");
							break;
						}
						balance -= wd;
					System.out.println(wd + "원 출금되었습니다.\n");
					break;
					
				case 3:
					System.out.println("잔고> "+balance+"원입니다.\n");
					break;
					
				case 4:
					System.out.println("\n 프로그램 종료");
					run = false;
					break;
					
				default: 
					System.out.println("잘못 입력하였습니다. 다시 입력해주십시오.\n");
				
			}
		}
		sc.close();
	}
}
