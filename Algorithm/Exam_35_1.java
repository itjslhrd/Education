

import java.util.Scanner;
//[ 35 ] 10개의 정수가  배열에 저장되어 있을 경우  7에 가장 가까운 수 구하기
public class Exam_35_1 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {13,11,15,19,18,16,19,12,15,18};

		/*		//배열요소 출력시 사용
		System.out.print("배열요소 : ");
		for(int i=0; i<10; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
*/		
		int g = a[0];//7에 가장 가까운값 저장용
		int n = a[0];//최소값 저장용(7과의 거리 계산후)
		int m;//7과의 거리 저장용 (a[s]-7)
		for(int i=1; i<a.length;i++) {
			if(a[i]>7)
				m = a[i]-7;
			else
				m = 7-a[i];
			
			if(n>m) {
				n = m;
				g = a[i];
			}
		}
		System.out.print("7에 가장 가까운 값 :" + g);
	}
}
