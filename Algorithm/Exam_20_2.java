

import java.util.Scanner;

//[ 20 ] 반복처리(1~100까지 짝수합)
//짝수만 출력 후 마지막에 합계 출력
public class Exam_20_2 {
	public static void main(String[] args) {
		int s=0;
		for(int i=2; i<=100; i+=2) {
			System.out.println(i);
			s +=i;//s=s+i;
		}
		System.out.print("1~100 짝수합 : " + s);
	}
}
