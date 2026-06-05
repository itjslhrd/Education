package day0605;

import java.util.Scanner;
class ProcessExam_01_3{
	public void precessMoney(int pay) {
		int money[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		for(int i=0; i<money.length; i++){
			System.out.printf("%-5d 원 :", money[i]);
			int mok = pay / money[i];
			System.out.printf("%3d\n", mok);
			pay %= money[i];
		}
	}
}
public class Exam_01_3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여(금액) : ");
		int pay = scn.nextInt();
		
		ProcessExam_01_3 e1 = new ProcessExam_01_3();
		e1.precessMoney(pay);
	}

}
