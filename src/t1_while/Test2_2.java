package t1_while;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		
		// 반복문 탈출(break)
		// break = for문, while문, do while문, switch문 사용
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0, su, breakSu;
		
		while(true) {
			System.out.print("1부터 출력할 수를 입력하세요. ");
			su = sc.nextInt();
			System.out.print("탈출할 수를 입력하세요. ");
			breakSu = sc.nextInt();
			
			if(su >= breakSu) break; 
			else System.out.println("첫번째 수가 두번째 수보다 더 큰수를 입력하셔야 합니다. \n"); // \n 한줄 띄우기
		}
		
		while(i < su) {
			i++;
			System.out.println(i);
			if(i == breakSu) break;
		}
	
		sc.close();
	}
}
