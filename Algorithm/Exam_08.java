

import java.util.Scanner;

//[ 8 ] 세개의 정수를 입력 받아 대, 중, 소 찾아 출력하는 알고리즘
//(단, 동일한 값은 없다.)
//교환법
public class Exam_08 {
	public static void main(String[] args) {
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("a 입력:");
		int a = scn.nextInt();
		System.out.print("b 입력:");
		int b = scn.nextInt();
		System.out.print("c 입력:");
		int c = scn.nextInt();
				
		if(a<b) {
			int imsi = a;
			a = b;
			b = imsi;
		}
		if(a<c) {
			int imsi = a;
			a = c;
			c = imsi;			
		}
		if(b<c) {
			int imsi = b;
			b = c;
			c = imsi;			
		}
		
		System.out.printf("%d > %d > %d", a,b,c);
	}
}
