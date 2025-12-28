

import java.util.Scanner;

//[ 10 ] S = +1-2+3-4+5-6+…-10 의 합계

public class Exam_10 {
	public static void main(String[] args) {
		int i=0;
		int s=0;
		int y=1;
		while(true){
			i++;//또는 i=i+1; 또는 i+=1;
			int m=i*y;
			s+=m;//s=s+m;
			if(i==10)
				break;
			y *= (-1);//y=y*(-1)
		}
		System.out.println("1-2+3-4+5 . . -10 합 : " + s);
	}
}
