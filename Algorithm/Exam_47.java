
//[ 47 ] 2차원 배열에 Data입력

/*
             1
          2  3
       4  5  6
    7  8  9 10
11 12 13 14 15
*/

public class Exam_47 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k=0;
		//입력
		for(int i=0; i<5; i++) {
			for(int j=4-i; j<5; j++) {
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
