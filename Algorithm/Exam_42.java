

import java.util.Scanner;
//[ 42 ] 10진수를 2진수로 변환
public class Exam_42 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a[] = new int[10];
		int i = 0;//인덱스용

		System.out.print("10진수 입력:");
		int n = scn.nextInt();
		
		while(n !=0) {//(n>=0)
			int m = n / 2;//몫
			int g = n % 2;//나머지
			a[i] = g;
			n = m;
			i++;
		}
		
		//출력
		System.out.print("2진수 : ");
		for(int j = i; j>=0; j--) {
			System.out.print(a[j]+" ");
		}
		
	}

}
