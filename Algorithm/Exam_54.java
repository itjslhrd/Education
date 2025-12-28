

public class Exam_54 {
	public static void main(String[] args) {
		int[] ma = {100,200,300,400,500,600,700,999};
		int[] tr = {150,200,350,370,450,590,600,800,850,900,999};
		int[] nm = new int[ma.length+tr.length];
		
		int m1=0,t1=0,n1=0;
		while(ma[m1]<999 || tr[t1]<999) {
			if(ma[m1]>tr[t1]) {
				nm[n1]=tr[t1];
				t1++;
				n1++;
			}else if(ma[m1]<tr[t1]) {
				nm[n1]=ma[m1];
				m1++;
				n1++;
			}else {
				nm[n1]=tr[t1];
				m1++;
				t1++;
				n1++;
			}
		}
		System.out.print("MA :");
		for(int x=0; x<ma.length;x++) {
			System.out.print(ma[x]+"\t");
		}
		System.out.println();
		System.out.print("TA :");
		for(int x=0; x<tr.length;x++) {
			System.out.print(tr[x]+"\t");
		}
		System.out.println();
		//병합후 출력
		System.out.print("NM :");
		for(int x=0; x<nm.length;x++) {
			if(nm[x]==0)
				break;
			System.out.print(nm[x]+"\t");
		}
		System.out.println();

	}

}
