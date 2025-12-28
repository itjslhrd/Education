

import java.util.Scanner;
//[ 39 ] 삽입(Insertion) 정렬
public class Exam_39_1 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {30,10,50,90,80,60,95,77,88,55};

		System.out.print("정렬 전 : ");
		for(int i=0; i<a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
		//삽입(Insertion)정렬(오름차순)
		for(int i=1; i<a.length; i++) {
			int key = a[i];
			//int n = i-1;
			int j;
			for(j=i-1; j>=0; j--) {
				if(key < a[j])
					a[j+1] = a[j];
				else
					break;
			}
			a[j+1] = key;
		}
		
		System.out.print("정렬 후 : ");
		for(int i=0; i<a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
	}

}
