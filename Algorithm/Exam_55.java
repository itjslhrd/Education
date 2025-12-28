
//1부터 n까지 합을 구하는 함수를 구현

public class Exam_55 {
	public static void main(String[] args) {
        System.out.println("1~10 합 : " + sum(10));
	}
	
	public static int sum(int num) {
        if(num==1)
             return 1;
        return num + sum(num-1);
   }

}
