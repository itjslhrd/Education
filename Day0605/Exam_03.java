import java.util.Scanner;
class ProcessExam_03{
	public void ProcessBinaryArray(int val) {
		int bin[] = new int[10];
		System.out.println("10 진수 : " + val);
		int cnt=0;
		while(val != 0) {
			int mok = val / 2;
			bin[cnt] = val % 2;
			val = mok;
			cnt++;
		}
		System.out.print("2진수 : ");
		for(int x=cnt-1; x>=0; x--) {
			System.out.print(bin[x]);
		}
	}
}
public class Exam_03 {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("10진수 입력 :");
        int dec = scn.nextInt();          

        ProcessExam_03 ex03 = new ProcessExam_03();
        ex03.ProcessBinaryArray(dec);
	}

}
