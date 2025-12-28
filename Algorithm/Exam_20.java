

import java.util.Scanner;

//[ 20 ] 반복처리(1~100까지 합)

public class Exam_20 {
	public static void main(String[] args) {
		int s=0;
		for(int i=1; i<=100; i++) {
			s +=i;//s=s+i;
		}
		System.out.print("1~100 합 : " + s);
	}
}
