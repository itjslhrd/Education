

import java.util.Scanner;

//[ 14 ] T= 보나치수열(1+1+2+3+5+8+13+21+34)
public class Exam_14 {
	public static void main(String[] args) {
		int a=1, b=1;
		int t=2;
		while(true) {
			int c=a+b;
			t+=c;//t=t+c
			if(c==34)
				break;
			a=b;
			b=c;
		}
		System.out.print("피보나치 수열 합 :" + t);
	}
}
