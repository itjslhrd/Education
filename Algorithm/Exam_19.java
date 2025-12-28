

import java.util.Scanner;

//[ 19 ] 최대값, 최소값(입력자료의 끝 -99) 알고리즘
public class Exam_19 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력");
		int a=scn.nextInt();
		int max=a;
		int min=a;
		
		while(true) {
			System.out.print("입력");
			a=scn.nextInt();
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
