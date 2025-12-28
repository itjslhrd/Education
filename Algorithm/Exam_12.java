

import java.util.Scanner;

//[ 12 ] K= 1+2+4+7+11+16+22 의 합계

public class Exam_12 {
	public static void main(String[] args) {
		int i=0;
		int j=1;
		int k=1;
		do{
			i++;//또는 i=i+1; 또는 i+=1;
			j+=i;//j=j+i;
			k+=j;//k=k+j;
		}while(j<22);
		
		System.out.println("1+2+4+7+11+16+22 합 : " + k);
	}
}
