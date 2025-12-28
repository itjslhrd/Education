

import java.util.Scanner;

//[ 13 ] K= 1!+2!+3!+4!+5!+6!+7!+….10! 의 합계
public class Exam_13 {
	public static void main(String[] args) {
		int i=1;
		int j=1;
		int k=1;
		do{
			i++;//또는 i=i+1; 또는 i+=1;
			j*=i;//j=j*i;
			k+=j;//k=k+j;
		}while(i<10);
		
		System.out.println("1!+2!+3!..10! 합 : " + k);
	}
}
