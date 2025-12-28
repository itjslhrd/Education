
import java.util.Scanner;

//[ 11 ] S = +1-2+3-4+5-6+…-10 의 합계

public class Exam_11 {
	public static void main(String[] args) {
		int i=0;
		int s=0;
		int sw=0;
		do{
			i++;//또는 i=i+1; 또는 i+=1;
			if(sw==0) {
				s+=i;//s=s+i;
				sw=1;
			}else {
				s-=i; //s=s-i;
				sw=0;
			}
		}while(i<10);
		
		System.out.println("1-2+3-4+5 . . -10 합 : " + s);
	}
}
