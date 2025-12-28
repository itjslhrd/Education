
//[ 51 ] 2차원 배열에 Data입력 - 달팽이 배열

/*
1                25
2  8          20 26
3  9 13    17 21 27
4 10 14 16 18 22 28
5 11 15    19 23 29
6 12          24 30
7                31
*/

public class Exam_52 {
	public static void main(String[] args) {
		int a[][]=new int[7][7];
		int cnt=0;
		int m=a.length/2;
		for(int x=0; x<a.length;x++) {
		     int s, f;
		     if(x<m) {
		         s=x;
		         f=a.length-x-1;
		     }else {
		          s=a.length-x-1;
		          f=x;
		     }
		     for(int y=s; y<=f;y++) {
		          cnt++;
		          a[y][x]=cnt;
		     }
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
