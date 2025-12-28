

import java.util.Scanner;

//[ 5 ] 세 개의 정수를 입력 받아  가장 큰 값을 찾아  출력하는 알고리즘
//(단, 동일한 값은 없다.)

public class Exam_05 {
	public static void main(String[] args) {
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("값입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max;
		if(a>b)
			max=a;
		else
			max=b;
		if(max<c)
			max=c;
		System.out.println(max);

	}
}
