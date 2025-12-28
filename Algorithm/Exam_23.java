

import java.util.Scanner;

//[ 23 ] 반복처리(1~100까지 홀수, 짝수 합 동시에 구하기)
public class Exam_23 {
	public static void main(String[] args) {
		int s=0,t=0;
		for(int i=1; i<=100;i++) {
			if(i%2==1) {
				//홀수합
				s += i;
			}else {
				//짝수합
				t += i;
			}
		}
		System.out.println("1~100 홀수합 : " + s);
		System.out.println("1~100 짝수합 : " + t);
	}
}
