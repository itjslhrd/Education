

import java.util.Scanner;

//[ 17 ] 최대공약수, 최소공배수 알고리즘

public class Exam_17 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 A :");
		int a = scn.nextInt();
		System.out.print("입력 B :");
		int b = scn.nextInt();
		//대소문자 구분
		int L=a, S=b;
		while(true) {
			int n = L % S;
			if(n==0)
				break;
			L=S;
			S=n;
		}
		int GCM = S;
		int LCM = a*b/GCM;
		System.out.println("GCM(최대공약수) : " + GCM);
		System.out.println("LCM(최대공배수) : " + LCM);
		
	}
}
