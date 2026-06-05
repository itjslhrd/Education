package day0605;

import java.util.Scanner;
class ProcessExam_01_2{
	public void precessMoney(int pay) {
		int money = 50000;
		boolean flag = true;
		while(pay !=0) {
			System.out.printf("%-5d 원 :", money);
			int mok = pay / money;
			System.out.printf("%3d\n", mok);
			pay %= money;
			if(flag) {
				money /= 5;
				flag=false;
			}else {
				money /= 2;
				flag=true;
			}
		}
	}
}
public class Exam_01_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여(금액) : ");
		int pay = scn.nextInt();
		
		ProcessExam_01_2 e1 = new ProcessExam_01_2();
		e1.precessMoney(pay);
	}

}
