

import java.util.Scanner;

//[ 22 ] 반복처리(1~100까지 홀수, 짝수 합 동시에 구하기)
public class Exam_22 {
	public static void main(String[] args) {
		int s=0,t=0,sw=0;
		for(int i=1; i<=100;i++) {
			if(sw==0) {
				//홀수합
				sw=1;
				s += i;
			}else {
				//짝수합
				sw=0;
				t += i;
			}
		}
		System.out.println("1~100 홀수합 : " + s);
		System.out.println("1~100 짝수합 : " + t);
	}
}
