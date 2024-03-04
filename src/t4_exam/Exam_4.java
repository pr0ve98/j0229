package t4_exam;

public class Exam_4 {
	public static void main(String[] args) {
		
		/* while문과 Math.random()메소드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을
		 * (눈1,눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
		 * 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		 */
		
		int dot1=0, dot2=0;
		System.out.println("\n====주사위 두개를 던집니다====\n\n");
		
		while(true) {
			int rand1 =(int)(Math.random()*6)+1;
			int rand2 =(int)(Math.random()*6)+1;
			dot1 = rand1;
			dot2 = rand2;
			if(dot1+dot2 != 5){
			System.out.println("("+dot1+","+dot2+")");
			}
			else if(dot1+dot2 == 5) {
				System.out.println("("+dot1+","+dot2+")<==");
				System.out.println("\n 두 주사위 눈의 합의 5가 되어 종료합니다.");
				break;
			}
		}
		
	}
}
