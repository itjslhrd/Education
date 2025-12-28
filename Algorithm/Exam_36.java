

import java.util.Scanner;
//[ 36 ] 선택(Selection) 정렬

public class Exam_36 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {30,10,50,90,80,60,95,77,88,55};

		System.out.print("정렬 전 : ");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
		//선택정렬(오름차순)
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {//내림차순 a[i] < a[j]
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.print("정렬 후 : ");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
	}

}
