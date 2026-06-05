package day0605;

import java.util.Scanner;
class ProcessExam_01_1{
	public void precessMoney(int pay) {
		int money = 50000;
		for(int i=1; i<=10; i++) {
			System.out.printf("%-5d 원 :", money);
			int mok = pay / money;
			System.out.printf("%3d\n", mok);
			pay %= money;
			if(i%2==1)
				money /= 5;
			else
				money /= 2;
		}
	}
}
public class Exam_01_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여(금액) : ");
		int pay = scn.nextInt();
		
		ProcessExam_01_1 e1 = new ProcessExam_01_1();
		e1.precessMoney(pay);
	}

}
