
//[ 50 ] 2차원 배열에 Data입력 - ㄹ 배열

/*
    1  2  3  4  5
   10  9  8  7  6
   11 12 13 14 15
   20 19 18 17 16
   21 22 23 24 25
*/

public class Exam_50 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 0; // 1 2 3 4 5 6 7 8 . . . 
		int l = 1;
		int m = 5;//5-1
		int n = 1;//증감용
		//입력
		for(int i=0; i<5; i++) {
			if(i%2==0) {
				for(int j=0; j<m; j++) {
					k++;
					a[i][j]=k;
				}
			}else {
				for(int j=m-1; j>=0; j--) {
					k++;
					a[i][j]=k;
				}				
			}
		}
		//출력-1
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
	}

}
