
//1!+2!+3!+4!+5!+6!+7!+….10! 의 합계
public class Exam_56_1 {

	public static void main(String[] args) {
		System.out.println(func(10));

	}
	public static int func(int num) {
        if(num==1)
             return 1;
        int t = num*func(num-1);
        System.out.printf("%d! : %d\n", num, t);

        return t;
   }

}
