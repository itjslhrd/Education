
import java.util.Scanner;

//[ 1 ] 임의 변수  값이 80이상이면 “합격” 을 출력하는 프로그램 작성
public class Exam_01 {
	public static void main(String[] args) {
/*		
		int score = 80;
		if(score>=80)
			System.out.print("합격");
*/
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("값입력:");
		int score = scn.nextInt();
		if(score>=80)
			System.out.print("합격");
		
	}

}
