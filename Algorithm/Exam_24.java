

import java.util.Scanner;

//[ 24 ] 하나정수를 입력 – 소수 판별 알고리즘

public class Exam_24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int a = scn.nextInt();
		int i;
		for(i=2; i<=a;i++) {
			int n = a%i;
			if(n==0)
				break;
		}
		if(a==i)
			System.out.printf("%d는 소수입니다" ,a);
		else
			System.out.printf("%d는 소수가 아님니다" ,a);
	}
}
