

import java.util.Scanner;
//[ 32 ] 1차원 배열 10개를 선언하여 Data를 입력 받아 배열에 저장 후 배열 내용 출력하기
public class Exam_32 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a[] = new int[10];
		int i=0;
		//입력
		for(int j=0; j<10;j++) {
			System.out.print("입력:");
			a[j] = scn.nextInt();
		}
		//출력
		System.out.print("배열요소 출력 : ");
		do {
			System.out.printf("%4d", a[i]);
			i++;
		}while(i<10);
	}

}
