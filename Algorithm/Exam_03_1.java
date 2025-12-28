

import java.util.Scanner;

//[ 3 ] 한개의 정수(2자리이내)를 입력 , 
//입력된 값이 80 ~ 90 사이이면  “OK”  아니면 “NO”을 출력하는 프로그램 작성

public class Exam_03_1 {
	public static void main(String[] args) {
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("값입력:");
		int a = scn.nextInt();
		if(a>=80 && a<=90)
				System.out.print("합격");
		else
			System.out.print("불합격");
		
	}
}
