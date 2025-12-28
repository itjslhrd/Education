
//[ 43 ] 2차원 배열에 Data입력 - 행 합계
/*
     1  2  3  4 10
     5  6  7  8 26
     9 10 11 12 42
    13 14 15 16 58
    17 18 19 20 74
 */
public class Exam_43 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k=0;
		for(int i=0; i<5; i++) {
			a[i][4] = 0;
			for(int j=0; j<4; j++) {
				k++;
				a[i][j]=k;
				a[i][4] += k;
			}
		}
		//출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}

	}

}
