package t4_exam;

import java.util.Scanner;

public class Exam_7_1 {
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
			if(num == 1) {
				System.out.print("예금액> ");
				dep = sc.nextInt();
				balance += dep;
				System.out.println(dep + "원 입금되었습니다.\n");
			}
			else if(num == 2) {
				System.out.print("출금액> ");
				wd = sc.nextInt();
				balance -= wd;
				System.out.println(wd + "원 출금되었습니다.\n");	
			}
			else if(num == 3) {
				System.out.println("잔고> " +balance+"원 입니다.\n");
			}
			else if(num == 4){
				System.out.println("\n 프로그램 종료");
				break;
			}
			else System.out.println("잘못 입력하셨습니다. 다시 입력하여 주십시오.\n");
			
		}
		sc.close();
	}
}
