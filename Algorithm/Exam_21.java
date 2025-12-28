

import java.util.Scanner;

//[ 21 ] 약수구하기(약수는 자신이하의 자연수 중에서 자신을 나누었을 때 나머지가 0인 수)
public class Exam_21 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력");
		int n=scn.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				System.out.print(i + " ");
		}
	}
}
