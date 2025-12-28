

import java.util.Scanner;

//[ 4 ] 한개의 정수(2자리이내)를 입력 , 
//입력된 값이 90이상->”수”, 80이상->”우”, 70이상->”우”, 
//60이상->”양”, 60미만->”가” 을 출력하는 프로그램 작성  
//단, 입력된 값이 100보다 크면 “입력오류”를 출력하고 프로그램을 종료)

public class Exam_04 {
	public static void main(String[] args) {
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("값입력:");
		int a = scn.nextInt();

		if(a>100) {
			System.out.println("입력오류");
			System.exit(0);//정상종료
			//비정상종료일 경우 0 이외값 입력
		}
		if(a>=90)
			System.out.println("수");
		else if(a>=80)
			System.out.println("우");
		else if(a>=70)
			System.out.println("미");
		else if(a>=60)
			System.out.println("양");
		else
			System.out.println("가");
	}
}
