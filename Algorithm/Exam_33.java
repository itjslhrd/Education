

import java.util.Scanner;
//[ 33 ]  10개의 정수가 저장된 배열에서 총점, 평균을 구하여 출력 
public class Exam_33 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {30,10,50,90,80,60,70,20,55,88};
		int s=0;
		System.out.print("배열요소 : ");//생략가능
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", a[i]);//생략가능
			s += a[i];//합계
		}
		System.out.println();
		System.out.println("합계:" + s);
		System.out.println("평균:" + (double)s/10);
		// 평균계산
		//System.out.println("평균:" + (double)s/a.length);
	}

}
