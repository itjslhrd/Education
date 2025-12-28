
//[ 51 ] 2차원 배열에 Data입력 - 달팽이

/*
    1  2  3  4  5
   16 17 18 19  6
   15 24 25 20  7
   14 23 22 21  8
   13 12 11 10  9
*/

public class Exam_51 {
	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int k = 0; // 1 ~ 25 만들기
		int i = 0;
		int j = -1;
		int c = 1;//부호변환
		int f = a.length;//배열길이
		while(true){
		     for(int n=0;n<f;n++){
		          k++;
		          j=j+c;
		          a[i][j]=k;
		     }
		     f=f-1;
		     if(f<=0)
		    	 break;
		     for(int n=0;n<f;n++){
		          k++;
		          i=i+c;
		          a[i][j]=k;
		     }
		     c = c*(-1);
		}
		
		//출력-1
		for(int x=0; x<a.length; x++) {
			for(int y=0; y<a[x].length;y++) {
				System.out.printf("%3d",a[x][y]);
			}
			System.out.println();
		}
		
	}

}
