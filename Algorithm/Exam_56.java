
//1!+2!+3!+4!+5!+6!+7!+….10! 의 합계
public class Exam_56 {

	public static void main(String[] args) {
		System.out.println(func(10));

	}
	public static int func(int num) {
        if(num==1)
             return 1;
        return num * func(num-1);
   }

}
