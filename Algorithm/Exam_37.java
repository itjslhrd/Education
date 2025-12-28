

import java.util.Scanner;
//[ 37 ] 거품(Bubble) 정렬
public class Exam_37 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {30,10,50,90,80,60,95,77,88,55};

		System.out.print("정렬 전 : ");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
		//거품(Bubble)정렬(오름차순)
		for(int i=0; i<a.length-1; i++) {
			int n = a.length-i-1;
			for(int j=0; j<n; j++) {
				if(a[j] > a[j+1]) {//내림차순 a[j] < a[j+1]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
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
