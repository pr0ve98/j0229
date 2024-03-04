package t4_exam;

import java.util.Scanner;

public class Star_9 {
	public static void main(String[] args) {
		/*
		 	    *
		 	   ***
		 	  *****
		 	 *******
		 	*********
		     *******
		      *****
		       ***
		        *
		 */
		
		// *의 갯수는 홀수가 좋음
		// 중간 별의 갯수를 입력받기(짝수로 받으면 홀수로 변경)
		// 중간 별을 기준으로 위로는 증가별, 아래는 감소별
		
		// 2n 짝수계, 2n - 1 | 2n + 1 = 홀수계
		
		Scanner sc = new Scanner(System.in);
		
		int mid, i, j;
		
		while(true) {
		System.out.print("숫자를 입력하세요.(홀수만): ");
		mid = sc.nextInt();
			if(mid % 2 == 0) System.out.println("짝수를 입력하셨습니다 다시 입력하시오.\n");
			else break;
			}
		
		for(i=1; i<=mid; i+=2) {
			for(j=1; j<=(mid-i)/2; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=mid-2; i>=1; i-=2) {
			for (j=1; j<=(mid-i)/2; j++) {
				System.out.print(" ");
			}
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}
