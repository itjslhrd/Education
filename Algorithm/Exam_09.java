
import java.util.Scanner;

//[[ 9 ] 1+2+3+4+ . . .  + 10의 합

public class Exam_09 {
	public static void main(String[] args) {
		int i=0;
		int s=0;
		do {
			i++;//또는 i=i+1; 또는 i+=1;
			s+=i;//s=s+i;
		}while(i<10);
		System.out.println("1~10 합 : " + s);
	}
}
