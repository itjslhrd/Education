

import java.util.Scanner;
//[ 34 ]  10개의 정수가 저장된 배열에서 최대값, 최소값을 구하여 출력 

public class Exam_34 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {30,10,50,90,80,60,70,20,55,88};
		int max=a[0];
		int min=a[0];
/*		//배열요소 출력시 사용
		System.out.print("배열요소 : ");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
*/		
		for(int i=1; i<a.length;i++) {//for(int i=1; i<10;i++)
			if(max < a[i])
				max = a[i];
			else if(min > a[i])
				min = a[i];
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
	}

}
