

import java.util.Scanner;

//[ 15 ] 임의의 값을 입력 받아 누적건수와 누적 합계 (입력값이 0이면 종료)
public class Exam_15 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i=0,s=0;
		while(true) {
			System.out.print("입력:");
			int a = scn.nextInt();
			if(a==0)
				break;
			i++;//i+=1;
			s+=a;//s=s+a;
		}
		System.out.println("데이터 수 : " + i);
		System.out.println("데이터 합 : " + s);
	}
}
