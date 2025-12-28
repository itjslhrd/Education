

import java.util.Scanner;

//[ 16 ] 약수구하기(약수는 자신이하의 자연수 중에서 자신을 나누었을 때 나머지가 0인 수)
public class Exam_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int n = scn.nextInt();
		int l=1;
		while(l<=n) {
			int m=n/l;//몫
			int g=n%l;//나머지
			if(g==0)
				System.out.print(l + " ");
			l++;//l=l+1
		}
		
	}
}
