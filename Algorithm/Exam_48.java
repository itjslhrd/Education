
//[ 48 ] 2차원 배열에 Data입력

/*
   1
   3  2
   6  5  4
  10  9  8  7
  15 14 13 12 11
*/

public class Exam_48 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k=0;
		//입력
		for(int i=0; i<5; i++) {
			for(int j=i; j>=0; j--) {
				k++;
				a[i][j]=k;
			}
		}
		//출력-1
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}

		//출력-2
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++) {
				if(a[i][j]==0)
					System.out.printf("%3s"," ");
				else
					System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
		
	}

}
