

import java.util.Scanner;
//[ 40] 순위(석차)구하기 
public class Exam_40_1 {
	public static void main(String[] args) {
		//배열에 임의의 데이터(10개) 저장
		int a[] = {30,10,50,90,80,60,95,77,88,55};
		int b[] = new int[10];//순위저장용
		//int b[] = new int[a.length];//순위저장용
		
		//순위 구하기
		for(int i=0; i<a.length; i++) {
			int rank=1;//자신은 1등이라는 전제하에
			for(int j=0; j<a.length; j++) {
				if(a[i] < a[j])
					//나(i)보다 상대(j) 값이 크면 석차 증가
					rank++;
			}
			b[i] = rank;
		}
		
		System.out.print("점수 : ");
		for(int i=0; i<a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
		System.out.print("순위 : ");
		for(int i=0; i<b.length; i++) {
			System.out.printf("%4d", b[i]);
		}
		System.out.println();
		
	}

}
