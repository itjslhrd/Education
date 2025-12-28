

import java.util.Scanner;

//[[ 7 ] 세개의 정수를 입력 받아 대, 중, 소 찾아 출력하는 알고리즘
//(단, 동일한 값은 없다.)

public class Exam_07 {
	public static void main(String[] args) {
		//키보드 입력
		Scanner scn = new Scanner(System.in);
		System.out.print("값입력:");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int max;//최대
		int med;//중간
		int min;//최소
		
		if(a>b) {
			if(a>c) {
				max=a;
				if(b>c) {
					med=b;
					min=c;
				}else {
					med=c;
					min=b;
				}
			}else {
				max=c;
				med=a;
				min=b;
			}
		}else if(b>c) {
			max=b;
			if(a>c) {
				med=a;
				min=c;
			}else {
				med=c;
				min=a;
			}
		}else {
			max=c;
			med=b;
			min=a;
		}
		
		System.out.printf("MAX : %d, MED : %d, MIN : %d", max,med,min);
	}
}
