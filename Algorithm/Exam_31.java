

import java.util.Scanner;

/*
  2~M까지 정수중에서 소수의 개수를 출력
 */
public class Exam_31 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력:");
		int m = scn.nextInt();
		int k=0;//소수 개수
		for(int i=2; i<=m; i++) {
			int j;
			for(j=2; j<i;j++) {
				if(i%j==0)
					break;
			}
			if(i==j) {
				System.out.print(i + " ");
				k++;
			}
		}
		System.out.println();
		System.out.printf("2~%d까지 소수 개수는 %d", m, k);
	}

}
