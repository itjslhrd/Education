

import java.util.Scanner;
//[ 41 ] 2진 검색
public class Exam_41 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//배열에 임의의 데이터(10개) 저장(오름차순 정렬된 상태)
		int a[] = {10,22,35,40,56,60,77,80,90,95};
		
		System.out.print("검색할 값 입력");
		int k = scn.nextInt();
		
		int low = 0;//첫번 인덱스
		int high = 9;//마지막 인덱스(a.length-1)
		
		while(low <= high) {
			int mid = (low+high) / 2;
			if(k == a[mid]) {
				System.out.println(k + "값은 " + (mid+1) +"번째 있음");
				System.exit(0);//정상종료
			}else if(k > a[mid]) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		System.out.println("검색불가(없음)");
	}

}
