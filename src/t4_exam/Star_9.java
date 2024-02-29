package t4_exam;

import java.util.Scanner;

public class Star_9 {
	public static void main(String[] args) {
		/*
		 	    *
		 	   ***
		 	  ******
		 	 ********
		 	**********
		     ********
		      ******
		        ***
		         *
		 */
		
		// *의 갯수는 홀수가 좋음
		// 중간 별의 갯수를 입력받기(짝수로 받으면 홀수로 변경)
		// 중간 별을 기준으로 위로는 증가별, 아래는 감소별
		
		// 2n 짝수계, 2n - 1 | 2n + 1 = 홀수계
		
		Scanner sc = new Scanner(System.in);
		int mid = sc.nextInt();
		
		if(mid % 2 == 0) {
		
		}
		
		
		
		sc.close();
	}
}
