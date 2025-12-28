

import java.util.Scanner;

//[ 18 ] 최대값, 최소값(입력자료의 끝 -99) 알고리즘
public class Exam_18 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int max=0;
		int min=999;
		
		while(true) {
			System.out.print("입력");
			int a=scn.nextInt();
			if(a==-99)
				break;
			if(max < a)
				max=a;
			if(min > a)
				min=a;
		}
		System.out.print("max : " + max);
		System.out.print("min : " + min);
	}
}
