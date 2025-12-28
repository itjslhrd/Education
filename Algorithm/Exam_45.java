
//[ 45 ] 2차원 배열에 Data입력 - 세로
/*
     1  6  11  16  21
     2  7  12  17  22
     3  8  13  18  23
     4  9  14  19  24
     5 10  15  20  25
 */
public class Exam_45 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k=0;
		//입력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				k++;
				a[j][i]=k;
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
